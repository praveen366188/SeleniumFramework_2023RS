import java.util.*;

public class UserNameValidation {
    public static Map<String, Boolean> input_username(int n) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            map.put(s, verify_username(s));

        }
        return map;

    }

    public static boolean verify_username(String string) {
        int length_of_string = string.length();
        if (!(length_of_string >= 8 && length_of_string <= 30)) {
            System.out.println("not a valid username");
            return false;
        }
        if (!Character.isAlphabetic(string.charAt(0))) {
            System.out.println("not a valid username");
            return false;
        }
        for (int i = 0; i < length_of_string; i++) {
            if (!(Character.isAlphabetic(string.charAt(i)) || Character.isDigit(string.charAt(i)) || string.charAt(i) == '_')) {
                System.out.println("not a valid username");
                return false;
            }

        }
        System.out.println("valid");
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_users = 0;
        do {
            System.out.println("Enter number of username you need to verify: ");
            number_of_users = scanner.nextInt();
        } while (number_of_users > 100 || number_of_users <= 0);

        Map<String, Boolean> map = input_username(number_of_users);




    }
}