package com.lucashazardous.pizza_application.remote.rest.dto.response;

import java.util.List;

public class MenuDto {
    private List<PizzaDto> pizzas;

    public MenuDto() {

    }

    public List<PizzaDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaDto> pizzas) {
        this.pizzas = pizzas;
    }

    public MenuDto(List<PizzaDto> pizzas) {
        this.pizzas = pizzas;
    }

}
