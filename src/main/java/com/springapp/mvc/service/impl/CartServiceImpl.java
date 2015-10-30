package com.springapp.mvc.service.impl;

import com.springapp.mvc.domain.Cart;
import com.springapp.mvc.repository.CartRepository;
import com.springapp.mvc.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Krystian on 2015-10-30.
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;
    public Cart create(Cart cart) {
        return cartRepository.create(cart);
    }
    public Cart read(String cartId) {
        return cartRepository.read(cartId);
    }
    public void update(String cartId, Cart cart) {
        cartRepository.update(cartId, cart);
    }
    public void delete(String cartId) {
        cartRepository.delete(cartId);
    }
}
