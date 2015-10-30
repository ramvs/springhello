package com.springapp.mvc.repository;

import com.springapp.mvc.domain.Cart;

/**
 * Created by Krystian on 2015-10-30.
 */
public interface CartRepository {
    Cart create(Cart cart);
    Cart read(String cartId);
    void update(String cartId, Cart cart);
    void delete(String cartId);
}
