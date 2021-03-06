package com.adam.pizza_application.data.entity.size;

import com.adam.pizza_application.data.entity.order.OrderEntity;
import com.adam.pizza_application.data.entity.ordersize.OrderSizeEntity;
import com.adam.pizza_application.data.entity.pizza.PizzaEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "order_sizes")
public class SizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "size_type")
    private String sizeType;

    @Column(name = "price_base")
    private BigDecimal priceBase;
    @Column(name = "pizza_id")
    private Integer pizzaId;

    @OneToMany(mappedBy = "size")
    private Set<OrderSizeEntity> orderSizes;
    @ManyToOne
    @JoinColumn(name = "pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizza;

    public void setSizeType(String sizeType) {
        this.sizeType = sizeType;
    }

    public void setPriceBase(BigDecimal priceBase) {
        this.priceBase = priceBase;
    }

    public void setPizzaId(Integer pizzaId) {
        this.pizzaId = pizzaId;
    }

    public Integer getId() {
        return id;
    }

    public String getSizeType() {
        return sizeType;
    }

    public BigDecimal getPriceBase() {
        return priceBase;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
