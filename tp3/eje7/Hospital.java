/**
*Clase Localidad
*@autor(Facundo Rubin)
*@version(06/09/12)
**/

public class Hospital
{
private String nombreHospital;
private String nombreDirector;
 /**
    *Metodo constructor
    *@param nombre Director: string
    *@param nombre Hospital: string
    */
public Hospital(String p_director, String p_hosital)
	{
		this.setNombreHospital(p_hosital);
		this.setNombreDirctor(p_director);
	}	
private void setNombreDirctor(String p_director)
	{
		this.nombreDirector = p_director;
	}
private void setNombreHospital(String p_hosital)
	{
		this.nombreHospital = p_hosital;
	}
public String getNombreDirector()
	{
		return this.nombreDirector;
	}
public String getNombreHospital()
	{
		return this.nombreHospital;
	}
	/**
    *Metodo consultaDatosFiliatorios muestra por pantalla 
    *los datos del pasiente (conocimiento Paciente por parametro)
    *y datos del Hospital.
    */	
public void consultaDatosFiliatorios(Paciente p_paciente)
	{
		System.out.println("Hospital: "+this.getNombreHospital()+"      Director:"+this.getNombreDirector());
		System.out.println("---------------------------------------------------------------------------------------");
		p_paciente.mostrarDatosPantalla();
	}
}
