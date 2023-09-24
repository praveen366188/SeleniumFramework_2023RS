package java_practice.email;

import java_practice.encrypt_decrypt.EncryptionDecryptionCipher;
import org.apache.commons.mail.*;

public class SendEmail_WithAttachments {
    public static void main(String[] args) throws Exception {


// To generate outh password https://www.youtube.com/watch?v=nuD6qNAurVM
        System.out.println("========SENDING MAIL=============");
        EmailAttachment emailAttachment = new EmailAttachment();
        emailAttachment.setPath("IMG_20230629_081348_794.jpg");
        emailAttachment.setDisposition(EmailAttachment.ATTACHMENT);
        emailAttachment.setDescription("my pic");
        emailAttachment.setName("Praveenkumar_goa");

        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("praveenkumarthedanger@gmail.com", EncryptionDecryptionCipher.decryptPassword("yTiPqLCdK4MPDQlbes9WJLF87YOx2eBrtJ/3zt/Wx+Q=","lajet")));
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
