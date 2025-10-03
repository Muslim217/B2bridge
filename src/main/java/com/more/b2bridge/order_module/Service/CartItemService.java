package com.more.b2bridge.order_module.Service;

import com.more.b2bridge.order_module.model.CartItem;
import com.more.b2bridge.order_module.repo.CartItemRepo;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CartItemService {
    private CartItemRepo cartItemRepo;
    public CartItem createCartItem(CartItem cartItem){
        return cartItemRepo.save(cartItem);
    }

    public Optional<CartItem> getCartItem(Long id){
        return cartItemRepo.findById(id);
    }

    public List<CartItem> getAllCartItems(){
        return cartItemRepo.findAll();

    }

    public CartItem updateCartItem (CartItem cartItem){
        return cartItemRepo.save(cartItem);
    }

    public void deleteCartItem(Long id){
        cartItemRepo.deleteById(id);
    }

}

