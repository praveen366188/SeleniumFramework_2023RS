package java_practice.oct3;

public class RemoveWhiteSpace {

    public static void main(String[] args) {
        StringBuilder s1= new StringBuilder("I love you");
        StringBuilder s2= new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=' ')
                s2.append(s1.charAt(i));
        }
        System.out.println(s2);

    }
}
