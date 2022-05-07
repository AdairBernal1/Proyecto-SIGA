/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import proyecto1.Conexion;

/**
 *
 * @author adair
 */
public class AdminDAO {
        
    Conexion cc = new Conexion();
    Connection con = cc.Conexion();
    
        public boolean validarUsuario(String user, String pass) throws Exception{
        
        PreparedStatement myStmt = null;    
        boolean status = false;
        
        try{
            // 2. Create a statement
            myStmt = con.prepareStatement("select * from admins where username = ? and password = ?");
            // 3. Set PreparedStatement values
            myStmt.setString(1, user);
            myStmt.setString(2, pass);
            // 4. Execute SQL Query
            ResultSet myRs = myStmt.executeQuery();
            // 5. Process the result set
            if(myRs.next()){
                status = true;
            }
        }       
        finally{
            myStmt.close();
        }
        return status;
    }
    
}
