package java_practice.email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

import java.net.MalformedURLException;
import java.net.URL;

public class SendEmail_WithAttachments_RemoteURL {
    public static void main(String[] args) throws EmailException, MalformedURLException {


// To generate outh password https://www.youtube.com/watch?v=nuD6qNAurVM
//        gqmh rjlz lean mxnt
        System.out.println("========SENDING MAIL=============");
        EmailAttachment emailAttachment = new EmailAttachment();
        emailAttachment.setURL(new URL("https://media.giphy.com/media/H2u46cKU3VaXht6Iv9/giphy.gif"));
        emailAttachment.setDisposition(EmailAttachment.ATTACHMENT);
        emailAttachment.setDescription("my pic");
        emailAttachment.setName("Praveenkumar_goa");

        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("praveenkumarthedanger@gmail.com", "gqmh rjlz lean mxnt"));
        email.setSSLOnConnect(true);
        email.setFrom("praveenkumarthedanger@gmail.com");
        email.addTo("praveenkumarthedanger@gmail.com");
        email.setSubject("subject123");
        email.setMsg("message");
        email.attach(emailAttachment);
        email.send();
        System.out.println("========MAIL SEND=============");

    }
}
