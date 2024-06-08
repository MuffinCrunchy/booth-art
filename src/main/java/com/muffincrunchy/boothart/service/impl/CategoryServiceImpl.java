package com.muffincrunchy.boothart.service.impl;

import com.muffincrunchy.boothart.model.constant.ItemCategory;
import com.muffincrunchy.boothart.model.entity.Category;
import com.muffincrunchy.boothart.repository.CategoryRepository;
import com.muffincrunchy.boothart.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category getOrSave(ItemCategory itemCategory) {
        return categoryRepository.findByCategory(itemCategory).orElseGet(() -> categoryRepository.saveAndFlush(Category.builder().category(itemCategory).build()));
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
