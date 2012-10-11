import java.util.*;
/**
 * Clase que permite definir un Evento
 * 
 * @author (Facundo Rubin) 
 */
public class Evento
{
   private String nombre;
   private String lugar;
   private int diasInscripcion;
   private double costo = 0;
   private Fecha fechaEvento;

    /**
     * Constructor de objetos de la clase Evento
     * @param String p_nombre
     * @param String p_lugar
     * @param Fecha p_fechaEvento
     * @param int p_diasins
     * @param double p_costo
     */
    public Evento(String p_nombre, String p_lugar, Fecha p_fechaEvento, int p_diasins, double p_costo)
    {
     this.setNombre(p_nombre);
     this.setLugar(p_lugar);
     this.setFechaEvento(p_fechaEvento);
     this.setDiasInscripcion(p_diasins);
     this.setCosto(p_costo);
    }
    
   private void setNombre(String p_nombre){
       this.nombre = p_nombre;
   }
   
   private void setLugar(String p_lugar){
       this.lugar = p_lugar;
   }
   
   private void setDiasInscripcion(int p_diasins){
       this.diasInscripcion = p_diasins;
   }
   
   private void setCosto(double p_costo){
       this.costo = p_costo;
   }
   
   private void setFechaEvento(Fecha p_fechaEvento){
       this.fechaEvento = p_fechaEvento;
   }
   
   /**metodo que devuelve el valor de la V.I. nombre
    * @return String nombre
    */
   
   public String getNombre(){
       return this.nombre;
   }
   
    /**metodo que devuelve el valor de la V.I. lugar
    * @return String lugar
    */
   
   public String getLugar(){
       return this.lugar;
   }
   
    /**metodo que devuelve el valor de la V.I. diasInscripcion
    * @return int diasInscripcion
    */
   
   public int getDiasInscripcion(){
   
       return this.diasInscripcion;
   }
   
    /**metodo que devuelve el valor de la V.I. fechaEvento
    * @return Fecha fechaEvento 
    */
   
   public Fecha getFechaEvento(){
       return this.fechaEvento;
   }
   
    /**metodo que devuelve el valor de la V.I. costo
    * @return double costo
    */
   
   public double getCosto(){
       return this.costo;
    }
   
    /** metodo que permite realizar un descuento al costo del evento si el parametro que recibe de tipo entero es mayor o igual a 60 (edad de la persona), 
     * en caso contrario el costo permanece sin variaciones. Una vez hecho el proceso devuelve una leyenda en String del costo y si hubo o no descuento
     * @param int p_edadInvitado
     * @return String costoFinal
     */
    
   public String costoFinal(int p_edadInvitado){
       
       if (p_edadInvitado >= 60){
           this.setCosto(this.getCosto()-(this.getCosto()/100*10));
           return "$"+this.getCosto()+" (incluye descuento)";}
       else{return "$"+this.getCosto();}
   
  }
  
  /**metoto que permite devolver la fecha del comienzo de las inscripciones, obteniendo los dias habiles de inscripcion y restando a la fecha del evento dicha cantidad
   * @return Fecha fechaInscripcion
   */
  
  public Fecha fechaInscripcion(){
      
      Fecha temporal = this.getFechaEvento();
      
      int tem_dia = temporal.getDia(); 
      int tem_mes = temporal.getMes();
      int tem_anio = temporal.getAnio();
      
      Calendar temporario = Calendar.getInstance();
      temporario.set(tem_anio, tem_mes, tem_dia);
      temporario.add(Calendar.DATE,-this.getDiasInscripcion());
      
      temporal = new Fecha (temporario.get(Calendar.DATE), temporario.get(Calendar.MONTH),temporario.get(Calendar.YEAR));
      
      return temporal;
    }
   
}
   