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
    public List<Grupo> getAllGrupos() throws Exception {
            List<Grupo> list = new ArrayList<>();

            Statement myStmt = null;
            ResultSet myRs = null;

            try {
                    myStmt = con.createStatement();
                    myRs = myStmt.executeQuery("select * from grupos");

                    while (myRs.next()) {
                            Grupo tempGrupo = convertRowToGrupo(myRs);
                            list.add(tempGrupo);
                    }

                    return list;		
            }
            finally {
                    close(myStmt, myRs);
            }
    }
    public List<Grupo> searchGrupo(String valor) throws Exception {
            List<Grupo> list = new ArrayList<>();

            PreparedStatement myStmt = null;
            ResultSet myRs = null;

            try {
                    valor += "%";
                    myStmt = con.prepareStatement("select * from grupos where dia like ?");

                    myStmt.setString(1, valor);

                    myRs = myStmt.executeQuery();

                    while (myRs.next()) {
                            Grupo tempGrupo = convertRowToGrupo(myRs);
                            list.add(tempGrupo);
                    }

                    return list;
            }
            finally {
                    close(myStmt, myRs);
            }
    }
	
    private Grupo convertRowToGrupo(ResultSet myRs) throws SQLException {

            int id = myRs.getInt("idgrupos");
            String dia = myRs.getString("dia");
            String horario = myRs.getString("horario");
            String teacher = myRs.getString("teacher");

            Grupo tempGrupo = new Grupo(id, dia, horario, teacher);

            return tempGrupo;
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
