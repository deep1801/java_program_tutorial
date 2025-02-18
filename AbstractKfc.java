abstract class KFC {
    // Constructor
    KFC() {
        System.out.println("This is the real KFC.");
    }

    // Concrete method
    public void makeItem() {
        System.out.println("Item should be made.");
    }

    // Abstract methods
    abstract public void billing();
    abstract public void offer();
    abstract public void festiveOffer();
}

class MyKfc extends KFC {
    // Constructor
    MyKfc() {
        System.out.println("This is my own MyKfc.");
    }

    @Override
    public void billing() {
        System.out.println("Billing must be available in both modes.");
    }

    @Override
    public void offer() {
        System.out.println("Offers must be available.");
    }

    @Override
    public void festiveOffer() {
        System.out.println("Festive offers must be available.");
    }
}

public class AbstractKfc {
    public static void main(String[] args) {
        KFC k = new MyKfc(); // Upcasting to KFC
        k.billing();
        k.festiveOffer();
        k.offer();
    }
}
