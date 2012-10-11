import java.util.*;
/**
 * Clase que permite definir un proveedor de un comercio mayorista y establecer la cantidad de dias para que dicho proveedor realiza la entrega de productos, ademas
 * de mostrar una leyenda con el nombre del proveedor
 * 
 * @author (Rubin Facundo) 
 */
public class Proveedor
{
    //declaracion de V.I.
   private String nombre;
   private int compraMinima;
   private int diaEntrega;

    /**
     * Constructor unico para objetos de la clase Proveedor
     * @param String p_nombre
     * @param int p_compraMinima
     * @param int p_diaEntrega
     */
    public Proveedor(String p_nombre, int p_compraMinima, int p_diaEntrega)
    {
        // Inicializacion de V.I.
        this.setNombre(p_nombre);
        this.setCompraMinima(p_compraMinima);
        this.setDiaEntrega(p_diaEntrega);
    }

     
    //metodos seters
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setCompraMinima(int p_compraMinima){
        this.compraMinima = p_compraMinima;
    }
    
    private void setDiaEntrega(int p_diaEntrega){
        this.diaEntrega = p_diaEntrega;
    }
    
    
    /**metodo que devuelve el valor de la V.I. nombre
     * @return String nombre
     */
   
    public String getNombre(){
        return this.nombre;
    }
    
     /**metodo que devuelve el valor de la V.I. compraMinima
     * @return int compraMinima
     */
    
    public int getCompraMinima(){
        return this.compraMinima;
    }
    
     /**metodo que devuelve el valor de la V.I. diaEntrega
     * @return int diaEntrega
     */
    
    public int getDiaEntrega(){
        return this.diaEntrega;
    }
    
    
    /** metodo que devuelve la cantidad de dias faltantes para la proxima entrega de productos por parte del proveedor
     *  @return int diasParaEntrega
     */
    public int diasParaEntrega(){
     
       
         Calendar hoy = Calendar.getInstance(); //establezco la fecha actual
    
         Calendar modificar = Calendar.getInstance(); //establezco calendario para modificar
       
         int fines = 0; //establezco los fines de semanas en cero para ir sumando cuantos sabados y domingos hay entre los dias habiles para la entrega
        
        for (int i=0; i < this.getDiaEntrega(); i++){//iteracion desde 0 hasta la cantidad de dias estipulado por el proveedor para la entrega
            
            //si el dia en el que se esta recorriendo es un sabado o domingo se suma a fines un dia, ademas de sumar un dia al calendario modificar
            
            if(modificar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || modificar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
                 
                fines++; //sumo fines en uno
                  modificar.add(Calendar.DATE,1);//sumo calendario en uno
                  
            }else{ modificar.add(Calendar.DATE,1);}//sumo calendario en uno
            
            }
        long hoytime = hoy.getTimeInMillis(); //obtengo milisegundos del calendario
        long modificartime = modificar.getTimeInMillis();//obtengo milisegundos del calendario
        
        //devuelvo el calculo de los dias de diferencias entre cada calendario y le sumo los dias no laborables
        int devolver= (int)((modificartime-hoytime)/1000/60/60/24)+fines; 
        
       return devolver;
        
    }
    
    /**metodo que rotorna un String con el nombre del proveedor
     * @return String Proveedor
     */
    
    public String mostrar(){
        return "Proveedor: "+this.getNombre();
    }
}
    
    