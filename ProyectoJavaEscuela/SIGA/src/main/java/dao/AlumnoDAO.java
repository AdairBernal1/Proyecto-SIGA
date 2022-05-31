/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
    public List<Alumno> getAllAlumnos() throws Exception {
            List<Alumno> list = new ArrayList<>();

            Statement myStmt = null;
            ResultSet myRs = null;

            try {
                    myStmt = con.createStatement();
                    myRs = myStmt.executeQuery("select * from alumnos");

                    while (myRs.next()) {
                            Alumno tempAlumno = convertRowToAlumno(myRs);
                            list.add(tempAlumno);
                    }

                    return list;		
            }
            finally {
                    close(myStmt, myRs);
            }
    }
    public List<Alumno> searchAlumno(String valor) throws Exception {
            List<Alumno> list = new ArrayList<>();

            PreparedStatement myStmt = null;
            ResultSet myRs = null;

            try {
                    valor += "%";
                    myStmt = con.prepareStatement("select * from alumnos where apellido like ?");

                    myStmt.setString(1, valor);

                    myRs = myStmt.executeQuery();

                    while (myRs.next()) {
                            Alumno tempAlumno = convertRowToAlumno(myRs);
                            list.add(tempAlumno);
                    }

                    return list;
            }
            finally {
                    close(myStmt, myRs);
            }
    }
	
    private Alumno convertRowToAlumno(ResultSet myRs) throws SQLException {

            int id = myRs.getInt("idalumnos");
            String nombre = myRs.getString("nombre");
            String apellido = myRs.getString("apellido");
            String tel = myRs.getString("tel");
            String tipo_ins = myRs.getString("tipo_ins");
            String grupo = myRs.getString("grupo");
            String fecha_ins = myRs.getString("fecha_ins");

            Alumno tempAlumno = new Alumno(id, nombre, apellido, tel, tipo_ins, grupo, fecha_ins);

            return tempAlumno;
    }
    private static void close(Connection myConn, Statement myStmt, ResultSet myRs) throws SQLException {

            if (myRs != null) {
                    myRs.close();
            }

            if (myStmt != null) {

            }

            if (myConn != null) {
                    myConn.close();
            }
    }

    private void close(Statement myStmt, ResultSet myRs) throws SQLException {
            close(null, myStmt, myRs);		
    }
}
