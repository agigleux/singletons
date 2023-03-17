package io.poc;

// #3: Lazy Initialization

// https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples#3-lazy-initialization
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}