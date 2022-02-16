package com.lucashazardous.pizza_application.remote.rest.dto.response;

import com.lucashazardous.pizza_application.domain.model.SizeType;

import java.math.BigDecimal;

public class SizeDto {
    private Integer id;
    private SizeType size;
    private BigDecimal price;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public SizeType getSize() {
        return size;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public SizeDto(Integer id, SizeType size, BigDecimal price) {
        this.id = id;
        this.size = size;
        this.price = price;
    }
}
