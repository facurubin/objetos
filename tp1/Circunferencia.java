/**
 *Calcula la el perimetro de una circunferencia.
 * 
 * @author (Facundo Rubin)
 */
public class Circunferencia
{
  public static void main (String[] args)
  {
      float radio = Float.valueOf(args[0]);
      System.out.println("Perimetro: " + (2*3.14*radio));
    }
}
