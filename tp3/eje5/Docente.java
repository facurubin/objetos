/**
*Clase Docente
*@autor(Facundo Rubin)
*@version(03/09/12)
**/
public class Docente{
	private String nombre;
	private String grado;
	private double sueldoBasico;
	private double asignacionFamiliar;

	public Docente(String p_nombre,String p_grado,double p_sueldoBasico,double p_asignacionFamiliar)
	{
		this.setNombre(p_nombre);
		this.setGrado(p_grado);
		this.setSueldoBasico(p_sueldoBasico);
		this.setAsignacionFamiliar(p_asignacionFamiliar);
	}
	public String getNombre()
	{
		return this.nombre;
	}
	public String getGrado()
	{
		return this.grado;
	}
	public double getSueldoBasico()
	{
		return this.sueldoBasico;
	}
	public double getAsignacionFamiliar()
	{
		return this.asignacionFamiliar;
	}
	private void setNombre(String p_nombre)
	{
		this.nombre = p_nombre;
	}
	private void setGrado(String p_grado)
	{
		this.grado = p_grado;
	}
	private void setAsignacionFamiliar(double p_asignacionFamiliar)
	{
		this.asignacionFamiliar = p_asignacionFamiliar;
	}
	private void setSueldoBasico(double p_sueldoBasico)
	{
		this.sueldoBasico = p_sueldoBasico;
	}
	public double calcularSueldo()
	{
		return this.getSueldoBasico()+this.getAsignacionFamiliar();
	}
}