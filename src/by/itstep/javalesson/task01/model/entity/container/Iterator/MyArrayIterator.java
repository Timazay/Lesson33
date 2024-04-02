package by.itstep.javalesson.task01.model.entity.container.Iterator;

public class MyArrayIterator implements Iterator{
    private MyArray myArray;
    private int cursor= 0;

    public MyArrayIterator(MyArray myArray) {
        this.myArray = myArray;
    }

    @Override
    public int element() {
        return myArray.getElement(cursor++);
    }

    @Override
    public boolean hasElement() {
        return cursor < myArray.getLength();
    }
}
