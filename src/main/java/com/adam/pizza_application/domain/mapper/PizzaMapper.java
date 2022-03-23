package com.adam.pizza_application.domain.mapper;

import com.adam.pizza_application.data.entity.pizza.PizzaEntity;
import com.adam.pizza_application.remote.rest.dto.request.AddPizzaDto;
import org.springframework.stereotype.Component;

@Component
public class PizzaMapper {

    public PizzaEntity mapToPizzaEntity(AddPizzaDto addPizzaDto) {
        PizzaEntity pizzaEntity = new PizzaEntity();
        pizzaEntity.setName(addPizzaDto.getName());
        return pizzaEntity;
    }
}
