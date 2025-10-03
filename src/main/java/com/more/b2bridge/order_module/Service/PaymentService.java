package com.more.b2bridge.order_module.Service;
import com.more.b2bridge.order_module.model.Payment;
import com.more.b2bridge.order_module.repo.PaymentRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PaymentService {
    private PaymentRepo paymentRepo;
    public Payment createPayment(Payment payment){
        return paymentRepo.save(payment);
    }

    public Optional<Payment> getPayment(Long id){
        return paymentRepo.findById(id);
    }

    public List<Payment> getAllPayments(){
        return paymentRepo.findAll();

    }

    public Payment updatePayment (Payment payment){
        return paymentRepo.save(payment);
    }

    public void deletePayment(Long id){
        paymentRepo.deleteById(id);
    }
}
