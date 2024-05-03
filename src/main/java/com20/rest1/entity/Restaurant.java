package com20.rest1.entity;

import com20.rest1.enums.RestType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String location;
    private RestType restType;
    private int numberOfEmployees;
    private int service;
    @OneToMany(mappedBy = "restaurant")
    private List<User> users;
    @OneToMany(mappedBy = "restaurant")
    private List<Menu> menus;


}
