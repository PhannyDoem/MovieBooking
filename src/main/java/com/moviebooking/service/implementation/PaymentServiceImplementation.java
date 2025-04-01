package com.moviebooking.service.implementation;

import com.moviebooking.dto.post.PostPaymentDto;
import com.moviebooking.entity.Payment;
import com.moviebooking.mapper.PaymentMapper;
import com.moviebooking.repository.PaymentRepository;
import com.moviebooking.service.interfaces.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImplementation implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final PaymentMapper paymentMapper;

    public PaymentServiceImplementation(PaymentRepository paymentRepository, PaymentMapper paymentMapper) {
        this.paymentRepository = paymentRepository;
        this.paymentMapper = paymentMapper;
    }

    @Override
    public Payment createPayment(PostPaymentDto postPaymentDto) {
        Payment payment = paymentMapper.postToPayment(postPaymentDto);
        return paymentRepository.save(payment);
    }
}
