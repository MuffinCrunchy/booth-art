package com.muffincrunchy.boothart.service;

import com.muffincrunchy.boothart.model.dto.request.CreateShipmentRequest;
import com.muffincrunchy.boothart.model.dto.request.UpdateShipmentRequest;
import com.muffincrunchy.boothart.model.entity.Shipment;

import java.util.List;

public interface ShipmentService {

    List<Shipment> getAll();
    Shipment getById(String id);
    Shipment create(CreateShipmentRequest request);
    Shipment update(UpdateShipmentRequest request);
    void delete(String id);
}
