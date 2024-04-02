package by.itstep.javalesson.task01.model.entity.container.Iterator;

public class MyArray implements Iterable{
    private int[] array;

    public MyArray() {
        array = new int[]{1,2,3,4,5,6,7,8,9};
    }

    public MyArray(int[] array) {
        this.array = array;
    }

    int getLength(){
        return array.length;
    }

    int getElement(int index){
        return array[index];
    }

    public Iterator getIterator() {
        return new MyArrayIterator(this);
    }
}
