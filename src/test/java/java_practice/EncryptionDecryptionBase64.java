package java_practice;


import org.apache.commons.codec.binary.Base64;

public class EncryptionDecryptionBase64{
    public static void main(String[] args) {
        String password = "Jaycu@344331";

        byte[] encodedString = Base64.encodeBase64(password.getBytes());
        System.out.println("encoded password is :" + new String(encodedString));


        byte[] decodedString = Base64.decodeBase64(encodedString);
        System.out.println("decoded string is :" + new String(decodedString));
    }


}
