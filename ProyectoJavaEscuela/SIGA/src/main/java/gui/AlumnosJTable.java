/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import proyecto1.Alumno;

/**
 *
 * @author adair
 */
public class AlumnosJTable extends AbstractTableModel {
    
    private static final int APELLIDO_COL = 0;
    private static final int NOMBRE_COL = 1;
    private static final int TEL_COL = 2;
    private static final int GRUPO_COL = 3;
    private static final int FECHAINS_COL = 4;
    private static final int TIPOINS_COL = 5;


    private String[] columnNames = { "Apellido", "Nombre", "Telefono",
                    "Grupo", "Fecha Ingreso", "Matricula" };
    private List<Alumno> Alumnos;

    public AlumnosJTable(List<Alumno> theAlumnos) {
            Alumnos = theAlumnos;
    }

    @Override
    public int getColumnCount() {
            return columnNames.length;
    }

    @Override
    public int getRowCount() {
            return Alumnos.size();
    }

    @Override
    public String getColumnName(int col) {
            return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {

            Alumno tempAlumno = Alumnos.get(row);

            switch (col) {
            case APELLIDO_COL:
                return tempAlumno.getApellido();
            case NOMBRE_COL:
                return tempAlumno.getNombre();
            case TEL_COL:
                return tempAlumno.getTelefono();
            case GRUPO_COL:
                return tempAlumno.getGrupo();
            case FECHAINS_COL:
                return tempAlumno.getFechaInsc();
            case TIPOINS_COL:
                return tempAlumno.getTipoInsc();
            default:
                return tempAlumno.getApellido();
            }
    }

    @Override
    public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
    }
    
}
