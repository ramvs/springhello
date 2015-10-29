package com.springapp.mvc.exception;

/**
 * Created by Krystian on 2015-10-29.
 */
public class ProductNotFoundException extends RuntimeException {
    private static final long serialVersionUID =-694354952032299587L;
    private String productId;
    public ProductNotFoundException(String productId) {
        this.productId = productId;
    }
    public String getProductId() {
        return productId;
    }
}
