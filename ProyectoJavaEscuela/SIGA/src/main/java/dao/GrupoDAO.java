/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import proyecto1.Conexion;
import proyecto1.Grupo;

/**
 *
 * @author adair
 */
public class GrupoDAO {  
    
    Conexion cc = new Conexion();
    Connection con = cc.Conexion();
    
    public void agregarGrupo(Grupo grupo) throws Exception {
        PreparedStatement myStmt = null;
        final String sql = "insert into grupos" 
                + " (dia, horario, teacher) "
                + " values (?, ?, ?) ";
        try{
            myStmt = con.prepareStatement(sql);
            myStmt.setString(1, grupo.getDia());
            myStmt.setString(2, grupo.getHorario());
            myStmt.setString(3, grupo.getTeacher());
            
            myStmt.executeUpdate();
        }
        finally {
            myStmt.close();
        }
    }
}
