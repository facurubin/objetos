/**
 * Clase cliente .
 * 
 * @autor(Facundo Rubin)
 * 
 */

public class Cliente{
private int nroDni;
private String apellido;
private String nombre;
private double saldo;

/**
 * Metodo costructor.
 * @param Dni: entero
 * @param Apellido: string
 * @param Nombre: string
 * @param Saldo: doble
 */ 
public Cliente(int p_dni, String p_apellido , String p_nombre, double p_saldo)
    {
        this.setNroDni(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_saldo);
    }
private void setNroDni(int p_dni)
{
    this.nroDni=p_dni;
}
private void setApellido(String p_apellido)
{
    this.apellido=p_apellido;
}
private void setNombre(String p_nombre)
{
    this.nombre=p_nombre;
}
private void setSaldo(double p_saldo)
{
    this.saldo = p_saldo;
}
public int getNroDni()
{
    return this.nroDni;
}
public String getApellido()
{
    return this.apellido;
} 
public String getNombre()
{
    return this.nombre;
}
        /**
         * Metodo retorna el nombre.
         * @return v.i. Nombre
         */
public double getSaldo()
{
    return this.saldo;
}
public void mostrar()
    {
        System.out.println("-  Cliente  -");
        System.out.println("Nombre y Apellido "+ this.nomYape()+" ("+this.getNroDni()+")");
        System.out.println("Saldo: $"+this.getSaldo());
    }
        /**
         * Metodo reemplaza el saldo por el parametro pasado como p_importe.
         * 
         */
public double nuevoSaldo(double p_importe)
    {
        this.setSaldo(p_importe);
        return this.getSaldo();
    }
        /**
         * Metodo suma el saldo por el parametro pasado como p_importe.
         * al actual.
         * @return v.i. Saldo
         */
public double agregarSaldo(double p_importe)
    {
        this.setSaldo(this.getSaldo()+p_importe);
        return this.saldo;
    }  
        /**
         * Metodo muestra apellido y nombre.
         */
public String apeYnom()
    {
        return this.getApellido()+" "+this.getNombre();
    }
        /**
         * Metodo muestra apellido y nombre.
         */
public String nomYape()
    {
        return this.getNombre()+" "+this.getApellido();
    }
}