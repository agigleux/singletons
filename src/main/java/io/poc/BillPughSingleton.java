package io.poc;

// #5: Bill Pugh Singleton Implementation

// https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples#5-bill-pugh-singleton-implementation
public class BillPughSingleton {

    private BillPughSingleton(){}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
