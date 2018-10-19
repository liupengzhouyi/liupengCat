package Servlet;

import database.linkDatabases;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        linkDatabases lpLinkDatabases = new linkDatabases();
        Connection connection = lpLinkDatabases.getConnection();
        if (connection != null) {
            System.out.print("esxrdcftvgybihjnkm");
        } else {
            System.out.print("aaaaaaaaaaaaaaaaaaaaaa");
        }
        Statement statement;
        try {
            statement = connection.createStatement();
            String sql = "INSERT INTO test VALUES (123, \"123\");";
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
