package com.muffincrunchy.boothart.model.entity;

import com.muffincrunchy.boothart.model.constant.ItemCategory;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private ItemCategory category;
}
