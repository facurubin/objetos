/**
*Clase Paciente
*@autor(Facundo Rubin)
*@version(06/09/12)
**/
public class Paciente{
	private int historiaClinica;
	private String nombre;
	private String domicilio;
	private Localidad localidadNacido;
	private Localidad localidadVive;

	/**
     *Metodo Costructor con 5 parametros
     *@param historiaClinica: int
     *@param nombre: String
     *@param domicilio: String
     *@param localidadNacido: Localidad
     *@param localidadVive: Localidad
    */
	public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
		this.setDomicilio(p_domicilio);
		this.setNombre(p_nombre);
		this.setHistoriaClinica(p_historia);
		this.setNacio(p_localidadNacido);
		this.setVive(p_localidadVive);
	}
	/**
     *Metodo Costructor sin parametros
    */
	public Paciente(){
		this.setDomicilio("");
		this.setNombre("");
		this.setHistoriaClinica(0);
		this.setNacio(new Localidad());
		this.setVive(new Localidad());	
	}
	public int getHistoriaClinica(){
		return this.historiaClinica;
	}
	public String getNombre(){
		return this.nombre;
	}
	public String getDomicilio(){
		return this.domicilio;
	}
	public Localidad getVive(){
		return this.localidadVive;
	}
	public Localidad getNacio(){
		return this.localidadNacido;
	}
	private void setHistoriaClinica(int p_historia){
		this.historiaClinica = p_historia;
	}
	private void setDomicilio(String p_domicilio){
		this.domicilio = p_domicilio;
	}
	private void setNombre(String p_nombre){
		this.nombre = p_nombre;
	}
	private void setVive(Localidad p_localidadVive){
		this.localidadVive = p_localidadVive;
	}
	private void setNacio(Localidad p_localidadNacido){
		this.localidadNacido = p_localidadNacido;
	}
	public void mostrarDatosPantalla(){
		System.out.println("Paciente: "+this.getNombre()+"\t Historia Clínica:"+this.getHistoriaClinica()+"\t Domicilio: "+this.getDomicilio());
		this.getVive().mostrar();
	}
	public String cadenaDeDatos(){
		return this.getNombre()+"......"+this.getHistoriaClinica()+"..... "+this.getDomicilio()+"-"+this.getVive().getNombre()+"–"+this.getVive().getProvincia();
	}

}