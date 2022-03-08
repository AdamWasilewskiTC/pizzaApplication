package com.lucashazardous.pizza_application.data.entity.ordersize;

import com.lucashazardous.pizza_application.data.entity.pizza.PizzaEntity;

import javax.persistence.*;

@Entity
@Table(name = "sizes")
public class OrderSizeEntity {

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
    @JoinColumn(name = "pizza", insertable = false, updatable = false)
    private PizzaEntity pizza;

}
