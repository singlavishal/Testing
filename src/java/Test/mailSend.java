/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author vishu
 */
public class mailSend {
    public static void main(String[] args) {
        new mailSend().replymethod("hello", "vishalk@virtuosonetsoft.com");
    }
    public void replymethod(String reply, String msgFrom) {
        final String username1 = "vishalk@virtuosonetsoft.com";
        final String password1 = "vishalkumar";
        // String smtphost = "imap.gmail.com";
        String from = "vishalk@virtuosonetsoft.com";
        String to = msgFrom;
        String body = reply;
        System.out.println("msgggggggg:" + body);
        String host = "smtp.gmail.com";
        int port = 587;
        // Get system properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session1 = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username1, password1);
                    }
                });

        try {

            Message message = new MimeMessage(session1);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("reply");
            message.setText(body);

            Transport transport = session1.getTransport("smtp");
            transport.connect(host, port, username1, password1);

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
