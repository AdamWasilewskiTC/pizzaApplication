package com.lucashazardous.pizza_application.remote.rest.api;

import com.lucashazardous.pizza_application.remote.rest.dto.request.AddPizzaDto;
import com.lucashazardous.pizza_application.remote.rest.dto.response.PizzaDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/pizzas", produces = APPLICATION_JSON_VALUE)
@RestController
public class PizzaController {

    @PostMapping
    public ResponseEntity<PizzaDto> addPizza(@RequestHeader("Access-Token") String token,
                                                @RequestBody AddPizzaDto addPizzaDto) {
        return ResponseEntity.ok(null);
    }

    @PutMapping("/{pizza-id}")
    public ResponseEntity<PizzaDto> updatePizza(@RequestHeader("Access-Token") String token,
                                                @PathVariable("pizza-id") Integer pizzaId,
                                                @RequestBody AddPizzaDto addPizzaDto) {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{pizza-id}")
    public ResponseEntity<Void> deletePizza(@RequestHeader("Access-Token") String token, @PathVariable("pizza-id") Integer pizzaId) {
        return ResponseEntity.ok().build();
    }
}