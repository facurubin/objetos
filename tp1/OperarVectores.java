/** 
 *Calcula el perimetro de una circunferencia.
 * 
 * @author (Facundo Rubin)
 */
import java.util.Scanner;
public class OperarVectores
{
    public static void main( String[] args)
    {
        int[] nota = new int[5];
        Scanner teclado = new Scanner(System.in);
        for (int i=0;i<5;i++){
        System.out.println("Ingrese nota "+(i+1)+": "); 
        nota[i] = teclado.nextInt(); 
        }
        int mayor=nota[0];
        if (nota[1]>mayor)
        {
            mayor=nota[1];
        }
        if (nota[2]>mayor)
        {
            mayor=nota[2];
        }
        if (nota[3]>mayor)
        {
            mayor=nota[3];
        }
        float promedio = ((float)nota[0]+(float)nota[1]+(float)nota[2]+(float)nota[3])/4;
        System.out.println("La mayor nota es: "+ mayor); 
        System.out.println("El promedio es: "+ promedio);
    }    
}
