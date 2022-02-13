package luisa.proyectoherencia;

/**
 *
 * @author Luisa
 */
//subclase de persona
public class ClaseProfesor extends ClasePersona {

    //Campos específicos de la subclase.
    private String idProfesor;

    //Constructor de la subclase
    public ClaseProfesor(String nombre, String apellidos, int edad) {

        super(nombre, apellidos, edad);

        idProfesor = "Unknown";
    } //Cierre del constructor

    //Métodos específicos de la subclase profesor
    public void setIdProfesor(String IdProfesor) {
        this.idProfesor = IdProfesor;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void mostrarNombreApellidosYCarnet() {
        System.out.println("Profesor de nombre: " + getNombre() + " " + getApellidos()
                + " con Id de profesor: " + getIdProfesor());
    }

}
