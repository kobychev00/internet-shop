package com.example.internetshop.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@SessionScope
public class Basket {
    public Map<Integer, Integer> countById = new HashMap<>();
// мапа ключ - ид, значение - кол-во вхождений
    public List<Integer> add(List<Integer> ids) { // перебирай ид
        for (Integer i : ids) {
            if (countById.containsKey(i)) { // если мапа содержит значение с ид
                countById.put(i, countById.get(i) + 1); //  то счетчик увеличиваем на 1
            } else {
                countById.put(i, 1); // если, то 1
            }
        }
        return ids;
    }

    public Map<Integer,Integer> get() {
        return countById;
    }
}
