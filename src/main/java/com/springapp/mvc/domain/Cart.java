package com.springapp.mvc.domain;

/**
 * Created by Krystian on 2015-10-30.
 */
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cart {

    private String cartId;
    private Map<String,CartItem> cartItems;
    private BigDecimal grandTotal;

    public Cart() {
        cartItems = new HashMap<String, CartItem>();
        grandTotal = new BigDecimal(0);
    }
    public Cart(String cartId) {
        this();
        this.cartId = cartId;
    }
    public String getCartId() {
        return cartId;
    }
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }
    public Map<String, CartItem> getCartItems() {
        return cartItems;
    }
    public void setCartItems(Map<String, CartItem> cartItems) {
        this.cartItems = cartItems;
    }
    public BigDecimal getGrandTotal() {
        return grandTotal;
    }
    public void addCartItem(CartItem item) {
        String productId = item.getProduct().getProductId();
        if(cartItems.containsKey(productId)) {
            CartItem existingCartItem = cartItems.get(productId);
            existingCartItem.setQuantity(existingCartItem.getQuantity()+
                    item.getQuantity());
            cartItems.put(productId, existingCartItem);
        } else {
            cartItems.put(productId, item);
        }
        updateGrandTotal();
    }

    public void removeCartItem(CartItem item) {
        String productId = item.getProduct().getProductId();
        cartItems.remove(productId);
        updateGrandTotal();
    }
    public void updateGrandTotal() {
        grandTotal= new BigDecimal(0);
        for(CartItem item : cartItems.values()){
            grandTotal = grandTotal.add(item.getTotalPrice());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cart)) return false;
        Cart cart = (Cart) o;
        return Objects.equals(cartId, cart.cartId) &&
                Objects.equals(cartItems, cart.cartItems) &&
                Objects.equals(grandTotal, cart.grandTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartId, cartItems, grandTotal);
    }
}
