package Singleton;

public class ThreadSafeDoubleLocking {
    private ThreadSafeDoubleLocking(){
        System.out.println("Inside ThreadSafeDoubleLocking constructor block");
    }
    private static ThreadSafeDoubleLocking instance;
    public static ThreadSafeDoubleLocking getInstance(){
        if(instance == null){
            synchronized (ThreadSafeDoubleLocking.class){
                if(instance == null){
                    instance = new ThreadSafeDoubleLocking();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args){
        System.out.println("Inside main block");
        ThreadSafeDoubleLocking instance = new ThreadSafeDoubleLocking();
        // Thread safe, double locking mechanism => performance
    }
}
