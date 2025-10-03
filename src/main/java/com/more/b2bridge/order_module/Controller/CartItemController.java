package com.more.b2bridge.order_module.Controller;
import com.more.b2bridge.order_module.Service.CartItemService;
import com.more.b2bridge.order_module.model.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cartItems")
public class CartItemController {
    @Autowired
    private CartItemService cartItemService;

    @PostMapping
    public CartItem createCartItem (@RequestBody CartItem cartItem){
        return cartItemService.createCartItem(cartItem);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CartItem> getCartItem(@PathVariable Long id){
        return cartItemService.getCartItem(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<CartItem> getAllCartItems(){
        return cartItemService.getAllCartItems();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCartItem(@PathVariable Long id){
        if (cartItemService.getCartItem(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        cartItemService.deleteCartItem(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<CartItem> updateCartItem(@PathVariable Long id, @RequestBody CartItem cartItem){
        if(cartItemService.getCartItem(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        cartItem.setId(id);
        CartItem updatedCartItem = cartItemService.updateCartItem(cartItem);
        return ResponseEntity.ok(updatedCartItem);
    }
}
