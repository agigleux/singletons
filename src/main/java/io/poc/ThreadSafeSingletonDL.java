package io.poc;

// #4: Thread Safe Singleton DoubleLocking

// https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples#4-thread-safe-singleton
public class ThreadSafeSingletonDL {

    private static ThreadSafeSingletonDL instance;

    private ThreadSafeSingletonDL() {}

    public static ThreadSafeSingletonDL getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingletonDL.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingletonDL();
                }
            }
        }
        return instance;
    }
}