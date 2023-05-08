package com.store.demo.service.Impl;

import com.store.demo.Basket.Basket;
import com.store.demo.service.BasketService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BasketServiceImpl implements BasketService {
    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public Set<Integer> add(List<Integer> ids) {
        return basket.add(ids);
    }

    @Override
    public Set<Integer> get() {
        return basket.get();
    }
}
