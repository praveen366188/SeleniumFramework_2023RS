package java_practice.linkedIn_programs.CC.interface_practice;

public interface B1 {
    abstract public void m1();

    default public void def(){
        System.out.println("default from b1");
    }
}
