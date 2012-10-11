public class Producto{
private int codigo;
private String rubro;
private String descripcion;
private double costo;
private int stock;
private Laboratorio lab;

/**
 *Metodo costructor
 *@param codigo entro
 *@param rubro string
 *@param costo entro
 *@param lab Laboratorio
 */
public Producto( int p_codigo, String p_rubro, String p_descripcion, double p_costo, Laboratorio p_lab){
    this.setCodigo(p_codigo);
    this.setRubro(p_rubro);
    this.setDescripcion(p_descripcion);
    this.setCosto(p_costo);
    this.setLaboratorio(p_lab);
    }
private void setCodigo(int p_codigo){
    this.codigo=p_codigo;
}
private void setRubro(String p_rubro){
    this.rubro=p_rubro;
}
private void setDescripcion(String p_descripcion){
    this.descripcion = p_descripcion;
}
private void setCosto(double p_costo){
    this.costo = p_costo;
}
private void setStock(int p_stock){
    this.stock = p_stock;
}
private void setLaboratorio(Laboratorio p_laboratorio){
    this.lab=p_laboratorio;
}
public int getCodigo(){
    return this.codigo;
}
public String getRubro(){
    return this.rubro;
}
public String getDescripcion(){
    return this.descripcion;
}
public double getCosto(){
    return this.costo;
}
public int getStock(){
    return this.stock;
}
public Laboratorio getLaboratorio(){
    return this.lab;
}

public void mostrar(){
    System.out.println("- Producto -");
    this.getLaboratorio().mostrar();
    System.out.println("Rubro: "+this.getRubro());
    System.out.println("Descripcion: "+getDescripcion());
    System.out.println("Precio Costo: "+this.precioContado());
    System.out.println("Stock: "+this.getStock()+" - Stock Valorizado: "+this.stockValorizable());
}
public void ajuste(int p_cantidad){
    this.setStock(this.getStock()+p_cantidad);
}
public double stockValorizable(){
    return (this.getStock()*this.getCosto()*12)/100;
} 
public double precioLista(){
    return ((this.costo*12)/100);
}
public double precioContado(){
    return (this.costo-((this.costo*12)/100));    
}
public String mostrarLinea(){
    return this.getDescripcion()+"  "+this.precioLista()+"   "+this.precioContado();
}

}