package com.example.internetshop.controller;

import com.example.internetshop.service.BasketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class BasketController {

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    private final BasketService basketService;

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> ids) {
        return basketService.add(ids);
    }

    @GetMapping("/get")
    public Map<Integer, Integer> get() {
        return basketService.get();
    }
}
