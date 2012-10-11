/**
 * Clase ejecutable Laboratorio donde escribe un archivo de forma directa.
 * 
 * @autor(Facundo Rubin)
 */
import java.util.*;
import java.io.*;
public class EscrituraLaboratorio{
/**
    *Metodo statico que completa o trunca a una tamaño determinado.
    *@param cadena
    *@param cantidad
    *@return cadena con el tamaño correcto
    */
    public static String validar(String dato,int num)
    {
        if(dato.length()<num)
        {
            for(int i=dato.length();i>num;i++)
                dato = dato+" ";
        }else{
            dato.substring(0,num);
        }
    return dato;
    }   
    public static void main(String[] args)
    {
        int codLab = 0;
        String nombre = "";
        String domicilio = "";
        String telefono = "";
        String fin = "s";
        Laboratorio lab;
        Scanner teclado = new Scanner(System.in);
        try{
            RandomAccessFile arch = new RandomAccessFile("/home/faq/Escritorio/Poo/tp4/archivos/Laboratorio.dat","rw");
            do{
                //Ingreso de datos por teclado
                System.out.println("Ingrese nombre del Laboratorio");
                nombre = teclado.next();
                System.out.println("Ingresar domicilio del Laboratorio");
                domicilio = teclado.next();
                System.out.println("Ingresar telefono del Laboratorio");
                telefono = teclado.next();
                //Intanciar objeto
                lab = new Laboratorio(nombre,domicilio,telefono);
                //Grabar estado del objeto en archivo directo.
                arch.writeInt(codLab);
                arch.writeChars(validar(lab.getNombre(),20));
                arch.writeChars(validar(lab.getDomicilio(),10));
                arch.writeChars(validar(lab.getTelefono(),15));

                System.out.println("Desea finalizar? s/n");
                fin = teclado.next();
                codLab = codLab + 1;
            }while(fin.equals("n"));
            arch.close();
        }catch (FileNotFoundException fnfe){
            System.out.println ("archivo no encontrado");
        }catch (IOException ioe){
            System.out.println ("error al grabar");
        }
    }
}