/**
 *Calcula las raices reales de una ecuacion de segundo grado
 * 
 * @author (Facundo Rubin) 
 */
import java.util.Scanner;

public class Ecuacion
{
    public static void main (String[] args) 
    {
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        int c = Integer.valueOf(args[2]);
        
        int discriminante = (int)Math.pow(b,2)+(-4*a*c);
        System.out.println("Discriminante: "+discriminante);
        int raizPos=b+(int)Math.sqrt(discriminante)/2*a;
        if (discriminante<0)
        {
            System.out.println("Las raices de esta ecuacion son imaginarias.");
        }else if (discriminante==0)
        {
        System.out.println("Las raices de esta ecuacion son "+raizPos+" y -"+raizPos+"."); 
        }else
        {
            double raizNeg=b-((int)Math.sqrt(discriminante))/2*a;    
            System.out.println("Las raices de esta ecuacion son "+raizPos+" y "+raizNeg+"."); 
        }
    }
}

    