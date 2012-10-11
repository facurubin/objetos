/**
 * Clase alumno.
 * 
 *@autor(Facundo Rubin)
 */

public class Alumno{
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    
/**
 * Metodo costructor.
 * @param Lu: entero
 * @param Nombre: string
 * @param Apellido: string
 */ 
    public Alumno(int p_lu, String p_nombre, String p_apellido)
    {
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.apellido = p_apellido;
    }
    private void setLu(int p_lu)
    {
        this.lu = p_lu;
    } 
    private void setNombre(String p_nombre)
    {
    this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido)
    {
    this.apellido = p_apellido;
    }
/**
 * Metodo asignacion de nota uno.
 * @param nota: doble
 */
    public void setNota1(double p_nota)
    {
        this.nota1 = p_nota;
    }
/**
 * Metodo asignacion de nota dos.
 * @param nota: doble
 */
    public void setNota2(double p_nota)
    {
        this.nota2 = p_nota;
    }
    public int getLu()
    {
        return this.lu;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public String getApellido()
    {
        return this.apellido;
    }
    public double getNota1()
    {
        return this.nota1;
    }
    public double getNota2()
    {
        return this.nota2;
    }
        /**
         * Metodo aprueba determina si las dos notas son mayores a 6 y el promedio mayor a 7. Retornando en forma boolean
         * 
         */
    private boolean aprueba()
    {
        if(this.getNota1() >= 6 && this.getNota2() >= 6 && this.promedio() > 7)
            {
                return true;
            }else{
                return false;
            }
    }
        /**
         * Metodo que llama a aprueba() y muestra "APROBADO" por el True y "DESAPROBADO" por el false.
         * 
         */
    private String leyendaAprueba()
    {
        if(this.aprueba())
        {
            return "APROBADO";
        }else{
            return "DESAPROBADO";
        }
    } /**
         * Metodo que calcula el promedio de las 2 notas ingresadas.
         * 
         */
    public double promedio()
        {
            return ((this.getNota1()+this.getNota2())/2);
        }
    public String nomYApe()
    {
        return this.getNombre()+" "+this.getApellido();
    }
    public String apeYNom()
    {
        return this.getApellido()+" "+this.getNombre();
    }
    public void mostrar()
    {
        System.out.println("Nombre y Apellido: "+this.getNombre()+" "+this.getApellido());
        System.out.println("LU: "+this.getLu()+" Notas: "+this.getNota1()+" - "+this.getNota2());
        System.out.println("Promedio: "+this.promedio()+" - "+this.leyendaAprueba());
    } 
}