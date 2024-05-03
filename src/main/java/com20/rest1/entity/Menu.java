package com20.rest1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "menus")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    String name;
    String image;
    BigDecimal price;
    String description;
    boolean isVegetarian;
    @ManyToMany(mappedBy = "menus")
    private List<Check> checks;
    @ManyToOne
    private Subcategory subcategory;
    @OneToOne
    private StopList stopList;
    @ManyToOne
    private Restaurant restaurant;

}
