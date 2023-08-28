package java_practice.core_java;

 public class AbstractExamples extends yy {
    public AbstractExamples(){
        System.out.println("a con");
    }

     @Override
     public void m1() {
         System.out.println("m1 over rided");
     }

     public static void main(String[] args) {
         yy abstractExamples=new AbstractExamples();
//         abstractExamples.m1();
//         abstractExamples.m2();
//         abstractExamples.m4();
//         AbstractExamples.m3();
     }
 }

     abstract class yy {
     public yy(){
         System.out.println("constructor");
     }
    abstract public void m1();
    public void m2(){
        System.out.println("m2 in abstract class");
    }
    static public void m3(){
        System.out.println("static void m3");
    }

    final public void m4(){
        System.out.println("final method in ac");
    }

}