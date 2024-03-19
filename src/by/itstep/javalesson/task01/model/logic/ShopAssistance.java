package by.itstep.javalesson.task01.model.logic;

import by.itstep.javalesson.task01.model.entity.*;
import by.itstep.javalesson.task01.model.entity.container.Basket;

public class ShopAssistance {
    public static double calcTotalPrice(Basket basket) {
        if (basket == null || basket.getSize() == 0) {
            return -1;
        }
        double total = 0;

        for (Product product : basket.getProducts()) {
            total += product.getPrice();
        }


        return total;
    }
}
