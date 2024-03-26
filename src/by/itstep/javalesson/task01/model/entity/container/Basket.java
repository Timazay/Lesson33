package by.itstep.javalesson.task01.model.entity.container;

import by.itstep.javalesson.task01.model.entity.*;

import java.util.Arrays;

public class Basket {
    public static final int DEFAULT_SIZE = 10;
    Container container;


    public Basket(Product[] products) {
        container = new ArrayImplementation();
    }

    public Basket(Container container) {
        this.container = container;
    }


    public int getSize() {
        return container.size();
    }

    public Product getProduct(int index) {
        return container.get(index);
    }

    void add(Product product){
        container.add(product);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of products:\n");
        for (int i = 0; i < container.size(); i++) {
            builder.append(container.get(i)).append("\n");
        }
        return new String(builder);
    }
}
