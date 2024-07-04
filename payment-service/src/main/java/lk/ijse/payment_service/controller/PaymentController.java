package lk.ijse.payment_service.controller;

import jakarta.validation.Valid;
import lk.ijse.payment_service.entity.Payment;
import lk.ijse.payment_service.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<Payment> registerVehicle(@RequestBody Payment payment) {
        return ResponseEntity.ok(paymentService.PaymentPlacePart2(payment));
    }

//    @PostMapping("/placePayment")
//    public Payment placePayment(@Valid @RequestBody Payment payment){
//        System.out.println("PaymentDTO = "+payment);
//        return paymentService.placePayment(payment);
//    }

    @GetMapping("/getAllPayments")
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }
}
