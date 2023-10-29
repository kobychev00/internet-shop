package com.example.internetshop.service;

import com.example.internetshop.model.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class BasketService {
    public BasketService(Basket basket) {
        this.basket = basket;
    }

    private final Basket basket;

    public List<Integer> add(List<Integer> ids) {
        return basket.add(ids);
    }

    public Map<Integer,Integer> get() {
        return basket.get();
    }
}
