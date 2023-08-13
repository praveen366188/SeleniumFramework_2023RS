package java_practice.core_java;

public class InstanceInitializeBlock {
    public InstanceInitializeBlock(){
        System.out.println("parent constructor");
    }
    {
        System.out.println("parent instance initializer block");
    }
    static {
        System.out.println("parent static block");

    }
}
class child extends InstanceInitializeBlock{
    public child(){
        System.out.println("child constructor");
    }
    {        System.out.println("child instance initializer block");
    }
    static {
        System.out.println("child static block");

    }
    public void m1(final int o){
        System.out.println(o);
    }
}
class cc{

    public static void main(String[] args) {
        System.out.println("inside main");
//        child c=new child();
        InstanceInitializeBlock u=new child();

    }
}
