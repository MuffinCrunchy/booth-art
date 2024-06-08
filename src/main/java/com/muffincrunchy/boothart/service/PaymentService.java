package com.muffincrunchy.boothart.service;

import com.muffincrunchy.boothart.model.constant.PaymentType;
import com.muffincrunchy.boothart.model.entity.Payment;

import java.util.List;

public interface PaymentService {

    Payment getOrSave(PaymentType paymentType);
    List<Payment> getAll();
}
