package Singleton;

public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){
        System.out.println("Inside LazySingleton constructor");
    }
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
    public static void main(String[] args){
        System.out.println("Inside main function");
        LazySingleton instance = new LazySingleton();
        //  Instance is instantiated only when we are using getInstance
    }
}
