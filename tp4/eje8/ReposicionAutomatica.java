import java.util.*;
import java.io.*;
/**
 * Clase que permite saber que productos tienen que pedirse a el/los proveedor/es
 * 
 * @author (Rubin Facundo)
 */
public class ReposicionAutomatica
{
   
  public static void main (String [] args){
      
      //datos para productos.dat
      
      int codprod;
      String descripcion;
      int existminima;
      double porcPtoRepo;
      int stock;
      double precio;
      int codprov;
      char razon = 'N';
      
      //datos para proveedores.dat
      
      int codigoproveedor = 0;
      String nombreproveedor="";
      int compraminima = 0;
      int diaentrega = 0;
      long tamreg = 72;
      long cantreg = 0;
      
      //variables para los distintos objetos a utilizar
      
      Proveedor prov;
      Articulo art;
      
      //datos para el informe de productos a comprar
      
      int faltastock=0;
      int puntoreposicion=0;
      double importetotal=0;
      Calendar hoy =Calendar.getInstance();
      
       
      
      try {
          FileInputStream archiFIS = new FileInputStream("/home/faq/Escritorio/Poo/tp4/archivos/productos.dat"); //lectura de archivo secuencial
          DataInputStream archiDIS = new DataInputStream(archiFIS);
          
          RandomAccessFile archi = new RandomAccessFile("/home/faq/Escritorio/Poo/tp4/archivos/proveedores.dat","r"); //lectura de archivo de acceso directo
          
          
          //apertura de archivo para la grabacion  compra_AAAMMDD.txt
          
          RandomAccessFile aaaammmdd = new RandomAccessFile("/home/faq/Escritorio/Poo/tp4/eje6/comprar_"+hoy.get(Calendar.YEAR)+hoy.get(Calendar.MONTH)+hoy.get(Calendar.DATE)+".txt","rw");
          
          cantreg = archi.length()/tamreg;
          
          while (archiDIS.available() > 0){
              
              //lectura y almacenamiento de datos en variables del contenido del archivo productos.dat
              
              codprod = archiDIS.readInt();
              descripcion = archiDIS.readUTF();
              existminima = archiDIS.readInt();
              porcPtoRepo = archiDIS.readDouble();
              stock = archiDIS.readInt();
              precio = archiDIS.readDouble();
              codprov = archiDIS.readInt();
            
              
              //nos posicionamos en el registro que corresponde al proveedor debido a que es un archivo de acceso directo
              
              archi.seek(tamreg*codprov); //posiciono al comienzo del registro correspondiente segundo el codigo que obtengo en el archivo productos.dat
               codigoproveedor = archi.readInt(); //grabo el codigo del proveedor
               for (int i=0; i < 30; i++){
                   nombreproveedor=nombreproveedor+archi.readChar();}//obtengo el nombre del proveedor
               compraminima = archi.readInt(); //la compra minima para dicho producto
               diaentrega = archi.readInt(); // los dias para la entrega siguiente
            
               //creamos los objetos con los que vamos a trabajar
               
               prov = new Proveedor(nombreproveedor,compraminima,diaentrega); //creo objeto Proveedor
               art = new Articulo (descripcion,stock,porcPtoRepo,existminima,precio,prov); //creo objeto Articulo
               
        
              //definimos las sentencias para imprimir en pantalla segun el producto tenga que reponerse o no
               
              //si devuelve F, razon se establece en F para utilizarlo a la hora de grabar
              
               if (art.solicitar()=='F'){razon = 'F'; faltastock++; importetotal=importetotal+(art.getPrecio()*prov.getCompraMinima());}
              
               
               //si devuelve P razon se establece en P para utilizarlo a la hora de grabar
               
               if (art.solicitar()=='P'){razon = 'P'; puntoreposicion++; importetotal=importetotal+(art.getPrecio()*prov.getCompraMinima());}        
               
               //si es distino de N imprime producto,proveedor, cantidad a comprar y dias faltantes para la entrega
               
               if (art.solicitar() != 'N'){
               art.mostrar();
               System.out.println("Cantidad a comprar: "+compraminima +" paquetes\t\t Día de entrega: "+prov.diasParaEntrega()+" del mes");
               System.out.println("--------------------------------------------------------------------");
         
            
               //formateo descripcion pidiendo el dato a articulo, para luego grabarlo formateado con un tamaño especifico
               //en disco descripcion ocupa 60bytes
               
               descripcion= art.getDescripcion();
              
               if(descripcion.length() < 30){
               for (int i=descripcion.length(); i < 30; i++){
                   descripcion = descripcion+" ";}}else{descripcion.substring(0,30);}
              
               //formateo nombreproveedor pidiendo el dato a proveedor, para luego grabarlo formateado con un tamaño especifico
               //en disco nombreproveedor ocupa 60bytes      
                   
                nombreproveedor = prov.getNombre();
                
                if(nombreproveedor.length() < 30){
                    for (int i =nombreproveedor.length(); i < 30;i++){
                        nombreproveedor=nombreproveedor+" ";}}else{nombreproveedor.substring(0,30);}
                 
                //almacenos los siguientes datos que ya tengo formateados        
                        
                aaaammmdd.writeChars(descripcion);
                aaaammmdd.writeChars(nombreproveedor);
              
                //le solicito a proveedor la compraminima del producto en el que estamos posicionado (recordar, estas en un while a partir de producto)
                aaaammmdd.writeInt(prov.getCompraMinima());
                aaaammmdd.writeDouble(importetotal);
                aaaammmdd.writeChar(razon);
                        
            }
                  //como seguimos en un while, y la lectura de los datos Chars/Sring desde un archivo de accesso directo se hace concatenando caracteres, necesitamos
                  //al finalizar el proceso de carga de datos, formateo, etc. inicializar las variables utilizadas para poder continuar con el siguiente registro
               codigoproveedor=0;
               nombreproveedor="";
               compraminima=0;
               diaentrega=0;
               razon='N';
        }
            archiDIS.close();
            aaaammmdd.close();
        //imprimimos la fase final del proceso diario
            
            System.out.println("Cantidad de Productos a reponer: "+(faltastock+puntoreposicion));
            System.out.println("Importe total de la compra planificada: $"+importetotal);
            System.out.println("Cantidad de compras por faltante de stock: "+faltastock);
            System.out.println("Cantidad de compras por punto de reposición: "+puntoreposicion);
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Archivo creado: comprar_"+hoy.get(Calendar.YEAR)+hoy.get(Calendar.MONTH)+hoy.get(Calendar.DATE)+".txt");
            System.out.println("--------------------------------------------------------------------");
        
        
            
        }
        catch(FileNotFoundException fnfe){}
        catch(IOException ioe){}
    }
}