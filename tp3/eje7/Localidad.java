/**
*Clase Localidad
*@autor(Facundo Rubin)
*@version(06/09/12)
**/
public class Localidad{
    private String nombre;
    private String provincia;
    
    public Localidad(String p_nombre,String p_provincia)
    {
          this.setNombre(p_nombre);
          this.setProvincia(p_provincia);
    }
    public Localidad()
    {
          this.setNombre("");
          this.setProvincia("");
    }
    public void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    public void setProvincia(String p_provincia)
    {
        this.provincia = p_provincia;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public String getProvincia()
    {
        return this.provincia;
    }
    public void mostrar()
    {
        System.out.println("Localidad: "+this.getNombre()+"\tProvincia: "+this.getProvincia());
    }
    
}