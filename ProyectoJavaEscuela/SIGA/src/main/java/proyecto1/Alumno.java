package proyecto1;

public class Alumno {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoInsc() {
        return tipoInsc;
    }

    public void setTipoInsc(String tipoInsc) {
        this.tipoInsc = tipoInsc;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getFechaInsc() {
        return fechaInsc;
    }

    public void setFechaInsc(String fechaInsc) {
        this.fechaInsc = fechaInsc;
    }
    
    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }
    int id;
    String nombre;
    String apellido;
    String nomCompleto;
    String telefono;
    String tipoInsc;
    String grupo;
    String fechaInsc;
    
    public Alumno(){
        
    }
    
    //Constructor para busquedas y displays
    public Alumno (int id, String nombre, String apellido, String telefono, String tipoInsc, String grupo, String fechaInsc){
        super();
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.nomCompleto=(apellido+" "+nombre);
        this.telefono=telefono;
        this.tipoInsc=tipoInsc;
        this.grupo=grupo;
        this.fechaInsc=fechaInsc;
    }
    
}
