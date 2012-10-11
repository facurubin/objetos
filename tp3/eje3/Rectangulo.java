/**
*Clase Rectangulo
*@autor(Facundo Rubin)
*@version(03/09/12)
**/
public class Rectangulo{
	private Punto origen;
	private double ancho;
	private double alto;

	/**
 	*Metodo costructor 3 parametros
 	*@param origen punto
 	*@param ancho double
 	*@param alto double
 	*/
	public Rectangulo(Punto p_origen, double p_ancho, double p_alto)
	{
		this.setOrigen(p_origen);
		this.setAncho(p_ancho);
		this.setAlto(p_alto);
	}
	/**
 	*Metodo costructor 2 parametros
 	*@param ancho double
 	*@param alto double
 	*/
	public Rectangulo(double p_ancho, double p_alto)
	{
		this.setOrigen(new Punto());
		this.setAncho(p_ancho);
		this.setAlto(p_alto);
	}
	/**
 	*Metodo costructor sin parametros
 	*/
	public Rectangulo()
	{
		this.setOrigen(new Punto());
		this.setAncho(0);
		this.setAlto(0);
	}
	public void setAncho(double p_ancho)
	{
		this.ancho = p_ancho;
	} 
	public void setAlto(double p_alto)
	{
		this.alto = p_alto;
	}
	public void setOrigen(Punto p_origen)
	{
		this.origen = p_origen;
	}
	private double getAncho()
	{
		return this.ancho;
	}
	private double getAlto()
	{
		return this.alto;
	}
	private Punto getOrigen()
	{
		return this.origen;
	}
	public void desplazar(double p_dx, double p_dy)
	{
		this.getOrigen().desplazar(p_dx,p_dy); 
	}
	public void caracteristicas(){
	System.out.println("****** Rectangulo ******");
	System.out.println("Origen: "+this.getOrigen().coordenadas()+"- Alto: "+this.getAlto()+"- Ancho: "+this.getAlto());
	System.out.println("Superficie: "+this.superficie()+"- Perímetro: "+this.perimetro());
	}	
	public double perimetro()
	{
		return (this.getAlto()+this.getAncho())*2;
	}
	public double superficie()
	{
		return this.getAlto()*this.getAncho();
	}
	public double distanciaA(Rectangulo otroRectangulo)
	{
		return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
	}
	public Rectangulo elMayor(Rectangulo otroRectangulo)
	{
		if(this.superficie()>otroRectangulo.superficie())
			return this;
		else
			return otroRectangulo; 
	}
}