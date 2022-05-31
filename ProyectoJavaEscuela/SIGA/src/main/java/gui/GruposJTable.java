/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import proyecto1.Grupo;

/**
 *
 * @author adair
 */
public class GruposJTable extends AbstractTableModel {
    private static final int DIA_COL = 0;
    private static final int HORARIO_COL = 1;
    private static final int TEACHER_COL = 2;

    private String[] columnNames = { "Dia", "Horario", "Teacher" };
    private List<Grupo> Grupos;

    public GruposJTable(List<Grupo> theGrupos) {
            Grupos = theGrupos;
    }

    @Override
    public int getColumnCount() {
            return columnNames.length;
    }

    @Override
    public int getRowCount() {
            return Grupos.size();
    }

    @Override
    public String getColumnName(int col) {
            return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {

            Grupo tempGrupo = Grupos.get(row);

            switch (col) {
            case DIA_COL:
                return tempGrupo.getDia();
            case HORARIO_COL:
                return tempGrupo.getHorario();
            case TEACHER_COL:
                return tempGrupo.getTeacher();
            default:
                return tempGrupo.getDia();
            }
    }

    @Override
    public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
    }
    
}
