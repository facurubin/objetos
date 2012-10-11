/**
*Clase ejecutable donde los datos son pasados por Scanner a metodo main()
*@autor(Facundo Rubin)
*@version(03/09/12)
**/
import java.util.Scanner;
public class GestionStock{
	public static void main(String args[])
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nombre del Laboratorio: ");
		String labNombre = teclado.next();
		System.out.println("Domicilio del Laboratorio: ");
		String labDomicilio = teclado.next();
		System.out.println("Telefono del Laboratorio: ");
		String labTelefono = teclado.next();
		Laboratorio unLaboratorio = new Laboratorio(labNombre,labDomicilio,labTelefono);
		//Fin carga Instancia Laboratorio

		System.out.println("Ingrese codigo del producto: ");
		int codigo = teclado.nextInt();
		System.out.println("Ingrese rubro del producto: ");
		String rubro = teclado.next();
		System.out.println("Ingrese descripcion del producto: ");
		String descripcion = teclado.next();
		System.out.println("Ingrese costo del producto: ");
		double costo = teclado.nextDouble();
		Producto unProducto = new Producto(codigo,rubro,descripcion,costo,unLaboratorio);
		//Fin carga Intancia Producto
		System.out.println("Ingrese stock del producto: ");
		unProducto.ajuste(teclado.nextInt());
		unProducto.mostrar();
		unProducto.ajuste(-200);
		System.out.println("\n\t****Se destruyeron 200 "+unProducto.getDescripcion()+" por estar mal estibados \n");
		unProducto.mostrar();
		
	} 
}
