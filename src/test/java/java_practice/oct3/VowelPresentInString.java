package java_practice.oct3;

public class VowelPresentInString {
   public static boolean isvowel(String a) {
       for (int i = 0; i < a.length(); i++) {
           char[] vowels = {'a', 'e', 'i', 'o', 'u'};
           for (int j = 0; j < vowels.length; j++) {
               if (a.charAt(i) == vowels[j])
                   return true;
           }

       }
       return false;

   }

    public static void main(String[] args) {
        System.out.println(isvowel("dfjjsa"));
        System.out.println(isvowel("qwpkmn"));
        String s="fakjsfs";
        System.out.println(s.toLowerCase().matches(".*[aeiou].*"));
    }

}
