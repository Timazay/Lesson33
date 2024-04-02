package by.itstep.javalesson.task01.model.entity.container.Iterator;

public class MyListIterator implements Iterator{
    private MyList list;
    private int cursor = 0;

    public MyListIterator(MyList myList) {
        this.list = myList;
    }

    @Override
    public int element() {
        return list.get(cursor++);
    }

    @Override
    public boolean hasElement() {
        return cursor < list.size();
    }
}
