package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vegetables", schema = "fsweb")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vegetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Vegetable name cannot be blank")
    private String name;

    @NotNull(message = "Vegetable price is required")
    @PositiveOrZero(message = "Vegetable price cannot be negative")
    private Double price;

    @Column(name = "is_grown_on_tree")
    private boolean grownOnTree;
}
