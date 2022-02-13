package luisa.proyectoherencia;

/**
 *
 * @author Luisa Jrz
 */
public class ClaseAlumno extends ClasePersona{
    
     private String idAlumno;
     private String grupoAlumno;

    //Constructor de la subclase
    public ClaseAlumno(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        idAlumno = "Unknown";
    } //Cierre del constructor

    //Métodos específicos de la subclase profesor
    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getIdAlumno() {
        return idAlumno;
    }
    
    public void setGrupoAlumno(String grupoAlumno) {
        this.grupoAlumno = grupoAlumno;
    }

    public String getGrupoAlumno() {
        return grupoAlumno;
    }

    public void mostrarInfoAlumno() {
        System.out.println("El alumno de nombre: " + getNombre() + " " + getApellidos()
                + " con Id de alumno: " + getIdAlumno()+" pertenece al grupo: "+
                getGrupoAlumno());
    }
    
}
