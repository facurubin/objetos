/**
 *Ordenar elementos ingresados por teclado de un vertor con el metodo de Burbuja.
 * 
 * @author (Facundo Rubin) 
 */
import java.util.Scanner;
public class OrdenarVector{

    public static void main(String[] args)
    {
        double[] elem = new double[4];
        Scanner teclado = new Scanner(System.in);
        //Bucle for ingreso 4 elemntos
        for (int i=0; i< 4;i++)
            {
                System.out.println("Ingrese elemento numero "+(1+i)+": "); 
                elem[i] = teclado.nextDouble();
            }
        //Metodo burbuja 
        for (int j=0; j<elem.length;j++)
        {
            for (int i=0; i<elem.length-1;i++)
            {
                if(elem[i+1]<elem[i])
                {
                    double aux=elem[i];
                    elem[i]=elem[i+1];
                    elem[i+1]=aux;
                }
            }
        }
        System.out.println("El menor elemento es: "+elem[0]);
        System.out.println(elem[0]+"\t"+elem[1]+"\t"+elem[2]+"\t"+elem[3]);
}   }