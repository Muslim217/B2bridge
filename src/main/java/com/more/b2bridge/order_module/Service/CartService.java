package com.more.b2bridge.order_module.Service;

import com.more.b2bridge.order_module.model.Cart;
import com.more.b2bridge.order_module.repo.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {
    @Autowired
    private CartRepo cartRepo;

    public Cart createCart(Cart cart){
        return cartRepo.save(cart);
    }

    public Optional<Cart> getCart(Long id){
        return cartRepo.findById(id);
    }

    public List<Cart> getAllCarts(){
        return cartRepo.findAll();

    }

    public Cart updateCart (Cart cart){
        return cartRepo.save(cart);
    }

    public void deleteCart(Long id){
        cartRepo.deleteById(id);
    }

}
