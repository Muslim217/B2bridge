package com.more.b2bridge.order_module.Controller;

import com.more.b2bridge.order_module.Service.CartService;
import com.more.b2bridge.order_module.Service.OrderService;
import com.more.b2bridge.order_module.model.Cart;
import com.more.b2bridge.order_module.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order createOrder (@RequestBody Order order)
    {
        return orderService.createOrder(order);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable Long id){
        return orderService.getOrder(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id){
        if (orderService.getOrder(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        orderService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable Long id, @RequestBody Order order){
        if(orderService.getOrder(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        order.setId(id);
        Order updatedOrder = orderService.updateOrder(order);
        return ResponseEntity.ok(updatedOrder);
    }
}
