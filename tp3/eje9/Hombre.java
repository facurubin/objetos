/**
*Clase Persona
*@autor(Facundo Rubin)
*@version(06/09/12)
**/

public class Hombre{
private String nombre;
private String apellido;
private int edad;
private String estadoCivil;
private Mujer esposa;

 	/**
    *Metodo constructor con 3 parametros
    *@param nombre: string
    *@param apellido: string
    *@param edad: entero
    */
public Hombre(String p_nombre, String p_apellido, int p_edad)
{
	this.setNombre(p_nombre);
	this.setApellido(p_apellido);
	this.setEdad(p_edad);
	this.setEstadoCivil("soltero");
}

 	/**
    *Metodo constructor con 4 parametros
    *@param nombre: string
    *@param apellido: string
    *@param edad: entero
    *@param mujer: Mujer
    */
public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa)
{
	this.setNombre(p_nombre);
	this.setApellido(p_apellido);
	this.setEdad(p_edad);
	this.casarseCon(p_esposa);
	this.setEstadoCivil("casado");
}
public Hombre()
{
	this.setNombre("");
	this.setApellido("");
	this.setEdad(0);
	this.setEstadoCivil("");
}
private void setNombre(String p_nombre)
{
	this.nombre = p_nombre;
}
private void setApellido(String p_apellidp)
{
	this.apellido = p_apellidp;
}
private void setEdad(int p_edad)
{
	this.edad = p_edad;
}
private void setEstadoCivil(String p_estado)
{
	this.estadoCivil = p_estado;
}
private void setEsposa(Mujer p_esposa)
{
	this.esposa = p_esposa;
}
public String getNombre()
{
	return this.nombre;
}
public String getApellido()
{
	return this.apellido;
}
public int getEdad()
{
	return this.edad;
}
public String getEstadoCivil()
{
	return this.estadoCivil;
}
public Mujer getEsposa()
{
	return this.esposa;
}
public void casarseCon(Mujer p_mujer)
{
 this.setEsposa(p_mujer);
 this.setEstadoCivil("casado");
}
public void divorcio()
{
	this.setEsposa(new Mujer());
	this.setEstadoCivil("");
}
public String datos()
{
	return this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años"; 
}
public void mostrarEstadoCivil()
{
	System.out.println(this.datos()+" - "+this.getEstadoCivil());
}
public void casadaCon()
{
	System.out.println(this.datos()+" esta casado con "+this.getEsposa().datos());	
}
}
