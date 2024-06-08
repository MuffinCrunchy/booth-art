package com.muffincrunchy.boothart.model.entity;

import com.muffincrunchy.boothart.model.constant.ItemType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ItemType type;
}
