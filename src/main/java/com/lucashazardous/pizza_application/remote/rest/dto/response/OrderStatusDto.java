package com.lucashazardous.pizza_application.remote.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lucashazardous.pizza_application.domain.model.OrderStatusType;

import java.util.Date;

public class OrderStatusDto {
    private OrderStatusType status;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expectedAt;

    public OrderStatusDto() {}

    public OrderStatusDto(OrderStatusType status, Date updatedAt, Date expectedAt) {
        this.status = status;
        this.updatedAt = updatedAt;
        this.expectedAt = expectedAt;
    }
}
