/**
 *Dermina el semiperimetro y el area de un triangolo.
 * 
 * @author (Facundo Rubin) 
 */
public class eje4
{
    public static void main(String[] args)
    {
        double a= Double.valueOf(args[0]);
        double b= Double.valueOf(args[1]);
        double c= Double.valueOf(args[2]);
        double semip=((a+b+c)/2);
        double area= Math.sqrt(semip*(semip-a)*(semip+b)*(semip-c));
        System.out.println("El semiperimetro es de: " + semip);
        System.out.println("El area es de: "+area);
    }
}