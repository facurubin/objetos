/**
*Clase Banco
*@autor(Facundo Rubin)
*@version(04/09/12)
**/
import java.util.Scanner;
public class Banco{
    /**
    *Clase ejecutable argumentos pasados como parametros del main
    *@param dni: entero
    *@param nombre: string
    *@param apellido: string
    *@param anioNacimiento: entero
    */
    public static void main(String args[])
    {
        int nroDni = Integer.valueOf(args[0]);
        String nombre =args[1];
        String apellido =args[2];
        int anioNacimiento = Integer.valueOf(args[3]);

        Persona unaPersona = new Persona(nroDni,nombre,apellido,anioNacimiento);

        Scanner teclado = new Scanner(System.in);
        System.out.println("***Caja De Ahorro de "+unaPersona.apeYNom()+"***");
        System.out.println("Ingrese numero de cuenta: ");
        int nroCuenta = teclado.nextInt();
        CajaDeAhorro unaCajaAhorro = new CajaDeAhorro(nroCuenta,unaPersona);
        System.out.println("Ingrese monto a depositar: ");
        unaCajaAhorro.dopositar(teclado.nextDouble());
        unaCajaAhorro.mostrar();
        System.out.println("Ingrese monto a extraer: (0 para salir)");
        double monto = teclado.nextDouble();
        //Mientras el monto sea diferente de la condicion de salida
        while (monto!=0){
        //Mando un mensaje con el monto por unica vez 
        // Con tres posibles resultado 
        //1)extracion correcta.
        //2)codigo -1: la extracion mayor que el saldo.
        //2)codigo -2: no se puede realizar mas extraciones.
        monto = unaCajaAhorro.extraer(monto);
        //Compruebo que no sea el codigo -2 
        if (monto==-2)
        {
            System.out.println("\nNo tiene habilitadas mas extracciones!\n");
            break;
        //Compruebo que no sea el codigo -1    
        }else if(monto==-1){
            System.out.println("\nNo puede extraer mas que el saldo!\n");
        }else{ 
           unaCajaAhorro.mostrar(); 
        }
        System.out.println("Ingrese monto a extraer: (0 para salir)");
        monto = teclado.nextDouble();
        }
        ////

        System.out.println("\n***Cuenta Corriente de "+unaPersona.apeYNom()+"***");
        System.out.println("Ingrese numero de cuenta: ");
        nroCuenta = teclado.nextInt();
        CuentaCorriente unaCuentaCorrienta = new CuentaCorriente(nroCuenta,unaPersona);
        System.out.println("Ingrese monto a depositar: ");
        unaCuentaCorrienta.dopositar(teclado.nextDouble());
        unaCuentaCorrienta.mostrar();
        System.out.println("Ingrese monto a extraer: (0 para salir)");
        monto = teclado.nextDouble();
        //Mientras el monto sea diferente de la condicion de salida
        while (monto!=0){
        //Mando un mensaje con el monto por unica vez 
        // Con tres posibles resultado 
        //1)extracion correcta.
        //2)codigo -1: el monto a extraer exede la suma del saldo y el descubierto permitido.
        monto = unaCuentaCorrienta.extraer(monto);
        //Compruebo que no sea el codigo -1
        if (monto==-1){
            System.out.println("\nEl importe de extraccion sobrepasa el límite de descubierto!\n");
            unaCuentaCorrienta.mostrar();
        }else{ 
           unaCuentaCorrienta.mostrar(); 
        }
        System.out.println("Ingrese monto a extraer: (0 para salir)");
        monto = teclado.nextDouble();
        }
    } 
}