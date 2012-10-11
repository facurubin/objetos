import java.io.*;
import java.util.*;
import java.util.Scanner;
    public class Empresa{
        public static void main(String [] args){
            Empleado [] vector = new Empleado[100];
            int nro = 0;
            String rta = "S";
            Calendar fecha;
            Scanner teclado = new Scanner(System.in);
            try{
                FileOutputStream archiFOS = new FileOutputStream ("/home/faq/Escritorio/Poo/tp4/archivos/Empleado.dat", true);
                DataOutputStream archiDOS = new DataOutputStream (archiFOS);
                do {
                System.out.println ("Ingrese el cuil del empleado");
                long cuil = teclado.nextLong();
                System.out.println ("Ingrese el apellido del empleado");
                String apellido = teclado.next();
                System.out.println ("Ingrese el nombre del empleado");
                String nombre = teclado.next();
                System.out.println ("Ingrese el sueldo basico del empleado");
                double sueldoBasico = teclado.nextDouble();
                System.out.println ("Ingrese el dia de ingreso a la empresa");
                int dia = teclado.nextInt();
                System.out.println ("Ingrese el mes de ingreso a la empresa");
                int mes = teclado.nextInt();
                System.out.println ("Ingrese el año de ingreso a la empresa");
                int año = teclado.nextInt();
                fecha = new GregorianCalendar(año, (mes - 1), dia);
                vector[nro] = new Empleado(cuil, apellido, nombre, sueldoBasico, fecha);
                nro = nro + 1;
                System.out.println ("Desea seguir ingresando mas datos? S-N ");
                rta = teclado.next();
                for (int i = 0; i < nro; i++){
                        archiDOS.writeLong(vector[i].getCuil());
                        archiDOS.writeUTF(vector[i].getApellido());
                        archiDOS.writeUTF(vector[i].getNombre());
                        archiDOS.writeDouble(vector [i].getSueldoBasico());
                        archiDOS.writeDouble(vector[i].sueldoNeto());
                        archiDOS.writeInt(vector[i].getFechaIngreso().get(Calendar.DATE));
                        archiDOS.writeInt((vector [i].getFechaIngreso().get(Calendar.MONTH)) + 1);
                        archiDOS.writeInt(vector[i].getFechaIngreso().get(Calendar.YEAR));
                    }
                } while (rta.equals("S"));   
                    archiDOS.close();
                }
                catch (FileNotFoundException fnfe){
                    System.out.println ("archivo no encontrado");
                }
                catch (IOException ioe){
                    System.out.println ("error al grabar");
                }
                
            }
        }

