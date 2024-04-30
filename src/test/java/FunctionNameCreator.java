import java.util.Scanner;

public class FunctionNameCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name to convert: ");
        String text_to_convert = scanner.nextLine();
        StringBuilder final_text = new StringBuilder();
        String[] array_of_string = text_to_convert.split(" ");
        for (String a1 : array_of_string) {
            StringBuilder temp = new StringBuilder();
            char q = Character.toUpperCase(a1.charAt(0));
            temp.append(q);

            for (int i = 1; i < a1.length(); i++) {
                temp.append(a1.charAt(i));
            }
            temp.append("_");

            final_text.append(temp);
        }
        System.out.println();
        for (int i = 0; i <final_text.length()-1 ; i++) {
            System.out.print(final_text.charAt(i));
        }

//        System.out.println(final_text);


    }
}
