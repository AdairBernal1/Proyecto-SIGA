
package proyecto1;

public class Grupo {
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    
    int id;
    String dia;
    String horario;
    String teacher;
    
    public Grupo(){
        
    }
    
    public Grupo(int id, String dia, String horario, String teacher) {
       super();
       this.id=id;
       this.dia=dia;
       this.horario=horario;
       this.teacher=teacher;
    }

}
