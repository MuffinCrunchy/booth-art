package com.muffincrunchy.boothart.repository;

import com.muffincrunchy.boothart.model.constant.ItemCategory;
import com.muffincrunchy.boothart.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

    Optional<Category> findByCategory(ItemCategory itemCategory);
}
