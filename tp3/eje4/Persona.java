/**
*Clase Persona
*@autor(Facundo Rubin)
*@version(06/09/12)
**/

import java.util.*;
public class Persona
{
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
    
    /**
     *Metodo Costructor con 3 parametros.
     *@param nroDin: entero
     *@param nombre: string
	 *@param apellido: string
	 *@param año de nacimiento: int
    */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio)
    {
        this.setDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    /**
     *Metodo Costructor con 3 parametros.
     *@param nroDin: entero
     *@param nombre: string
	 *@param apellido: string
	 *@param fecha nacimiento: Calendar
    */
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha)
    {
        this.setDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }
    /**
     *Metodo Costructor sin parametros.
     */
    public Persona()
    {
        this.setDni(0);
        this.setNombre("");
        this.setApellido("");
        this.setAnioNacimiento(0);
    }
    
    //Seters: cargan valores en los atributos
    private void setDni(int p_dni)
    {
        this.nroDni=p_dni;
    }
    private void setNombre(String p_nombre)
    {
        this.nombre=p_nombre;
    }
    private void setApellido(String p_apellido)
    {
        this.apellido=p_apellido;
    }
    //////
    public Calendar getFechaNacimiento()
    {
        return this.fechaNacimiento;
    }
     public void setFechaNacimiento(Calendar p_fecha)
    {
        this.fechaNacimiento = p_fecha;
    }
    public int getAnioNacimiento()
    {
        return this.fechaNacimiento.get(Calendar.YEAR);
    }
    private void setAnioNacimiento(int p_anio)
    {	
		Calendar f1=Calendar.getInstance();
        f1.set(p_anio, 1, 1);
        this.setFechaNacimiento(f1);
    }
    
    ///////
    public int getDni()
    {
        return this.nroDni;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public String getApellido()
    {
        return this.apellido;
    }
    public int edad()
    {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return (anioHoy - this.getAnioNacimiento() );
    }
    public String nomYApe()
    {
        return this.getNombre()+ " " + this.getApellido();
    }
    public String apeYNom()
    {
        return this.getApellido()+ " " + this.getNombre();
    }
    public void mostrar()
    {
        System.out.println("Nombre y Apellido: "+ this.getNombre() +" "+ this.getApellido());
        System.out.println("DNI: "+ this.getDni() +"   Edad: "+ this.edad() +" años");
    }
    public boolean esCumpleaños()
    {
        Calendar fechaHoy = new GregorianCalendar();
        if (fechaHoy==this.getFechaNacimiento())
        {
            return true;
        }else{
            return false;
        }                
    }
}
