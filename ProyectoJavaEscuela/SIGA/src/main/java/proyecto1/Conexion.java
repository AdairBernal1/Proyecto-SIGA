
package proyecto1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Conexion {
    static final String JDBC_Driver="com.mysql.cj.jdbc.Driver";
    Connection conn = null;
    Statement stmt = null;
    static final String DB_URL = "jdbc:mysql://localhost:3306/conect";
    
    static final String USER = "root";
    static final String PASS = "";
    public Conexion() throws SQLException{
        
        try {
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.print("Conexion correcta");
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
