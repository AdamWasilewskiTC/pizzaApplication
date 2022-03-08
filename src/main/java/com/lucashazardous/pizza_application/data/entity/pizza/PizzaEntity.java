package com.lucashazardous.pizza_application.data.entity.pizza;

import com.lucashazardous.pizza_application.data.entity.size.SizeEntity;

import javax.persistence.*;

@Entity
@Table(name = "pizzas")
public class PizzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;


    @OneToMany(mappedBy = "pizza", orphanRemoval = true)
    private Set<SizeEntity> sizes;
}
