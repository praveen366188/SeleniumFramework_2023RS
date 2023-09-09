package java_practice.core_java;

public class FInalizeGC {
    public static void main(String[] args)
    {
        FInalizeGC ex = new FInalizeGC(); // Creating object ex of class Example
        ex = null; // Unrefrencing the object ex.
        System.gc(); // Calling garbage collector to destroy ex
        System.out.println("Unreferenced object ex is destroyed successfully!");
    }

//    @Override
//    protected void finalize()
//    {
//        System.gc();
//        System.out.println("Inside finalize method");
//        System.out.println("Performing clean-up before destroying the object.");
//        System.out.println("Release and close connections.");
//    }
}
