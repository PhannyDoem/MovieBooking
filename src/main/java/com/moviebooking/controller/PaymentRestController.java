package com.moviebooking.controller;

import com.moviebooking.dto.post.PostPaymentDto;
import com.moviebooking.entity.Payment;
import com.moviebooking.service.implementation.PaymentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/values/v1")
public class PaymentRestController {
    private final PaymentServiceImplementation paymentServiceImplementation;


    @Autowired
    public PaymentRestController(PaymentServiceImplementation paymentServiceImplementation) {
        this.paymentServiceImplementation = paymentServiceImplementation;
    }

    @PostMapping("/payments")
    public ResponseEntity<Payment> createPayment(@RequestBody PostPaymentDto postPaymentDto) {
        Payment payment = paymentServiceImplementation.createPayment(postPaymentDto);
        return new ResponseEntity<>(payment, HttpStatus.CREATED);
    }
}
