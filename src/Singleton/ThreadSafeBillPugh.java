package Singleton;

public class ThreadSafeBillPugh {
    private ThreadSafeBillPugh(){
        System.out.println("Inside ThreadSafeBillPugh constructor block");
    }
    private static class SingletonHelper{
        private static final ThreadSafeBillPugh INSTANCE = new ThreadSafeBillPugh();
    }
    public static ThreadSafeBillPugh getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args){
        System.out.println("Inside main block");
        ThreadSafeBillPugh instance = ThreadSafeBillPugh.getInstance();
        // Its threadsafe, performance safe, high thread capable, no memory issues like other threadsafe mechanisms
        // under Java 5
    }
}
