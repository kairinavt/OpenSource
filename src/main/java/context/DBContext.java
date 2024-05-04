
package context;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
    private static Connection getConnection (String hostname, String dbName, String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionURL="jdbc:mysql://"+hostname+":3306/"+dbName;
        Connection conn=DriverManager.getConnection(connectionURL,username,password);
        return conn;
    }
 
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String hostname="localhost";
        String dbName="quanlybanhangdemo";
        String username="root";
        String password="";
        return getConnection(hostname,dbName,username,password);
    }
}
 