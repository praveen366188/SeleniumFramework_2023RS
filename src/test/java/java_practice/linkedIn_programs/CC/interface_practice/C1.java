package java_practice.linkedIn_programs.CC.interface_practice;

public class C1 implements A1,B1{


    @Override
    public void m1() {
        System.out.println("m1 from the c1..");

    }

    @Override
    public void m2() {

    }

    @Override
    public void def() {
        B1.super.def();
    }

    public static void main(String[] args) {
        C1 c=new C1();
        c.def();
        c.m1();
    }


}
