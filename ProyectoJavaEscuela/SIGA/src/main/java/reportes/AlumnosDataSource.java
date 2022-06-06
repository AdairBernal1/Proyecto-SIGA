
package reportes;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRField;
import dao.AlumnoDAO;
import java.util.ArrayList;
import java.util.List;
import proyecto1.Alumno;


public class AlumnosDataSource implements JRDataSource {
    
//    List<Alumno> Alumnos= new ArrayList <Alumno>();
    
    private final Object [][] listadoAlumnos;
    private int index;
    
    public AlumnosDataSource(){
    index = -1;
    listadoAlumnos = new Object[][]{
        
        
    
    
    };
    }
    @Override
    public boolean next() throws JRException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}   
     

