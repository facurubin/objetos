import java.util.*;
public class Pedido{
	private ArrayList<Producto> productosSolicitados;
	private Fecha fecha;
	private Cliente cliente;

	public Pedido(Fecha p_fecha, Cliente p_cliente, ArrayList p_productos)
	{
		this.setFecha(p_fecha);
		this.setCliente(p_cliente);
		this.setProducto(p_productos);
	}
	public Pedido(Fecha p_fecha, Cliente p_cliente, Producto p_producto)
	{
		this.setFecha(p_fecha);
		this.setCliente(p_cliente);
		this.setProducto(new ArrayList<Producto>());
		this.agregarProducto(p_producto);
	}
	public ArrayList getProductoSolicitados()
	{
		return this.productosSolicitados;
	}
	public Fecha getFecha()
	{
		return this.fecha;
	}
	public Cliente getCliente()
	{
		return this.cliente;
	}
	private void setProducto(ArrayList p_productos)
	{
		this.productosSolicitados = p_productos;
	}
	private void setCliente(Cliente p_cliente)
	{
		this.cliente = p_cliente;
	}
	private void setFecha(Fecha p_fecha)
	{
		this.fecha = p_fecha;
	}
	public double totalAlContado()
	{
		double suma=0;
		for(Producto pro:productosSolicitados)
		{
			suma=suma+ pro.precioContado();
		}
		return suma;
	}

	public double totalAlFinanciado()
	{
		double suma=0;
		for(Producto pro:productosSolicitados)
		{
			suma= pro.precioLista();
		}
		return suma;
	}
	public boolean agregarProducto(Producto p_producto)
	{
		return this.getProductoSolicitados().add(p_producto);
	}
	public boolean quitarProducto(Producto p_producto)
	{
		return this.getProductoSolicitados().remove(p_producto);
	}
	public void mostrarPedido()
	{
		System.out.println("****Detalle del pedido****");
	}
}