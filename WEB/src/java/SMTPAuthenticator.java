
import javax.mail.PasswordAuthentication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kuro
 */
public class SMTPAuthenticator extends javax.mail.Authenticator {

    @Override
    public PasswordAuthentication getPasswordAuthentication() {
        String username = "duybao1101@gmail.com";           // specify your email id here (sender's email id)
        String password = "0947974880";                                      // specify your password here
        return new PasswordAuthentication(username, password);
    }
}
