package com.adam.pizza_application.domain.mapper;

import com.adam.pizza_application.data.entity.size.SizeEntity;
import com.adam.pizza_application.domain.model.SizeType;
import com.adam.pizza_application.remote.rest.dto.request.AddSizeDto;
import com.adam.pizza_application.remote.rest.dto.response.SizeDto;
import org.springframework.stereotype.Component;

@Component
public class SizeMapper {
    public SizeEntity mapToSizeEntity(AddSizeDto addSizeDto, Integer pizzaId) {
        SizeEntity sizeEntity = new SizeEntity();
        sizeEntity.setSizeType(addSizeDto.getSize().name());
        sizeEntity.setPriceBase(addSizeDto.getPrice());
        sizeEntity.setPizzaId(pizzaId);
        return sizeEntity;
    }

    public SizeDto mapToSizeDto(SizeEntity sizeEntity) {
        SizeDto sizeDto = new SizeDto();
        sizeDto.setSize(SizeType.valueOf(sizeEntity.getSizeType()));
        sizeDto.setPrice(sizeEntity.getPriceBase());
        sizeDto.setId(sizeEntity.getId());
        return sizeDto;
    }
}