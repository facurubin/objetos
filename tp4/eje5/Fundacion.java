import java.util.*;
import java.io.*;
/**
 * Clase que permite imprimir invitaciones y guardar invitaciones
 * 
 * @author (Facundo Rubin) 
 */
public class Fundacion
{
   //declaracion e inicializacion de V.I.
   private String nombre = "Educar para Crecer";
   
   /** Constructor de objetos de la clase Fundacion
    *@param String p_nombre
    */
   public Fundacion(String p_nombre){
       this.setNombre(p_nombre);
    }
   
   private void setNombre(String p_nombre){
       this.nombre = p_nombre;
    }
    
    /**metodo que devuelve el el valor de la V.I. nombre
     * @return String nombre
     */
    
   public String getNombre(){
       return this.nombre;
    }
   
   
    /**metodo que recibe objetos como parametro (Evento y Persona) e imprime Invitaciones
     * @param Evento p_evento
     * @param Persona p_persona
     */
    
   public void imprimirInvitacion(Evento p_evento, Persona p_persona){
       
       System.out.println("*-----------------------------------------------------------------------------*");
       System.out.println("Estimado/a: "+p_persona.nomYApe()+"\n");
       System.out.println("La fundación: "+this.getNombre());
       System.out.println("Invita a Ud. al próximo evento: "+p_evento.getNombre());
       System.out.println("Las inscripciones se realizan con "+p_evento.getDiasInscripcion()+" días de anticipación.");
       System.out.println("Las mismas se llevarán a cabo el día: "+p_evento.fechaInscripcion().verNumero());
       System.out.println("El evento tendrá lugar en : "+p_evento.getLugar()+", "+p_evento.getFechaEvento().verLetra());
       System.out.println("Costo: "+p_evento.costoFinal(p_persona.edad()));
       System.out.println("Lo esperamos");
       System.out.println("*-----------------------------------------------------------------------------*");
   }
   
   /**metodo que graba en un archivo los datos del evento y la persona
    * @param Evento p_evento
    * @param Persona p_persona
    */
   
   public void grabarInvitacion(Evento p_evento, Persona p_persona){
       
       try{
            FileOutputStream archiFOS= new FileOutputStream("archivos\\InvitadosFinal.dat",true); //escritura en forma binaria
            DataOutputStream archiDOS = new DataOutputStream(archiFOS); //escritura en forma de datos formateados
            
          archiDOS.writeInt(p_persona.getDni());
          archiDOS.writeUTF(p_persona.apeYNom());
          archiDOS.writeUTF(p_evento.getNombre());
          archiDOS.writeUTF(p_evento.getLugar());
          archiDOS.writeDouble(p_evento.getCosto());
          archiDOS.writeInt(p_evento.getFechaEvento().getMes());
          archiDOS.writeInt(p_evento.getFechaEvento().getDia());
          archiDOS.close();
        }
        catch(FileNotFoundException fnfe){System.out.println("Archivo no encontrado");}//excepciones
        catch(IOException ioe) {System.out.println("Error de Escritura");}
       
    }
    
}
       