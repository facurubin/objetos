/**
 *Calcula el perimetro de una circunferencia. Al finalizar pregunta si desea calcular otro perimetro, 
 *siendo "si" la condicion para continuar. 
 * 
 * @author (Facundo Rubin)
 */
import java.util.Scanner;
public class CircunferenciaMod
{
  public static void main (String[] args)
  {
   String fin = "no";
   do{
        
        Scanner teclado = new Scanner(System.in);     
        System.out.println ("Ingrese Radio: ");
        float radio = teclado.nextFloat();
        System.out.println("Perimetro: " + ((2*3.14)*radio));
        System.out.println ("Escriba si para calcular otro Perimetro: ");
        fin = teclado.next();
    }while (fin.equals("si"));
   }   
}