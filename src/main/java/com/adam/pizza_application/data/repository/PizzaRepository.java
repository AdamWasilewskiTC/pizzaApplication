package com.adam.pizza_application.data.repository;

import com.adam.pizza_application.data.entity.pizza.PizzaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<PizzaEntity, Integer> {
}
