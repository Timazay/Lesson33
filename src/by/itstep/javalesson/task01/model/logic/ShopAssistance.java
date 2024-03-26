package by.itstep.javalesson.task01.model.logic;

import by.itstep.javalesson.task01.model.entity.*;
import by.itstep.javalesson.task01.model.entity.container.Basket;

public class ShopAssistance {
    public static double calcTotalPrice(Basket basket) {
        if (basket == null || basket.getSize() == 0) {
            return -1;
        }
        double total = 0;

        for (Product product : basket.getSize()) {
            total += product.getPrice();
        }

 //       for (int i = 0; i < basket.getSize(); i++) {
 //           total += basket.getProduct(i).getPrice();
 //       }

        return total;
    }
}
