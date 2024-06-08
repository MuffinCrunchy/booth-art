package com.muffincrunchy.boothart.repository;

import com.muffincrunchy.boothart.model.constant.ItemType;
import com.muffincrunchy.boothart.model.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypeRepository extends JpaRepository<Type, String> {

    Optional<Type> findByType(ItemType itemType);
}
