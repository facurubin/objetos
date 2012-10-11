/**
 *Muestra por pantalla multiplos de cuatro en el rango de 42 y 150 inclusive.
 * 
 * @author (Facundo Rubin)
 */
public class eje2
{
   public static void main (String[] args)
   {
       for(int i=42;i<151;i++)
       {
           if ((i%4)==0)
           //Calcula si es una division sin resto
           {
               System.out.println(i);
           }
       }
   }

}