package com.moviebooking.service.interfaces;

import com.moviebooking.dto.post.PostPaymentDto;
import com.moviebooking.entity.Payment;

public interface PaymentService {
    Payment createPayment(PostPaymentDto postPaymentDto);
}
