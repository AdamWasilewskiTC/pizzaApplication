package com.adam.pizza_application.data.repository;

import com.adam.pizza_application.data.entity.size.SizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeRepository extends JpaRepository<SizeEntity, Integer> {

}
