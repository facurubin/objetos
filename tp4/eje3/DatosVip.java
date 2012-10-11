import java.util.*;
import java.io.*;
public class DatosVip{
    public static void main(String[] args)
    {
        long cuil=0;
        String apellido="";
        String nombre="";
        double sueldoBasico=0;
        double sueldoNeto=0;
        int dia=0;
        int mes=0;
        int año=0;
        Empleado unEmpleado;
        Calendar fecha;
        try{
        FileInputStream arch = new FileInputStream("/home/faq/Escritorio/Poo/tp4/archivos/Empleado.dat");
        DataInputStream dato = new DataInputStream(arch);
        FileOutputStream arch1 = new FileOutputStream("/home/faq/Escritorio/Poo/tp4/archivos/EmpleadoVIP.dat",true);
        DataOutputStream dato1 = new DataOutputStream(arch1);

        while(dato.available()>0)
        {
            cuil=dato.readLong();
            apellido=dato.readUTF();
            nombre=dato.readUTF();
            sueldoBasico=dato.readDouble();
            sueldoNeto=dato.readDouble();
            dia = dato.readInt();
            mes = dato.readInt();
            año = dato.readInt();
            fecha = new GregorianCalendar(año,(mes-1),dia); 
            unEmpleado= new Empleado(cuil,apellido,nombre,sueldoBasico,fecha);
            if (unEmpleado.antiguedad()>10)
            {
                dato1.writeLong(unEmpleado.getCuil());
                dato1.writeUTF(unEmpleado.getApellido());
                dato1.writeUTF(unEmpleado.getNombre());
                dato1.writeDouble(unEmpleado.getSueldoBasico());
                dato1.writeDouble(unEmpleado.sueldoNeto());
                dato1.writeInt(unEmpleado.getFechaIngreso().get(Calendar.DATE));
                dato1.writeInt(unEmpleado.getFechaIngreso().get(Calendar.MONTH+1));
                dato1.writeInt(unEmpleado.getFechaIngreso().get(Calendar.YEAR));
                unEmpleado.mostrar();

            }
         }
         dato1.close();
         dato.close();
        }catch (FileNotFoundException fnfe){
            System.out.println ("archivo no encontrado");
        }catch (IOException ioe){
            System.out.println ("error al grabar");
        }   
        }
    }

    