/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kuro
 */
@WebServlet("/avatar/*")
@MultipartConfig(maxFileSize = 16177215)
public class avatar extends HttpServlet {

    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    String url = "jdbc:mysql://localhost:3306/photics";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Blob image;
        byte[] imgData;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            OutputStream o = response.getOutputStream();
            stmt = con.prepareStatement("SELECT * FROM `photics`.`user` WHERE email = ?;");
            HttpSession session = request.getSession();
            String email = (String) session.getAttribute("email");
            stmt.setString(1, email);
            rs = stmt.executeQuery();
            if (rs.next()) {
                image = rs.getBlob(5);
                imgData = image.getBytes(1, (int) image.length());
                response.setContentType("image/jpeg");
                o.write(imgData);
                o.flush();
            }
            o.close();
        } catch (Exception e) {
            return;
        } finally {
            try {
                rs.close();
                stmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String email = (String) session.getAttribute("email");
        InputStream inputStream = null;
        Part filePart = request.getPart("myavatar");
        if (filePart != null) {
            inputStream = filePart.getInputStream();
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            stmt = con.prepareStatement("UPDATE `photics`.`user` SET avatar = ? WHERE email = ?");
            stmt.setString(2, email);
            if (inputStream != null) {
                stmt.setBlob(1, inputStream);
            }
            stmt.executeUpdate();
            response.sendRedirect("user.jsp");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                    rs = null;
                }
                if (stmt != null) {
                    stmt.close();
                    stmt = null;
                }
                if (con != null) {
                    con.close();
                    con = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
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
