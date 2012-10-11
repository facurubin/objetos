/**
 * Clase Perro
 * 
 * @author (Rubin Facundo)
 * @version 10/10/2012
 */
public class Perro extends Animal
{
    public Perro(String p_nombre,int p_edad,double p_costo)
    {
        super(p_nombre,p_edad,p_costo);
    }
    public String emitirSonido()
    {
        return "Guau !";
    }
    public String queAnimal()
    {
        return "Soy un perro!";
    }
    public double precioVenta()
    {
        return super.precioVenta()+50;
    }
}
