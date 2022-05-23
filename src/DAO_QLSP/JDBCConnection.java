
package DAO_QLSP;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static Connection getJDBCConnection() throws SQLException{
        final String url = "jdbc:mysql://localhost:3306/quanlycuahang";
        final String user = "root";
        final String password = "123";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);    
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return null;
    }
    public static void main(String[] args) throws SQLException {
        Connection connection = getJDBCConnection();
        
        if(connection != null){
            System.out.println("thanh cong");
        }else{
            System.out.println("that bai");
        }
    }
}
