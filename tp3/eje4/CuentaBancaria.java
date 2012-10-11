/**
*Clase CuentaBancaria
*@autor(Facundo Rubin)
*@version(03/09/12)
**/

public class CuentaBancaria{
	private int nroCuenta;
	private double saldo;
	private Persona titular;

	/**
     *Metodo Costructor con 2 parametros.
     *@param nroCuenta: entero
     *@param titular: Persona
    */
	public CuentaBancaria(int p_nroCuenta, Persona p_titular)
	{
		this.setNroCuenta(p_nroCuenta);
		this.setTitular(p_titular);
		this.setSaldo(0);
	}
	/**
     *Metodo Costructor con 3 parametros.
    *@param nroCuenta: entero
    *@param titular: Persona
    *@param saldo: doble
    */
	public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo)
	{
		this.setNroCuenta(p_nroCuenta);
		this.setTitular(p_titular);
		this.setSaldo(p_saldo);
	}
	/**
     *Metodo Costructor sin parametros.
    */
	public CuentaBancaria()
	{
		this.setNroCuenta(0);
		this.setTitular(new Persona());
		this.setSaldo(0);
	}
	private void setSaldo(double p_saldo)
	{
		this.saldo = p_saldo;
	}
	private void setTitular(Persona p_titular)
	{
		this.titular = p_titular;
	}
	private void setNroCuenta(int p_nroCuenta)
	{
		this.nroCuenta = p_nroCuenta;
	}
	public double getSaldo()
	{
		return this.saldo;
	}
	public int getNroCuenta()
	{
		return this.nroCuenta;
	}
	public Persona getTitular()
	{
		return this.titular;
	}
	public double extraer(double p_importe)
	{
		this.setSaldo(this.getSaldo()-p_importe);
		return this.getSaldo();
	}
	public double dopositar(double p_importe)
	{
		this.setSaldo(this.getSaldo()+p_importe);
		return this.getSaldo();
	}
	public void	mostrar()
	{
		System.out.println("- Cuenta Bancaria -");
		System.out.println("Titular: "+this.getTitular().nomYApe()+" ("+this.getTitular().edad()+" años)");
		System.out.println("Saldo: "+this.getSaldo());
	}
	public String toStrinf()
	{
		return this.getNroCuenta()+"     "+this.getTitular().nomYApe()+"     "+this.getSaldo();
	}
}