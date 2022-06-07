
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
    
    private List<Alumno> listadoAlumnos = null;
    AlumnoDAO AlumnoDao = new AlumnoDAO();
    private int index;
    
    public AlumnosDataSource() throws Exception{
        index = -1;
<<<<<<< Updated upstream
        listadoAlumnos = AlumnoDao.getAllAlumnos();
=======
        listadoAlumnos = new Object[][]{
                    {"Carla", "Sabado12:00pm - 3:00pm", "6681902070", "Semanal"},
                    {"carla", "Domingo12:00pm - 3:00pm", "6681902070", "Mensual"},
                    {"javc", "Sabado9:00am - 12:00pm", "456456", "Semanal"},
                    {"carla", "Domingo12:00pm - 3:00pm", "6681902070", "Mensual"},
                    {"carla", "Sabado9:00am - 12:00pm", "6681902070", "Semanal"},
                    {"adair", "Domingo9:00am - 12:00pm", "666819493", "Mensual"},
                  };
>>>>>>> Stashed changes
    }
    @Override
    public boolean next() throws JRException {
        index += 1;
        return (index < listadoAlumnos.size());
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object value = null;
        Alumno alumno = new Alumno();
        
        String fieldname = jrf.getName();
        
        switch(fieldname) {
            
<<<<<<< Updated upstream
            case "nomCompleto":
                alumno = listadoAlumnos.get(index);
                value = alumno.getNomCompleto();
                break;
                
            case "grupo":
                alumno = listadoAlumnos.get(index);
                value = alumno.getGrupo();
                break;
                
            case "tipoInsc":
                alumno = listadoAlumnos.get(index);
                value = alumno.getTipoInsc();
                break;
=======
            case "nombre":
                value = listadoAlumnos[index][0];
            break;
            
            case "grupo":
                value = listadoAlumnos[index][1];                
            break;
            
            case "tipo_ins":
                value = listadoAlumnos[index][3];
            break;
            

            
>>>>>>> Stashed changes
        }
        return value;
    }
    
    public static JRDataSource getDataSource() throws Exception{
        return new AlumnosDataSource();
    }
    
}   
     

