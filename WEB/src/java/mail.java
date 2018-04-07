
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class mail {

    public void sendMail(String email, String password) {
        try {
            Properties props = System.getProperties();
            // -- Attaching to default Session, or we could start a new one --
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.auth", "true");
            Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);
            // -- Create a new message --
            Message msg = new MimeMessage(session);
            // -- Set the FROM and TO fields --
            msg.setFrom(new InternetAddress("duybao1101@gmail.com"));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email, false));
            msg.setSubject("Photics!! ");
            msg.setText(password);
            // -- Set some other header information --
            msg.setHeader("MyMail", "Mr. XYZ");
            msg.setSentDate(new Date());
            // -- Send the message --
            Transport.send(msg);
            System.out.println("Message sent to" + "duybao1101@gmail.com" + " OK.");

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Exception " + ex);

        }
    }

    public static void main(String args[]) {
        mail a = new mail();
        a.sendMail("duybao1101@gmail.com", "deocobiet123");
    }
}
