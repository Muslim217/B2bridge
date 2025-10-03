package com.more.b2bridge.order_module.Service;

import com.more.b2bridge.order_module.model.Order;
import com.more.b2bridge.order_module.repo.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderService {
    private OrderRepo orderRepo;
    public Order createOrder(Order order){
        return orderRepo.save(order);
    }

    public Optional<Order> getOrder(Long id){
        return orderRepo.findById(id);
    }

    public List<Order> getAllOrders(){
        return orderRepo.findAll();

    }

    public Order updateOrder(Order order){
        return orderRepo.save(order);
    }

    public void deleteOrder(Long id){
        orderRepo.deleteById(id);
    }
}
