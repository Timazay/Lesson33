package by.itstep.javalesson.task01.model.entity.container;

import by.itstep.javalesson.task01.model.entity.*;

import java.util.Arrays;
import java.util.Iterator;

public class Basket implements Iterable<Product>{
    public static final int DEFAULT_SIZE = 10;
    Container container;

    public Basket() {

    }

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
        return builder.toString();
    }

    @Override
    public Iterator<Product> iterator() {
        return new BasketIterator();
    }


    private class BasketIterator implements Iterator<Product> {
        private int count = 0;


        @Override
        public boolean hasNext() {
            return count< container.size();
        }

        @Override
        public Product next() {
            return container.get(count++);
        }
    }
}
