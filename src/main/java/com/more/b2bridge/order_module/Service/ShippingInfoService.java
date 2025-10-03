package com.more.b2bridge.order_module.Service;

import com.more.b2bridge.order_module.model.ShippingInfo;
import com.more.b2bridge.order_module.repo.ShippingInfoRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShippingInfoService {
    private ShippingInfoRepo shippingInfoRepo;

    public ShippingInfo createShippingInfo(ShippingInfo shippingInfo){
        return shippingInfoRepo.save(shippingInfo);
    }

    public Optional<ShippingInfo> getShippingInfo(Long id){
        return shippingInfoRepo.findById(id);
    }

    public List<ShippingInfo> getAllShippingInfos(){
        return shippingInfoRepo.findAll();

    }

    public ShippingInfo updateShippingInfo (ShippingInfo shippingInfo){
        return shippingInfoRepo.save(shippingInfo);
    }

    public void deleteShippingInfo(Long id){
        shippingInfoRepo.deleteById(id);
    }
}
