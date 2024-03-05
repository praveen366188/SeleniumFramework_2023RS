package java_practice.linkedIn_programs;

public class ReverseAString {
    public static void main(String[] args) {

        String s="ILoveYou";
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = s.length()-1; i >=0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        System.out.println(stringBuilder);

    }
}
