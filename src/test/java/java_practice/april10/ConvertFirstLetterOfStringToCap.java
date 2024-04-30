package java_practice.april10;

public class ConvertFirstLetterOfStringToCap {
    public static void main(String[] args) {
        String string="i love you tejal ughade";
        StringBuilder stringBuilder=new StringBuilder();

        for (String s:string.split(" ")) {
            stringBuilder.append(s.substring(0,1).toUpperCase()+s.substring(1)+" ");

        }
        System.out.println(stringBuilder);
    }
}
