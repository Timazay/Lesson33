package by.itstep.javalesson.task01.model.entity.container.Iterator;

public class TestContainer {
    public static void main(String[] args) {
        MyList list = new MyList();
        MyArray array = new MyArray();

        test(list, array);

    }

    public static void test(Iterable... iterators) {
        for (Iterable iterable:iterators) {
            Iterator iterator = iterable.getIterator();
            while (iterator.hasElement()) {
                System.out.print(iterator.element() + " ");
            }

            System.out.println();
        }

    }
}
