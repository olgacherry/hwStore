package com.store.demo.controller;

import com.store.demo.Basket.Basket;
import com.store.demo.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final BasketService basketService;
    public OrderController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public Set<Integer>add(@RequestParam List<Integer>ids){
        return basketService.add(ids);
    }
    @GetMapping("/get")
    public Set<Integer>get(){
        return basketService.get();
    }
}
