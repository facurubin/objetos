/**
	*Clase Circulo.
	*@autor (Facundo Rubin)
	*@version (25/08/12)
	*/
public class Circulo{
	private double radio;
	private Punto centro;

	/**
	*Metodo Constructor.
	*@param radio Double
	*@param punto Punto
	*/
	public Circulo(double p_radio,Punto p_centro){
		this.setRadio(p_radio);
		this.setCentro(p_centro);
	}
	/**
	*Metodo Constructor sin parametros.
	*/
	public Circulo(){
		this.setRadio(0.0);
		this.setCentro(new Punto());
	}
	private void setRadio(double p_radio){
		this.radio=p_radio;
	}
	private void setCentro(Punto p_centro){
		this.centro=p_centro;
	}
	public Punto getCentro(){
		return this.centro;
	}
	public double getRadio(){
		return this.radio;
	}
	public void desplazar(double p_dx,double p_dy){
		this.getCentro().desplazar(p_dx,p_dy);
	}
	public void caracteristicas(){
		System.out.println("t***** Circulo *****");
		System.out.println("Centro: "+this.getCentro().coordenadas()+"Radio: "+this.getRadio());
		System.out.println("Superficie: "+this.superficie()+" - Perimetro: "+this.perimetro());
	}
	public double perimetro(){
		return (2*this.getRadio())*Math.PI;
	}
	public double superficie(){
		return Math.PI*Math.pow(this.getRadio(),2);
	}
	public double distanciaA(Circulo otroCirculo){
		return this.getCentro().distanciaA(otroCirculo.getCentro());
	}
	public Circulo elMayor(Circulo otroCirculo){
		if(this.getRadio()>otroCirculo.getRadio()){
			return this;	
		}else{
			return otroCirculo;
		}
	}
}