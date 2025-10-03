package com.more.b2bridge.order_module.Controller;

import com.more.b2bridge.order_module.Service.PaymentService;
import com.more.b2bridge.order_module.Service.ShippingInfoService;

import com.more.b2bridge.order_module.model.Payment;
import com.more.b2bridge.order_module.model.ShippingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ShippingInfos")
public class ShippingInfoController {
    @Autowired
    private ShippingInfoService shippingInfoService;

    @PostMapping
    public ShippingInfo createShippingInfo(@RequestBody ShippingInfo shippingInfo) {
        return shippingInfoService.createShippingInfo(shippingInfo);

    }

    @GetMapping("/{id}")
    public ResponseEntity<ShippingInfo> getShippingInfo(@PathVariable Long id) {
        return shippingInfoService.getShippingInfo(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<ShippingInfo> getAllShippingInfos() {
        return shippingInfoService.getAllShippingInfos();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteShippingInfo(@PathVariable Long id) {
        if (shippingInfoService.getShippingInfo(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        shippingInfoService.deleteShippingInfo(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ShippingInfo> updateShippingInfo(@PathVariable Long id, @RequestBody ShippingInfo shippingInfo) {
        if (shippingInfoService.getShippingInfo(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        shippingInfo.setId(id);
        ShippingInfo updatedShippingInfo = shippingInfoService.updateShippingInfo(shippingInfo);
        return ResponseEntity.ok(updatedShippingInfo);
    }
}