/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author user
 */
public class MailSendWithImages {

    public static void main(String[] args) {
        try {
            final String username1 = "vishalk@virtuosonetsoft.com";
            final String password1 = "vishukumar";
            // String smtphost = "imap.gmail.com";
            String from = "vishalk@virtuosonetsoft.com";
            String to = "vishalk@virtuosonetsoft.com";

            String body = "";
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

            Message message = new MimeMessage(session1);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Testing Subject");

            //Start
            // Set Subject: header field
            // This mail has 2 part, the BODY and the embedded image
            MimeMultipart multipart = new MimeMultipart("related");

            // first part (the html)
            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText = "<H1>Hello</H1><img src=\\\"cid:image\\\">";
            messageBodyPart.setContent(htmlText, "text/html");
            // add it
            multipart.addBodyPart(messageBodyPart);

            // second part (the image)
            messageBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource(
                    "D:\\result.png");

            //messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID", "<image>");

            // add image to the multipart
            multipart.addBodyPart(messageBodyPart);

            // put everything together
            message.setContent(multipart);
            // Send message
            //Transport.send(message);

            //END
            //message.setText("<H1>Hello</H1>");

            //Transport transport = session1.getTransport("smtp");
            //transport.connect(host, port, username1, password1);

            Transport.send(message);

            System.out.println("Done");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
