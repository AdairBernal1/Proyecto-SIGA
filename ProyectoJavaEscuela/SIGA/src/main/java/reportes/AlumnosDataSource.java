
package reportes;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRField;
import dao.AlumnoDAO;
import java.util.ArrayList;
import java.util.List;
import proyecto1.Alumno;


public class AlumnosDataSource implements JRDataSource {
    
    List<Alumno> Alumnos= new ArrayList <Alumno>();
    
    private List<Alumno> listadoAlumnos = null;
    AlumnoDAO AlumnoDao = new AlumnoDAO();
    private int index;
    
    public AlumnosDataSource() throws Exception{
        index = -1;
        
        listadoAlumnos = AlumnoDao.getAllAlumnos();
    }
    @Override
    public boolean next() throws JRException {
        index += 1;
        return (index < listadoAlumnos.size());
    }

    public Object getFieldValue(JRField jrf) throws JRException {
        Object value = null;
        Alumno alumno = new Alumno();
        
        String fieldname = jrf.getName();
        
        switch(fieldname) {
            
            case "nombre":
                alumno = listadoAlumnos.get(index);
                value = alumno.getNomCompleto();
                break;
                
            case "grupo":
                alumno = listadoAlumnos.get(index);
                value = alumno.getGrupo();
                break;
                
            case "tipo_ins":
                alumno = listadoAlumnos.get(index);
                value = alumno.getTipoInsc();
                break;
                
            case "tel":
                alumno = listadoAlumnos.get(index);
                value = alumno.getTelefono();
                break;
           
        }
        return value;
    }
    
    public static JRDataSource getDataSource() throws Exception{
        return new AlumnosDataSource() {
        };
    }
    
}   
     

