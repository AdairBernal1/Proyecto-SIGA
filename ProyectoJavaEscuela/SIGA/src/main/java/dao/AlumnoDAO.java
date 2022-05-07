/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import proyecto1.Alumno;
import proyecto1.Conexion;
/**
 *
 * @author adair
 */
public class AlumnoDAO {
    
    Conexion cc = new Conexion();
    Connection con = cc.Conexion();
    
    public void agregarAlumno(Alumno alumno) throws Exception {
        PreparedStatement myStmt = null;
        final String sql = "insert into alumnos" 
                + " (nombre, apellido, tel, tipo_ins, grupo, fecha_ins) "
                + " values (?, ?, ?, ?, ?, ?) ";
        try{
            myStmt = con.prepareStatement(sql);
            myStmt.setString(1, alumno.getNombre());
            myStmt.setString(2, alumno.getApellido());
            myStmt.setString(3, alumno.getTelefono());
            myStmt.setString(4, alumno.getTipoInsc());
            myStmt.setString(5, alumno.getGrupo());
            myStmt.setString(6, alumno.getFechaInsc());
            
            myStmt.executeUpdate();
        }
        finally {
            myStmt.close();
        }
    }
}
