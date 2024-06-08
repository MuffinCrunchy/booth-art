package com.muffincrunchy.boothart.service;

import com.muffincrunchy.boothart.model.constant.ItemCategory;
import com.muffincrunchy.boothart.model.entity.Category;

import java.util.List;

public interface CategoryService {

    Category getOrSave(ItemCategory itemCategory);
    List<Category> getAll();
}
