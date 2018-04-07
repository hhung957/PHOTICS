/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author Kuro
 */
@WebServlet(urlPatterns = {"/Register"})
public class Register extends HttpServlet {

    Connection con = null;
    PreparedStatement stmt = null;
    Statement stm = null;
    ResultSet rs = null;
    String url = "jdbc:mysql://localhost:3306/photics";

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        mail b = new mail();
        String fname = request.getParameter("firstname");
        String lname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            stm = con.createStatement();
            String strQuery = "SELECT COUNT(*) FROM `photics`.`user` WHERE email='" + email + "'";
            rs = stm.executeQuery(strQuery);
            stmt = con.prepareStatement("INSERT into `photics`.`user`(`email`,`first name`,`last name`,`password`,`avatar`) VALUES (?,?,?,?,?)");
            rs.next();

            String Countrow = rs.getString(1);
            if (Countrow.equals("0")) {
                FileInputStream fin = new FileInputStream("C:\\Users\\Kuro\\Documents\\NetBeansProjects\\WEB\\web\\images\\avatar.png");
                stmt.setString(1, email);
                stmt.setString(2, fname);
                stmt.setString(3, lname);
                stmt.setString(4, password);
                stmt.setBinaryStream(5, fin, fin.available());
                stmt.executeUpdate();
                b.sendMail(email, "Welcome " + fname + " to Photics community, where you can share your moment!");
                response.sendRedirect("login.jsp");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Your email was already existed');");
                out.println("location='register.jsp';");
                out.println("</script>");
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

}
