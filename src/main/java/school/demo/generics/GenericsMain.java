package school.demo.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {

    public static void main(String[] args) {

        Printer <Dog> printer = new Printer<>(new Dog());
        printer.print();

        Printer <Cat> sPrinter = new Printer<>(new Cat());
        sPrinter.print();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());

        shout("Robert");
        shout(99);
        shout(new Cat());

        List<Integer> intList = new ArrayList<>();
        intList.add(33);
        //error ... does not extend Animal ... printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add( new Cat());
        printList(catList);

    }


    private static void printList(List<? extends Animal> myList) {
        System.out.println(myList);
    }

    private static <T> void shout (T thingToShout ) {
        System.out.println(thingToShout + "!!!" );
    }

    private static <T, V> T shoutV2 (T thingToShout, V otherThingToShout  ) {
        System.out.println(thingToShout + "!!!" );
        System.out.println(otherThingToShout + "!!!" );

        return thingToShout;
    }
}
