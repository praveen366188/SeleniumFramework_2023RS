package java_practice.linkedIn_programs.CC.privateCons;

public class B1 {
    public static void main(String[] args) {
//        A1 a=new A1(); //it will throw the error because A1 has the private constructor

       Singleton s1= Singleton.getInstance();
       s1.m1();

    }

}
