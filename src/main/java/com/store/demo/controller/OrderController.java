package com.store.demo.controller;

import com.store.demo.service.Basket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final Basket basket;

    public OrderController(Basket basket) {
        this.basket = basket;
    }
    @GetMapping("/add")
    public Set<Integer>add(@RequestParam List<Integer>ids){
        return basket.add(ids);
    }
    @GetMapping("/get")
    public Set<Integer>get(){
        return basket.get();
    }
}
