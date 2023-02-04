package school.demo.generics;

public class Printer <T extends Animal> {

        T thingToPrint;

        public Printer(T integerToPrint) {
            this.thingToPrint = integerToPrint;
        }

        public void print() {
            thingToPrint.eat();
            System.out.println(thingToPrint);
        }
    }


