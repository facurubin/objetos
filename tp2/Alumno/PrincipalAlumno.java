
/**
 *Clase Principal Alumno.
 * 
 * @author (Facundo Rubin) 
 */
public class PrincipalAlumno
{
    public static void main(String[] args)
    {
        Alumno AlumnoUno = new Alumno(2020,"Juan","Perez");
        AlumnoUno.setNota1(5.99);
        AlumnoUno.setNota2(10);
        AlumnoUno.mostrar();
        Alumno AlumnoDos = new Alumno(2051,"Maria","Gomez");
        AlumnoDos.setNota1(7.85);
        AlumnoDos.setNota2(8.5);
        AlumnoDos.mostrar();
    }
}
