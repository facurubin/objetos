/**
*Clase ejecutable que crea un Circulo a partir de la clase Punto (siendo este el centro)
*hace uso de la clase predefinida para generar numeros aleatoriamente.
*@autor(Facundo Rubin)
*@version(03/09/12)
**/
import java.util.Random;
public class CreaFigura{
	public static void main(String Args[]){
		Random unNumero = new Random();
		//radio generado aleatoriamente
		double radio = unNumero.nextDouble()*100.0;
		Circulo unCirculo = new Circulo(radio,new Punto());
		//instancia unCirculo generada usando costructor Punto sin parametros.
		unCirculo.desplazar(-240,-230);
		unCirculo.caracteristicas();
		radio = unNumero.nextDouble()*100.0;
		Circulo otroCirculo = new Circulo(radio,new Punto(5.2,0.5));
		otroCirculo.caracteristicas();
		unCirculo.elMayor(otroCirculo);
		System.out.println("Distancia: "+unCirculo.distanciaA(otroCirculo));
	}
}