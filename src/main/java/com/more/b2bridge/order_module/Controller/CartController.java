package com.more.b2bridge.order_module.Controller;

import com.more.b2bridge.order_module.Service.CartService;
import com.more.b2bridge.order_module.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carts")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping
    public Cart createCart (@RequestBody Cart cart){
        return cartService.createCart(cart);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cart> getCart(@PathVariable Long id){
        return cartService.getCart(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Cart> getAllCarts(){
        return cartService.getAllCarts();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCart(@PathVariable Long id){
        if (cartService.getCart(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        cartService.deleteCart(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cart> updateCart(@PathVariable Long id, @RequestBody Cart cart){
        if(cartService.getCart(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        cart.setId(id);
        Cart updatedCart = cartService.updateCart(cart);
        return ResponseEntity.ok(updatedCart);
    }
}
