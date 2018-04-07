/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author Kuro
 */
public class Forgot extends HttpServlet {

    Connection con = null;
    PreparedStatement stmt = null;
    Statement stm = null;
    ResultSet rs = null;
    String url = "jdbc:mysql://localhost:3306/photics";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        mail a = new mail();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            stm = con.createStatement();
            String strQuery = "SELECT COUNT(*) FROM `photics`.`user` WHERE email='" + email + "'";
            rs = stm.executeQuery(strQuery);
            rs.next();
            String Countrow = rs.getString(1);
            if (Countrow.equals("1")) {
                stmt = con.prepareStatement("SELECT * FROM `photics`.`user` WHERE email = ?");
                stmt.setString(1, email);
                rs = stmt.executeQuery();
                rs.next();
                String password = rs.getString(4);
                a.sendMail(email,"Your forgot password is : "+password);
                response.sendRedirect("forgot.jsp");
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public void send(String mail) {
        String to = "duybao1101@gmail.com";//change accordingly
//Get the session object
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("duybao1101@gmail.com", "0947974880");//Put your email id and password here
            }
        });
//compose message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(mail));//change accordingly
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(mail));
            message.setSubject("Welcome to Photics");
            message.setText("Welcome to Photics, where you can share your moment and discover the world");
//send message
            Transport.send(message);
            System.out.println("message sent successfully");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
