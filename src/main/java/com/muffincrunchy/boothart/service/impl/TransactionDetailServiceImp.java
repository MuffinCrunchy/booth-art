package com.muffincrunchy.boothart.service.impl;

import com.muffincrunchy.boothart.model.entity.TransactionDetail;
import com.muffincrunchy.boothart.repository.TransactionDetailRepository;
import com.muffincrunchy.boothart.service.TransactionDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TransactionDetailServiceImp implements TransactionDetailService {

    private final TransactionDetailRepository transactionDetailRepository;

    @Override
    public List<TransactionDetail> createBulk(List<TransactionDetail> transactionDetails) {
        List<TransactionDetail> transactionDetailList = new ArrayList<>();
        for (TransactionDetail transactionDetail : transactionDetails) {
            transactionDetailRepository.createTransactionDetail(
                    transactionDetail.getId(),
                    transactionDetail.getTransaction().getId(),
                    transactionDetail.getMerch().getId(),
                    transactionDetail.getShipment().getId(),
                    transactionDetail.getMerchPrice(),
                    transactionDetail.getShipmentFee(),
                    transactionDetail.getQty(),
                    transactionDetail.getPayment().getId()
            );
            transactionDetailList.add(transactionDetail);
        }
        return transactionDetailList;
    }
}
