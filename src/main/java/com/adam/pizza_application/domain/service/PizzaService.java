package com.adam.pizza_application.domain.service;


import com.adam.pizza_application.data.entity.pizza.PizzaEntity;
import com.adam.pizza_application.data.entity.size.SizeEntity;
import com.adam.pizza_application.data.repository.PizzaRepository;
import com.adam.pizza_application.data.repository.SizeRepository;
import com.adam.pizza_application.domain.mapper.PizzaMapper;
import com.adam.pizza_application.domain.mapper.SizeMapper;
import com.adam.pizza_application.remote.rest.dto.request.AddPizzaDto;
import com.adam.pizza_application.remote.rest.dto.request.AddSizeDto;
import com.adam.pizza_application.remote.rest.dto.response.PizzaDto;
import com.adam.pizza_application.remote.rest.dto.response.SizeDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.adam.pizza_application.domain.service.AuthorizationService.checkToken;

@Service
public class PizzaService {

    private final SizeRepository sizeRepository;
    private final PizzaRepository pizzaRepository;
    private final PizzaMapper pizzaMapper;
    private final SizeMapper sizeMapper;



    public PizzaService(PizzaRepository pizzaRepository, SizeRepository sizeRepository, PizzaMapper pizzaMapper, SizeMapper sizeMapper) {

        this.pizzaRepository = pizzaRepository;
        this.sizeRepository = sizeRepository;
        this.pizzaMapper = pizzaMapper;
        this.sizeMapper = sizeMapper;

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

        List<AddSizeDto> addSizeDtoList = addPizzaDto.getSizes();
        List<SizeEntity> sizeEntities = addSizeDtoList
        .stream()
        .map(addSizeDto -> sizeMapper.mapToSizeEntity(addSizeDto, pizzaEntity.getId()))
                .collect(Collectors.toList());
        sizeRepository.saveAll(sizeEntities);

        List<SizeDto> sizeDtoList = sizeEntities
                .stream()
                .map(sizeEntity -> sizeMapper.mapToSizeDto(sizeEntity))
                .collect(Collectors.toList());


    }
}
