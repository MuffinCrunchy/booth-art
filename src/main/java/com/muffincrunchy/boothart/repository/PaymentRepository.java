package com.muffincrunchy.boothart.repository;

import com.muffincrunchy.boothart.model.constant.PaymentType;
import com.muffincrunchy.boothart.model.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {

    Optional<Payment> findByPayment(PaymentType paymentType);
}
