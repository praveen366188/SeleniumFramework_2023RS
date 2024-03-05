package java_practice.linkedIn_programs.CC.interface_practice;

public interface A1 {
    abstract public void m1();
    abstract public void m2();
    default public void def(){
        System.out.println("default from a1");
    }


}
