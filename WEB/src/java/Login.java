/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import static java.lang.System.out;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import java.util.*;
//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSession;

/**
 *
 * @author Kuro
 */
@WebServlet(urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    String url = "jdbc:mysql://localhost:3306/photics";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            stmt = con.createStatement();
            String strQuery = "SELECT * FROM `photics`.`user` where email='" + email + "' and password='" + password + "'";
            rs = stmt.executeQuery(strQuery);
            rs.next();
            if (rs.getString("password").equals("admin") && rs.getString("email").equals("admin@yahoo.com")) {
                response.sendRedirect("admin.jsp");
            }
            if (rs.getString("password").equals(password) && rs.getString("email").equals(email)) {
                HttpSession session = request.getSession();
                String login = "login";
                session.setAttribute("login", login);
                session.setAttribute("password", password);
                session.setAttribute("email", email);
                response.sendRedirect("user.jsp");
            } else {
                response.sendRedirect("explore.jsp");

            }
            rs.close();
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { //To change body of generated methods, choose Tools | Templates.
        HttpSession session = request.getSession();
        session.removeAttribute("email");
        session.removeAttribute("password");
        session.removeAttribute("login");
        response.sendRedirect("login.jsp");
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
