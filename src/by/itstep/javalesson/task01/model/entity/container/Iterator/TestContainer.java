package by.itstep.javalesson.task01.model.entity.container.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;

public class TestContainer {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        test(list);

    }

    public static void test(Iterable iterable){
        Iterator iterator = iterable.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }



 //   public static void test(Iterable... iterators) {
 //       for (Iterable iterable:iterators) {
 //           Iterator iterator = iterable.getIterator();
 //           while (iterator.hasElement()) {
 //               System.out.print(iterator.element() + " ");
 //           }
//
 //           System.out.println();
 //       }
//
 //   }
}
