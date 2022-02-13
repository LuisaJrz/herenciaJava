package luisa.proyectoherencia;

/**
 *
 * @author Luisa
 */
public class PruebaHerencia {

    public static void main(String[] args) {

        ClaseProfesor profesor1 = new ClaseProfesor("Juan", "Hernández García", 33);
        profesor1.setIdProfesor("Prof 22-387-11");
        profesor1.mostrarNombreApellidosYCarnet();
        
        ClaseAlumno alumno1 = new ClaseAlumno("Luisa","Juárez Solís",30);
        alumno1.setIdAlumno("Alum 324356745");
        alumno1.setGrupoAlumno("404-A");
        alumno1.mostrarInfoAlumno();
    }

}
