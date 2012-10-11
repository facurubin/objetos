/**
 * Clase Punto.
 * 
 * @autor(Facundo Rubin)
 */

public class Punto
{
    private double x;
    private double y;
    
    public Punto()
    /**
     *Metodo Costructor sin parametros.
    */
    {
        this.setX(0);
        this.setY(0);
    }
    /**
     *Metodo Costructor.
     *@param p_x
     *@param p_y
    */
    public Punto(double p_x, double p_y)
    {
        this.setX(p_x);
        this.setY(p_y);
    } 
    /**
     *Metodo Costructor.
     *@param p_x
     *@param p_y
    */
    private void setX(double p_x)
    {
        this.x = p_x;
    }
    private void setY(double p_y)
    {
        this.y = p_y;
    }
    public double getX()
    {
        return this.x;
    }
    
    public double getY()
    {
        return this.y;
    }
    public double distanciaA(Punto p_ptoDistante)
    {
        return Math.sqrt(Math.pow(p_ptoDistante.getX()-this.getX(),2)+Math.pow(p_ptoDistante.getY()-this.getY(),2));
    }
    public void desplazar(double p_dx,double p_dy)
    {
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    public void mostrar()
    {
        System.out.println("Punto. X: "+this.getX()+". Y."+this.getY());
    }
    public String coordenadas()
    {
        return "("+this.getX()+","+this.getY()+")";
    }
} 