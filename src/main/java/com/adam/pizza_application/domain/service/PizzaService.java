package com.adam.pizza_application.domain.service;


import com.adam.pizza_application.data.entity.pizza.PizzaEntity;
import com.adam.pizza_application.data.repository.PizzaRepository;
import com.adam.pizza_application.domain.mapper.PizzaMapper;
import com.adam.pizza_application.remote.rest.dto.request.AddPizzaDto;
import com.adam.pizza_application.remote.rest.dto.response.PizzaDto;
import org.springframework.stereotype.Service;

import static com.adam.pizza_application.domain.service.AuthorizationService.checkToken;

@Service
public class PizzaService {

    private final PizzaRepository pizzaRepository;
    private final PizzaMapper pizzaMapper;


    public PizzaService(PizzaRepository pizzaRepository, PizzaMapper pizzaMapper) {
        this.pizzaRepository = pizzaRepository;
        this.pizzaMapper = pizzaMapper;
    }

    public PizzaDto addPizza(AddPizzaDto addPizzaDto, String token) {
        //AuthorizationService.checkToken(token);
        checkToken(token);
//        if (token == null || !token.equals("xzv")) {
//            throw new UnauthorizedEception("Błędny token");
//        }
        PizzaEntity pizzaEntity = pizzaMapper.mapToPizzaEntity(addPizzaDto);
        pizzaRepository.save(pizzaEntity);

//        PizzaEntity pizzaEntity = new PizzaEntity();
//        pizzaEntity.setName(addPizzaDto.getName());
//        PizzaEntity savedPizzaEntity = pizzaRepository.save(pizzaEntity);

    }
}
