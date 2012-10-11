/**
*Clase Punto
*@autor(Facundo Rubin)
*@version(03/09/12)
**/

import java.util.Random;
import java.util.Scanner;
public class CreaFigura{
	public static void main(String args[])
	{
	double p_x = Double.valueOf(args[0]);
	double p_y = Double.valueOf(args[1]);

	Random unNumero = new Random();
	double num = unNumero.nextDouble() * 100.0;
	double num1 = unNumero.nextDouble() * 100.0;
	Rectangulo unRectangulo = new Rectangulo(num,num1);
	unRectangulo.desplazar(p_x,p_y);
	unRectangulo.caracteristicas();	
	//Obtengo datos de nuevo Rectangulo por Scanner
	Scanner teclado = new Scanner(System.in);
	System.out.println("X: ");
	p_x = teclado.nextDouble();
	System.out.println("Y: ");
	p_y = teclado.nextDouble();
	num = unNumero.nextDouble() * 100.0;
	num1 = unNumero.nextDouble() * 100.0;
	Rectangulo otroRectandulo = new Rectangulo(new Punto(20,40),num,num1);
	
	unRectangulo.elMayor(otroRectandulo).caracteristicas();
	System.out.println("Distancia :"+unRectangulo.distanciaA(otroRectandulo));
	}
}
