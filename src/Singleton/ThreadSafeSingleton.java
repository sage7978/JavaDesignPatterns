package Singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){
        System.out.println("Inside ThreadSafeSingletone constructor");
    }
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    public static void main(String[] args){
        System.out.println("Inside main block");
        ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
        // Thread-safe, not performance, as all threads follow synchronized everytime
        // performance overhead
        // optimization => double locking mechanism
    }
}
