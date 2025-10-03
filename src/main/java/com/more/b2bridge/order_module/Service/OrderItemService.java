package com.more.b2bridge.order_module.Service;

import com.more.b2bridge.order_module.model.OrderItem;
import com.more.b2bridge.order_module.repo.OrderItemRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderItemService {

    private OrderItemRepo orderItemRepo;
    public OrderItem createOrderItem(OrderItem orderItem){
        return orderItemRepo.save(orderItem);
    }

    public Optional<OrderItem> getOrderItem(Long id){
        return orderItemRepo.findById(id);
    }

    public List<OrderItem> getAllOrderItems(){
        return orderItemRepo.findAll();

    }

    public OrderItem updateOrderItem (OrderItem orderItem){
        return orderItemRepo.save(orderItem);
    }

    public void deleteOrderItem(Long id){
        orderItemRepo.deleteById(id);
    }

}

