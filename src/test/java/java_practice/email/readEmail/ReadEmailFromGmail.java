package java_practice.email.readEmail;

import java_practice.encrypt_decrypt.EncryptionDecryptionCipher;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;
import java.util.Arrays;
import java.util.Properties;

public class ReadEmailFromGmail {
    public static void main(String[] args) throws Exception {

        Folder emailFolder = null;
        Store store = null;
        try {

            //create properties field
            Properties properties = new Properties();

            properties.put("mail.pop3.host", "pop.gmail.com");
            properties.put("mail.pop3.port", Integer.toString(995));
            properties.put("mail.pop3.starttls.enable", "true");

            Session emailSession = Session.getDefaultInstance(properties);

            //create the POP3 store object and connect with the pop server

            store = emailSession.getStore("pop3s");

            store.connect("pop.gmail.com", "praveenkumarthedanger@gmail.com", EncryptionDecryptionCipher.decryptPassword("yTiPqLCdK4MPDQlbes9WJLF87YOx2eBrtJ/3zt/Wx+Q=","lajet"));

            //create the folder object and open it
            emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);

            // retrieve the messages from the folder in an array and print it
            Message[] messages = emailFolder.getMessages();
            System.out.println(Arrays.toString(messages));
            for (final Message msg : messages) {
                final String subject = msg.getSubject();
                System.out.println(subject);
            }
        }

        finally {
            if (emailFolder != null) {
                emailFolder.close(false);
            }
            if (store != null) {
                store.close();
            }
        }

    }
}
