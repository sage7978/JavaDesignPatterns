package Singleton;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){
        System.out.println("1. Inside EagerSingleton constructor block");
    }
    public static EagerSingleton getInstance(){
        return instance;
    }

    public static void main(String[] args){
        System.out.println("2. Inside main block");
        EagerSingleton singleton = getInstance();
        //  No matter, you comment the above getInstance line, still constructor part will be called as it is
        //  independent of the place of usage.
        //  Similar to StaticBlockInitialization
    }
}
