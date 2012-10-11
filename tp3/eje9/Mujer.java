/**
*Clase Persona
*@autor(Facundo Rubin)
*@version(06/09/12)
**/

public class Mujer{
private String nombre;
private String apellido;
private int edad;
private String estadoCivil;
private Hombre esposo;

public Mujer(String p_nombre, String p_apellido, int p_edad)
{
	this.setNombre(p_nombre);
	this.setApellido(p_apellido);
	this.setEdad(p_edad);
	this.setEstadoCivil("soltera");
}
public Mujer(String p_nombre, String p_apellido, int p_edad,Hombre p_esposo)
{
	this.setNombre(p_nombre);
	this.setApellido(p_apellido);
	this.setEdad(p_edad);
	this.casarseCon(p_esposo);
	this.setEstadoCivil("casada");
}
public Mujer()
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
private void setEsposo(Hombre p_esposo)
{
	this.esposo = p_esposo;
	this.setEstadoCivil("casada");
}
public Hombre getEsposo()
{
	return this.esposo;
}
public void casarseCon(Hombre p_hombre)
{
 this.setEsposo(p_hombre);
 this.setEstadoCivil("casada");
}
public void divorcio()
{
	this.setEsposa(new Hombre());
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
	System.out.println(this.datos()+" esta casado con "+this.getEsposo().datos());	
}
}
