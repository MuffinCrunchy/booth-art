package com.muffincrunchy.boothart.service;

import com.muffincrunchy.boothart.model.constant.ItemType;
import com.muffincrunchy.boothart.model.entity.Type;

import java.util.List;

public interface TypeService {

    Type getOrSave(ItemType itemType);
    List<Type> getAll();
}
