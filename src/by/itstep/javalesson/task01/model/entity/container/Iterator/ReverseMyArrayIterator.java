package by.itstep.javalesson.task01.model.entity.container.Iterator;

public class ReverseMyArrayIterator implements Iterator {
    private MyArray myArray;
    private int cursor= 0;

    public ReverseMyArrayIterator(MyArray myArray) {
        this.myArray = myArray;
        cursor = myArray.getLength() - 1;
    }

    @Override
    public int element() {
        return myArray.getElement(cursor--);
    }

    @Override
    public boolean hasElement() {
        return cursor >= 0;
    }
}
