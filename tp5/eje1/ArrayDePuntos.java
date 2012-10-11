import java.util.*;
public class ArrayDePuntos{
	public static void main(String[] args)
	{
		Punto[] puntos = new Punto[6];
		Scanner teclado = new Scanner(System.in);
		int x=0;
		int y=0;
		for(int i=0;i<6;i++)
		{
			System.out.println("Ingrese x: ");
			x=teclado.nextInt();
			System.out.println("Ingrese x: ");
			y=teclado.nextInt();
			puntos[i]= new Punto(x,y);
			System.out.println(puntos[i].coordenadas());
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("La distancia es del punto "+i+" al "+(i+1)+":"+puntos[i].distanciaA(puntos[i+1]));
		}
	}
}