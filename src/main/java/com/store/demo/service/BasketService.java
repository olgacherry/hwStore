package com.store.demo.service;

import java.util.List;
import java.util.Set;

public interface BasketService {
    Set<Integer> add(List<Integer>ids);
    Set<Integer> get();
}
