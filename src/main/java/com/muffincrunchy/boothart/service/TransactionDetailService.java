package com.muffincrunchy.boothart.service;

import com.muffincrunchy.boothart.model.entity.TransactionDetail;

import java.util.List;

public interface TransactionDetailService {

    List<TransactionDetail> createBulk(List<TransactionDetail> transactionDetails);
}
