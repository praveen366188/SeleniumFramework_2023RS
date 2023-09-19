package java_practice.email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
    public static void SendTheEmail(String subject,String message) throws EmailException {
// To generate outh password https://www.youtube.com/watch?v=nuD6qNAurVM
//        gqmh rjlz lean mxnt
        System.out.println("========SENDING MAIL=============");
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("praveenkumarthedanger@gmail.com", "gqmh rjlz lean mxnt"));
        email.setSSLOnConnect(true);
        email.setFrom("praveenkumarthedanger@gmail.com");
        email.addCc("praveen366188@gmail.com");
        email.addCc("praveen188366@gmail.com");
        email.addCc("elangovanpraveenkumar@gmail.com");
        email.setSubject(subject);
        email.setContent(message, "text/html");
//        email.setMsg(message);
        email.addTo("praveenkumarthedanger@gmail.com");
        email.send();
        System.out.println("========MAIL SEND=============");

    }
}
