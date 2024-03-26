package by.itstep.javalesson.task01.model.entity.container;

import by.itstep.javalesson.task01.model.entity.Product;

public interface Container {
    void add(Product product);
    void remove(Product product);
    void remove(int index);
    Product get(int index);
    int size();
}
