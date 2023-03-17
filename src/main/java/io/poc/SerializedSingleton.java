package io.poc;

import java.io.Serializable;

// #8: Serialization and Singleton

// https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples#8-serialization-and-singleton

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

}