package by.itstep.javalesson.task01.controller;

import by.itstep.javalesson.task01.model.entity.*;
import by.itstep.javalesson.task01.model.entity.container.Basket;

public class Main {
    public static void main(String[] args) {
        Product[] products = {new Milk(1000, 3.5, 2.0),
                new Bread("Black", "First", 1.5),
                new Orange(100, 3000, 0.5),
                new Water(2)};
        Basket basket = new Basket(products);

        System.out.println(basket.toString());
    }
}
