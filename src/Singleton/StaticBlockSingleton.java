package Singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){
        System.out.println("1. Inside the StaticBlockSingleton constructor");
    }

    static {
        try{
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Error occurred while creating singleton class");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args){
        System.out.println("2. Inside main method");
        StaticBlockSingleton instance = getInstance();
        //  No matter, you comment the above getInstance line, still constructor part will be called as it is
        //  Independent of the place of usage.
        //  Similar to Eager
    }
}
