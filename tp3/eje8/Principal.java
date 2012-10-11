/**
*Clase ejecutable Persona.
*@autor(Facundo Rubin)
*@version(11/09/12)
**/
import java.util.*;
public class Principal{
    /**
    *@param dia: entero
    *@param mes: entero
    *@param año: entero
    */
    public static void main(String args[])
    {
        int dia = Integer.valueOf(args[0]);
        int mes = Integer.valueOf(args[1]);
        int anio = Integer.valueOf(args[2]);

        Calendar unaFecha = new GregorianCalendar();
        unaFecha.set(anio,mes,dia);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Dni: ");
        int dni = teclado.nextInt();
        System.out.println("Ingrese Nombre: ");
        String nombre = teclado.next();
        System.out.println("Ingrese Apellido: ");
        String apellido = teclado.next();

        Persona unaPersona = new Persona(dni,apellido,nombre,unaFecha);
        unaPersona.mostrar();
        
    }
}