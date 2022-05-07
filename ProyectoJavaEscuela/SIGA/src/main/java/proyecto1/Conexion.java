
package proyecto1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    static final String JDBC_Driver="com.mysql.cj.jdbc.Driver";
    Connection conn = null;
    static final String DB_URL = "jdbc:mysql://localhost:3306/siga_bd";
    static final String USER = "root";
    static final String PASS = "12345";
    
    public Connection Conexion(){
        
        try {
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.print("Conexion correcta");
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
}
