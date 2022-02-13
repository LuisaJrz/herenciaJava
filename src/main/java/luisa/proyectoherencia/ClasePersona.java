package luisa.proyectoherencia;

/**
 *
 * @author Luisa
 */
public class ClasePersona {

    private String nombre;
    private String apellidos;
    private int edad;

    //Constructor
    public ClasePersona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //Métodos
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

}
