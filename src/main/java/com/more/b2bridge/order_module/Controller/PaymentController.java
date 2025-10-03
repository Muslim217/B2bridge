package com.more.b2bridge.order_module.Controller;

import com.more.b2bridge.order_module.Service.OrderService;
import com.more.b2bridge.order_module.Service.PaymentService;
import com.more.b2bridge.order_module.model.Order;
import com.more.b2bridge.order_module.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping
    public Payment createPayment (@RequestBody Payment payment)
    {
        return paymentService.createPayment(payment);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long id){
        return paymentService.getPayment(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable Long id){
        if (paymentService.getPayment(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        paymentService.deletePayment(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Payment> updatePayment(@PathVariable Long id, @RequestBody Payment payment){
        if(paymentService.getPayment(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        payment.setId(id);
        Payment updatedPayment = paymentService.updatePayment(payment);
        return ResponseEntity.ok(updatedPayment);
    }}
