package java_practice.core_java;

public class Demo1 {
    static int i = 90;
    int j = 99;
    public void mr(){

        System.out.println(i);
        System.out.println(j);
    }
    public static void m1(){
        System.out.println(i);
    }
    public static class A123{
        int k=9;
        static int p=10;
        public static void main(String[] args) {
            System.out.println(i);
            System.out.println(p);
        }
    }


}
 class SS{

     public static void main(String[] args) {
         Demo1.A123 a=new Demo1.A123();
         System.out.println(a.k);
         System.out.println(Demo1.A123.p);
     }

}
