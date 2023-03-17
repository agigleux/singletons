package io.poc;

// #1: Eager initialization

// https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples#5-bill-pugh-singleton-implementation
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton(); // Noncompliant

    // private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}