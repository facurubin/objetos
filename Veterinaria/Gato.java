/**
 * Clase Gato
 * 
 * @author (Rubin Facundo)
 * @version 10/10/2012
 */
public class Gato extends Animal
{
    public Gato(String p_nombre,int p_edad,double p_costo)
    {
        super(p_nombre,p_edad,p_costo);
    }
    public String emitirSonido()
    {
        return "Miau !";
    }
    public String queAnimal()
    {
        return "Soy un gato!";
    }
}