package java_practice.linkedIn_programs.CC.privateCons;

public class Singleton {
    private static Singleton instance;
    private Singleton(){
        System.out.println("inside private constructor");

    }
    public void m1(){
        System.out.println("inside m1 in singleton class");
    }
    public static Singleton getInstance(){
        if(instance==null)
            return new Singleton();
        else
            return instance;
    }

}
