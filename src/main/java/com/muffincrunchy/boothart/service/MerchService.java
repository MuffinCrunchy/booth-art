package com.muffincrunchy.boothart.service;

import com.muffincrunchy.boothart.model.dto.request.CreateMerchRequest;
import com.muffincrunchy.boothart.model.dto.request.UpdateMerchRequest;
import com.muffincrunchy.boothart.model.entity.Merch;

import java.util.List;

public interface MerchService {

    List<Merch> getAll();
    Merch getById(String id);
    Merch create(CreateMerchRequest request);
    Merch update(UpdateMerchRequest request);
    void delete(String id);
}
