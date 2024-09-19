package defaultandstaticmethod;

interface AdvancedPrinter {
    void print();

    //an interface can have default method with body.
    default void scan() {
        System.out.println("Scanner supported");
    }
}
interface BasicPrinter {
    void print();

    default void scan() {
        System.out.println("Scanner not supported");
    }
}

    class Printer implements AdvancedPrinter,BasicPrinter {
        public void print(){
            System.out.println("Hello-ust");
        }

        @Override
        public void scan() {
            AdvancedPrinter.super.scan();
            BasicPrinter.super.scan();
        }
    }

public class Check {
    public static void main(String[] args) {
        AdvancedPrinter printer=new Printer();
        BasicPrinter basicPrinter=new Printer();
        printer.print();
        printer.scan();
        basicPrinter.print();
        basicPrinter.scan();
    }
}
