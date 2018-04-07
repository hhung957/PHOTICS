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

/**
 *
 * @author Kuro
 */
@WebServlet("/Edit/*")
public class Edit extends HttpServlet {

    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    String url = "jdbc:mysql://localhost:3306/photics";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String category = request.getParameter("categoryn");
        String captionn = request.getParameter("captionn");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            stmt = con.prepareStatement("UPDATE `photics`.`image` SET caption = ?, category = ? WHERE ID = ?");
            int ID = Integer.parseInt(request.getParameter("ID"));
            stmt.setString(1, captionn);
            stmt.setString(2, category);
            stmt.setInt(3, ID);
            stmt.executeUpdate();
            response.sendRedirect("user.jsp");
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
