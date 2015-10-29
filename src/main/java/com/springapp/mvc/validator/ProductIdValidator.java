package com.springapp.mvc.validator;

/**
 * Created by Krystian on 2015-10-29.
 */
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.springapp.mvc.domain.Product;
import com.springapp.mvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;


public class ProductIdValidator implements
        ConstraintValidator<ProductId, String>{
    @Autowired
    private ProductService productService;
    public void initialize(ProductId constraintAnnotation) {
    }
    public boolean isValid(String value,ConstraintValidatorContext
            context) {
        Product product;
        try {
            product = productService.getProductById(value);
        } catch (ProductNotFoundException e) {
            return true;
        }
        if(product!= null) {
            return false;
        }
        return true;
    }
}