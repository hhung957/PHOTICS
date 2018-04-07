/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import java.io.IOException;
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
@WebServlet("/upload/*")
@MultipartConfig(maxFileSize = 16177215)
public class upload extends HttpServlet {

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
            stmt = con.prepareStatement("SELECT * FROM `photics`.`image` WHERE ID = ?;");
            int ID = Integer.parseInt(request.getParameter("ID"));
            stmt.setInt(1, ID);
            rs = stmt.executeQuery();
            if (rs.next()) {
                image = rs.getBlob(3);
                imgData = image.getBytes(1, (int) image.length());
                response.setContentType("image/jpeg");
                o.write(imgData);
                o.flush();
            }
            o.close();

            //rs = stmt.executeQuery("SELECT * from `photics`.`test` WHERE name = ?");
            // if (rs.next()) {
            // 
            // }
            //response.setContentType("image/jpg");
            //o.write(imgData);
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String email = (String) session.getAttribute("email");
        InputStream inputStream = null; // input stream of the upload file
        String caption = request.getParameter("caption");
        String category = request.getParameter("category");
        Part filePart = request.getPart("myimg");
        if (filePart != null) {
            inputStream = filePart.getInputStream();
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            stmt = con.prepareStatement("insert into `photics`.`image`(`email`,`image`,`caption`,`category`) values(?,?,?,?)");
            stmt.setString(1, email);
            stmt.setString(3, caption);
            stmt.setString(4, category);
            if (inputStream != null) {
                stmt.setBlob(2, inputStream);
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

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
