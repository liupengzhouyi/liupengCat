package database;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class linkDatabases {
    // JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/database_for_code";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USERNAME = "root";
    static final String PASSWORD = "lp184126";

    private Connection connection = null;


    private Statement statement = null;

    public linkDatabases() {
        try {
            Class.forName(JDBC_DRIVER);
            try {
                connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        if (connection == null) {
            return null;
        } else {
            return connection;
        }
    }

    /*public Statement getStatement() throws SQLException {
        if (this.connection == null) {
            this.statement = null;
        } else {
            this.statement = this.connection.createStatement();
        }
        return this.statement;
    }*/

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        linkDatabases linkDatabase = new linkDatabases();
        Connection connection = linkDatabase.getConnection();
        if (connection != null) {
            System.out.print("数据库连接成功！");
        } else {
            System.out.print("数据库连接失败！");
        }
    }

}
