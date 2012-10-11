
/**
 * Clase que permite clasificar productos y determinar que productos hay que solicitar para reponer el stock, devuelve nombre de producto y proveedor. 
 * 
 * @author (Rubin Facundo)
 */
public class Articulo
{
    //declaracion de V.I.
    private String descripcion;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private double precio;
    private Proveedor prov;
    

    /**
     * Constructor de objetos de la clase Articulo
     */
    public Articulo(String p_descripcion, int p_stock, double p_porcPtoRepo, int p_existMinima, double p_precio, Proveedor p_prov)
    {
        // inicializacion de V.I.
       this.setDescripcion(p_descripcion);
       this.setStock(p_stock);
       this.setPorcPtoRepo(p_porcPtoRepo);
       this.setExistMinima(p_existMinima);
       this.setPrecio(p_precio);
       this.setProv(p_prov);
    }
     
    //metodos seters
    
    private void setDescripcion(String p_descripcion){
        this.descripcion = p_descripcion;
    }
    
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    
    private void setPrecio (double p_precio){
        this.precio = p_precio;
    }
    
    private void setProv(Proveedor p_prov){
        this.prov = p_prov;
    }
    
    /**metodo que devuelve el valor de la V.I. descripcion
     * @return String descripcion
     */
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    /**metodo que devuelve el valor de la V.I. stock
     * @return int stock
     */
    
    public int getStock(){
        return this.stock;
    }
    
    /**metodo que devuelve el valor de la V.I. porcPtoRepo
     * @return double porcPtoRepo
     */
    
    public double getPorcPtoRepo(){
        return this.porcPtoRepo;
    }
    
    /**metodo que devuelve el valor de la V.I. existMinima
     * @return int existMinima
     */
    
    public int getExistMinima(){
        return this.existMinima;
    }
    
    /**metodo que devuelve el valor de la V.I. precio
     * @return double precio
     */
    
    public double getPrecio(){
        return this.precio;
    }
    
    /**metodo que devuelve el valor de la V.I. prov
     * @return Proveedor prov
     */
    
    public Proveedor getProv(){
        return this.prov;
    }
    
    public double ptoReposicion (){
        return this.getExistMinima()* (1+this.getPorcPtoRepo()/100);
    }
    
    /** metodo que retorna el estado para la compra "F", "P" o "N"
     * @return char solicitar
     */
    
    public char solicitar(){
      
        int enviar =2;
        
      int puntorepotemp =(int)this.ptoReposicion();
      int stockis = this.getStock();
      int diasentregatemp = this.getProv().diasParaEntrega();
      int compraminimatemp=  this.getProv().getCompraMinima();
        
      if (stockis <= compraminimatemp){enviar=0;}
      if (stockis <= puntorepotemp && diasentregatemp > 5){enviar=1;}
      
      switch (enviar){
          case 0: return 'F';
          case 1: return 'P';
          case 2: return 'N';
          default: return 'N';
        }
      
}
    
    /**metodo que imprime en pantalla el Producto y el Proveedor
     * 
     */

    public void mostrar(){
        System.out.println("Producto: "+this.getDescripcion());
        System.out.println("Proveedor: "+this.getProv().getNombre());
    }
    
}
        
    
        
 