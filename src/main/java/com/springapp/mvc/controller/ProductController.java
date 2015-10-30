package com.springapp.mvc.controller;

import com.springapp.mvc.domain.Product;
import com.springapp.mvc.exception.ProductNotFoundException;
import com.springapp.mvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by Krystian on 2015-10-12.
 */
@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping
    public String list(Model model) {
//        Product iphone = new Product("P1234","iPhone 5s", new BigDecimal(500));
//        iphone.setDescription("Apple iPhone 5s smartphone with 4.00 - inch" +
//                "640x1136 display and 8-megapixel rear camera");
//        iphone.setCategory("Smart Phone");
//        iphone.setManufacturer("Apple");
//        iphone.setUnitsInStock(1000);
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/all")
    public String allProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/{category}")
    public String getProductsByCategory(Model model, @PathVariable("category") String productCategory) {
        model.addAttribute("products", productService.getProductsByCategory(productCategory));
        return "products";
    }

    @RequestMapping("/price")
    public String getProductsByPrice(@RequestParam("low") BigDecimal low, @RequestParam("high") BigDecimal high, Model model) {
        model.addAttribute("products", productService.getProductsByPriceFilter(low, high));
        return "products";
    }

    @RequestMapping("/filter/{ByCriteria}")
    public String getProductsByFilter(@MatrixVariable(pathVar =
            "ByCriteria") Map<String, List<String>> filterParams, Model model) {
        model.addAttribute("products",
                productService.getProductsByFilter(filterParams));
        return "products";
    }

    @RequestMapping("/product")
    public String getProductById(@RequestParam("id") String productId, Model model) {
        model.addAttribute("product", productService.getProductById(productId));
        return "product";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getAddNewProductForm(Model model) {
        Product newProduct = new Product();
        model.addAttribute("newProduct", newProduct);
        return "addProduct";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processAddNewProductForm(@ModelAttribute("newProduct")
                                               @Valid Product newProduct, BindingResult result, HttpServletRequest request) {

        if(result.hasErrors()) {
            return "addProduct";
        }
        String[] suppressedFields = result.getSuppressedFields();
        if (suppressedFields.length > 0) {
            throw new RuntimeException("Attempting to bind disallowed fields: "
                    + StringUtils.arrayToCommaDelimitedString(suppressedFields));
        }
        ////Adding image
        MultipartFile productImage = newProduct.getProductImage();
        String rootDirectory
                =request.getSession().getServletContext().getRealPath("/");
        if (productImage!=null && !productImage.isEmpty()) {
            try {
                productImage.transferTo(new File(rootDirectory+"resources\\images\\"+ newProduct.getProductId() + ".png"));
            } catch (Exception e) {
                throw new RuntimeException("Product Image saving failed",e);
            }
        }


        productService.addProduct(newProduct);
        return "redirect:/products";
    }

    @InitBinder
    public void initialiseBinder(WebDataBinder binder) {
        binder.setDisallowedFields("unitsInOrder");
        binder.setAllowedFields("productId", "name", "unitPrice", "description", "manufacturer",
                "category", "unitsInStock", "productImage", "productPDF");
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ModelAndView handleError(HttpServletRequest
                                            req,ProductNotFoundException exception) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("invalidProductId", exception.getProductId());
        mav.addObject("exception", exception);
        mav.addObject("url", req.getRequestURL() + "?" + req.getQueryString());
        mav.setViewName("productNotFound");
        return mav;
    }

}
