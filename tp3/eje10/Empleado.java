/**
 * Clase Empleado.
 * 
 * @autor(Facundo Rubin)
 */
import java.util.*;
public class Empleado
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso; 
/**
 * Metodo costructor.
 * @param cuil: long
 * @param Apellido: string
 * @param Nombre: string
 * @param Importe: doble
 * @param anio: entero
 */ 
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio)
        {
            this.setCuil(p_cuil);
            this.setApellido(p_apellido);
            this.setNombre(p_nombre);
            this.setSueldoBasico(p_importe);
            this.setAnioIngreso(p_anio);
        }
 /**
 * Metodo costructor.
 * @param cuil: long
 * @param Apellido: string
 * @param Nombre: string
 * @param Importe: doble
 * @param fehca: Calendar
 */ 
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha)
        {
            this.setCuil(p_cuil);
            this.setApellido(p_apellido);
            this.setNombre(p_nombre);
            this.setSueldoBasico(p_importe);
            this.setFechaIngreso(p_fecha);
        }

/**
 * Metodo costructor sin parametros
 */ 
    public Empleado()
        {
            this.setCuil(0);
            this.setApellido("");
            this.setNombre("");
            this.setSueldoBasico(0);
            this.setFechaIngreso(new GregorianCalendar());
        } 
    private void setCuil(long p_cuil)
    {
       this.cuil = p_cuil;
    }
    private void setApellido(String p_apellido)
    {
       this.apellido = p_apellido;
    }
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    private void setSueldoBasico(double p_importe)
    {
        this.sueldoBasico = p_importe;
    }
    private void setAnioIngreso(int p_anio)
    {   
        Calendar f1=Calendar.getInstance();
        f1.set(p_anio, 1, 1);
        this.setFechaIngreso(f1);
    }
    private void setFechaIngreso(Calendar p_fecha)
    {
        this.fechaIngreso = p_fecha;
    }
    public long getCuil()
    {
        return this.cuil;     
    }
    public String getApellido()
    {
        return this.apellido;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public double getSueldoBasico()
    {
        return this.sueldoBasico;
    }
    private Calendar getFechaIngreso()
    {
        return this.fechaIngreso;
    }
    public int getAnioIngreso()
    {
        return this.getFechaIngreso().get(Calendar.YEAR);
    }
        /**
         * Metodo determina la antiguedad usando restando el año actual al año de nacimiento.
         * 
         */
    public int antiguedad()
        {
            Calendar fechaHoy = new GregorianCalendar();
            int anioHoy = fechaHoy.get(Calendar.YEAR);
            return (anioHoy - this.getAnioIngreso() ); 
        }
        /**
         * Metodo determina el descuento del %2 mas $12 por la obra social.
         * 
         */
    private double descuento()
    {
        return (((this.getSueldoBasico()*2)/100)+12);
    }
        /**
         * Metodo determina el adicional segun la antiguadad.
         * 
         */
    private double adicional()
    {
        if(this.antiguedad()<2)
        {
            return ((this.getSueldoBasico()*2)/100);
        }
        else if(this.antiguedad()>=2 && this.antiguedad()<10){
            return ((this.getSueldoBasico()*4)/100);
        }else{
            return ((this.getSueldoBasico()*6)/100);
        }
    }
        /**
         * Metodo calcula el sueldo, sumando el basico mas el adicional menos el descuento.
         * 
         */
    public double sueldoNeto()
    {
        return ((this.sueldoBasico+this.adicional())-this.descuento());
    }
    public String nomYApe()
    {
        return this.nombre+" "+this.apellido;
    }
    public String apeYNom()
    {
        return this.apellido+" "+this.nombre;
    }
    public void mostrar()
    {
        System.out.println("Nombre y Apellido: "+this.nombre+" "+this.apellido);
        System.out.println("CUIL: "+this.cuil+" Antigüedad: "+this.antiguedad()+" años de servicio");
        System.out.println("Sueldo Neto: $"+this.sueldoNeto());
    }
    public void mostrarLinea()
    {
        System.out.println(this.cuil+"  "+this.apellido+" "+this.apellido+"  ................. $"+this.sueldoNeto());
    }
    public boolean esAniversario()
    {   
        Calendar hoy = new GregorianCalendar();
        if( hoy.get(Calendar.DATE)==this.getFechaIngreso().get(Calendar.DATE))
        {
            if( hoy.get(Calendar.MONTH)==this.getFechaIngreso().get(Calendar.MONTH))
            {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    
    }
}