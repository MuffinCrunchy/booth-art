package com.muffincrunchy.boothart.service;

import com.muffincrunchy.boothart.model.dto.request.CreateCustomerRequest;
import com.muffincrunchy.boothart.model.dto.request.UpdateCustomerRequest;
import com.muffincrunchy.boothart.model.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAll();
    Customer getById(String id);
    Customer create(CreateCustomerRequest request);
    Customer update(UpdateCustomerRequest request);
    void delete(String id);
}
