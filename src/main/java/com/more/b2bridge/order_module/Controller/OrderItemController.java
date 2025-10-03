package com.more.b2bridge.order_module.Controller;

import com.more.b2bridge.order_module.Service.OrderItemService;
import com.more.b2bridge.order_module.Service.OrderService;
import com.more.b2bridge.order_module.model.Order;
import com.more.b2bridge.order_module.model.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/OrderItems")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;

    @PostMapping
    public OrderItem createOrderItem (@RequestBody OrderItem orderItem)
    {
        return orderItemService.createOrderItem(orderItem);

    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderItem> getOrderItem(@PathVariable Long id){
        return orderItemService.getOrderItem(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems(){
        return orderItemService.getAllOrderItems();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id){
        if (orderItemService.getOrderItem(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        orderItemService.deleteOrderItem(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderItem> updateOrderItem(@PathVariable Long id, @RequestBody OrderItem orderItem){
        if(orderItemService.getOrderItem(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        orderItem.setId(id);
        OrderItem updatedOrderItem = orderItemService.updateOrderItem(orderItem);
        return ResponseEntity.ok(updatedOrderItem);
    }}
