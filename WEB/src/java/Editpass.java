/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kuro
 */
@WebServlet("/Editpass/*")
public class Editpass extends HttpServlet {

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
        HttpSession session = request.getSession();
        String email = (String) session.getAttribute("email");
        String password = request.getParameter("password");
        String newpass = request.getParameter("newpassword");
        String renewpass = request.getParameter("renewpass");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            stm = con.createStatement();
            String strQuery = "SELECT * FROM `photics`.`user` where email='" + email + "'";
            rs = stm.executeQuery(strQuery);
            rs.next();
            if (rs.getString("password").equals(password)) {
                if (newpass.equals(renewpass)) {
                    stmt = con.prepareStatement("UPDATE `photics`.`user` SET password = ? WHERE email = ?");
                    stmt.setString(1, newpass);
                    stmt.setString(2, email);
                    stmt.executeUpdate();
                    session.setAttribute("password", newpass);
                    response.sendRedirect("user.jsp");
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
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
