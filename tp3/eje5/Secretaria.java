/**
*Clase Secretaria
*@autor(Facundo Rubin)
*@version(03/09/12)
**/
import java.util.Scanner;
public class Secretaria{
	public static void main(String args[])
	{
		Escuela unaEscuela = new Escuela("Manuel Belgrano","Irigoyen 1580,","Leopoldo Juez");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese Nombre del Docente: ");
		String nombre = teclado.next();
		System.out.println("Ingrese Grado del Docente: ");
		String grado = teclado.next();
		System.out.println("Ingrese Sueldo Basico del Docente: ");
		double sueldo = teclado.nextDouble();
		System.out.println("Ingrese Asignacion Familiar del Docente: ");
		double asignacion = teclado.nextDouble();
		Docente unDocente = new Docente(nombre,grado,sueldo,asignacion);
		unaEscuela.imprimirRecibo(unDocente);
	}
}