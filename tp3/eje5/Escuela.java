/**
*Clase Escuela
*@autor(Facundo Rubin)
*@version(03/09/12)
**/
public class Escuela{
	private String nombre;
	private String domicilio;
	private String director;

	/**
 	*Metodo costructor 3 parametros
 	*@param nombre string
 	*@param domicilio string
 	*@param director string
 	*/
	public Escuela(String p_nombre,String p_domicilio,String p_director)
	{
		this.setNombre(p_nombre);
		this.setDomicilio(p_domicilio);
		this.setDirector(p_director);
	}

	/**
 	*Metodo costructor sin parametros
 	*/
	public Escuela()
	{
		this.setNombre("");
		this.setDomicilio("");
		this.setDirector("");
	}
	public String getNombre()
	{
		return this.nombre;
	}
	public String getDomicilio()
	{
		return this.domicilio;
	}
	public String getDirector()
	{
		return this.director;
	}
	private void setNombre(String p_nombre)
	{
		this.nombre = p_nombre;
	}
	private void setDomicilio(String p_domicilio)
	{
		this.domicilio = p_domicilio;
	}
	private void setDirector(String p_director)
	{
		this.director = p_director;
	}
	public void imprimirRecibo(Docente p_docente)
	{
		System.out.print("Escuela: "+this.getNombre()); 
		System.out.print("\tDomicilio: "+this.getDomicilio()); 
		System.out.println("\tDirector: "+this.getDirector()); 
		System.out.println("--------------------------------------------------------------");
		System.out.println("Docente:"+p_docente.getNombre());
		System.out.println("Sueldo: .................................. $"+p_docente.calcularSueldo());
		System.out.println("Sueldo Básico..............................$"+p_docente.getSueldoBasico());
		System.out.println("Asignación familiar........................$"+p_docente.getAsignacionFamiliar());
	}

}