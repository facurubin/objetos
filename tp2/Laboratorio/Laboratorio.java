/**
 * Clase Laboratorio.
 * 
 * @autor(Facundo Rubin)
 */
public class Laboratorio{
private String nombre;
private String domicilio;
private String telefono;
/**
 * Metodo constructor.
 * @param nombre: string
 * @param domicilio: string
 * @param telefono: string
 */
public Laboratorio(String p_nombre,String p_domicilio,String p_telefono)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono); 
    }
/**
 * Metodo constructor.
 * @param nombre: string
 * @param domicilio: string
 */
public Laboratorio(String p_nombre,String p_domicilio)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono("");
    }
/**
 * Metodo constructor.
 * @param nombre: string
 */
public Laboratorio(String p_nombre)
    {
        this.setNombre(p_nombre);
        this.setDomicilio("");
        this.setTelefono("");
    }
/**
 * Metodo constructor.
 */
public Laboratorio()
    {
        this.setNombre("");
        this.setDomicilio("");
        this.setTelefono("");
    }
public void setNombre(String p_nombre)
{
    this.nombre = p_nombre;
}
public void setDomicilio(String p_domicilio)
{
    this.domicilio = p_domicilio;
}
public void setTelefono(String p_telefono)
{
    this.telefono = p_telefono;
}
public String getNombre()
{
    return this.nombre;
}
public String getDomicilio()
{
    return this.domicilio;
}
public String getTelefono()
{
    return this.telefono;    
}
public void mostrar()
    {
        System.out.println("Laboratorio: "+this.getNombre());
        System.out.println("Domicilio: "+this.getDomicilio()+"  - Teléfono: "+this.getTelefono());
    }
}
