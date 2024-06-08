package com.muffincrunchy.boothart.service.impl;

import com.muffincrunchy.boothart.model.constant.PaymentType;
import com.muffincrunchy.boothart.model.entity.Payment;
import com.muffincrunchy.boothart.repository.PaymentRepository;
import com.muffincrunchy.boothart.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Override
    public Payment getOrSave(PaymentType paymentType) {
        return paymentRepository.findByPayment(paymentType).orElseGet(() -> paymentRepository.saveAndFlush(Payment.builder().payment(paymentType).build()));
    }

    @Override
    public List<Payment> getAll() {
        return paymentRepository.findAll();
    }
}
