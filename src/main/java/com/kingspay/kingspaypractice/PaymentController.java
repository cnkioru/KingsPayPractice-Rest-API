
package com.kingspay.kingspaypractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @GetMapping
    public Map<String, Object> getPayments() {
        return Map.of(
                "paymentId", "KP1001",
                "amount", 250.00,
                "currency", "USD",
                "status", "SUCCESS",
                "message", "Payment processed successfully"
        );
    }
}
