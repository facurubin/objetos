import java.util.*;
import java.io.*;
/**
 * Clase Ejecutable Administracion
 * 
 * @author (Facundo Rubin) 
 */
public class Administracion
{
    
    
    
    
    public static void main (String [] args){
    
     int dni;
     String apellido;
     String nombre;
     int dia;
     int mes;
     int año;
     Persona per1;
     Evento even1;
     Calendar calendario = Calendar.getInstance();
     Fundacion fun1;     
     
   
     
     try{
            FileInputStream archiFIS = new FileInputStream("/home/faq/Escritorio/Poo/tp4/archivos/Invitados.dat"); //lectura de un archivo en modo binario
            DataInputStream archiDIS = new DataInputStream(archiFIS); //lectura de un archivo en modo de datos formateados
                   
            while (archiDIS.available() > 0){ //condicion que permite recorrer el archivo
                
                //se almacenan en las variables los datos obtenidos del archivo
                
                dni = archiDIS.readInt();
                apellido = archiDIS.readUTF();
                nombre = archiDIS.readUTF();
                dia = archiDIS.readInt();
                mes = archiDIS.readInt();
                año = archiDIS.readInt();
       
                //se instancia un Evento
                
        even1 = new Evento("Congreso", "UNNE", (new Fecha(30,9,2012)),10,300);
        
        //se instancia la fecha en modo Calendar para enviarlo al objeto de tipo Persona
        
        calendario.set(año, mes,dia);
        
        //se instancia el objeto de tipo persona con los datos leidos del archivo
        
        per1 = new Persona(dni,nombre,apellido,calendario);
        
        //se instancia un objeto de tipo Fundacion
        
        fun1 = new Fundacion("Programacion Orientada Objetos");
        
        //se imprime la Invitacion
        
        fun1.imprimirInvitacion(even1,per1);
        
        //se solicita la grabacion del nuevo archivo de los invitados finales
        
        fun1.grabarInvitacion(even1,per1);
           
         
         }
         archiDIS.close();//se cierra el archivo
        }
        
        //para las excepciones de lectura/escritura o error de archivo no encontrado
        
        catch(FileNotFoundException fnfe){System.out.println("error archivo");}
        catch(IOException ioe){System.out.println("error lectura");}
      
    }
}
