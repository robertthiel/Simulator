package school.demo.lambda;

public class LambdaMain {

    public static void main(String[] args) {
        LambdaMain l = new LambdaMain();
        l.doIt();
    }

    public void doIt() {
        Cat cat = new Cat();
        cat.print();
        printThings(cat);
        printThings(() -> System.out.println("kkdk") );
        Printable lambdaPrintable = () -> System.out.println("kkdk");
        printThings( lambdaPrintable );
    }

    public class Cat implements Printable {
        public Cat() {
        }

        @Override
        public void print() {
            System.out.println("okkay, in printable ... in cat");
        }
    }

    @FunctionalInterface
    public interface Printable {
        void print();
    }

    static void printThings(Printable thing) {
        thing.print();
    }
}



