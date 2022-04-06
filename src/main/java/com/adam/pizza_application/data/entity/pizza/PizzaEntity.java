package com.adam.pizza_application.data.entity.pizza;

import com.adam.pizza_application.data.entity.size.SizeEntity;

import javax.persistence.*;
import java.util.Set;

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

    public PizzaEntity(Integer id) {
        this.id = id;
    }

    public PizzaEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Set<SizeEntity> getSizes() {return sizes;
    }
}
