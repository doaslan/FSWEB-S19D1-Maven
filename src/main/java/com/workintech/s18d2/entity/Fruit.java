package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fruits", schema = "fsweb")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Fruit name cannot be blank")
    private String name;

    @NotNull(message = "Fruit price is required")
    @PositiveOrZero(message = "Fruit price cannot be negative")
    private Double price;

    @NotNull(message = "Fruit type is required")
    @Enumerated(EnumType.STRING)
    private FruitType fruitType;
}
