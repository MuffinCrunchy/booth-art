package com.muffincrunchy.boothart.service;

import com.muffincrunchy.boothart.model.dto.request.CreateTransactionRequest;
import com.muffincrunchy.boothart.model.dto.response.TransactionResponse;
import com.muffincrunchy.boothart.model.entity.Transaction;

import java.util.List;

public interface TransactionService {

    List<TransactionResponse> getAllTransactions();
    TransactionResponse createTransaction(CreateTransactionRequest request);
}
