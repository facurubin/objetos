/**
*Clase CajaDeAhorro
*@autor(Facundo Rubin)
*@version(04/09/12)
**/
public class CajaDeAhorro{
    private int nroCuenta; 
    private double saldo; 
    private int extraccionesPosibles;
    private Persona titular; 

    /**
     *Metodo Costructor con 2 parametros, tomando saldo el valor 0.
     *@param nroCuenta: entero
     *@param titular: Persona
    */
    public CajaDeAhorro(int p_nroCuenta,Persona p_titular) 
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setExtraccionesPosibles(10);
    }
    /**
     *Metodo Costructor con 3 parametros.
     *@param nroCuenta: entero
     *@param titular: Persona
     *@param saldo: double
    */
    public CajaDeAhorro(int p_nroCuenta,Persona p_titular, double p_saldo) 
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
    }
    
    public int getNroCuenta()
    {
        return this.nroCuenta;
    }
    private void setNroCuenta(int p_nroCuenta)
    {
        this.nroCuenta = p_nroCuenta;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    private void setSaldo(double p_saldo)
    {
        this.saldo = p_saldo;
    }
    public Persona getTitular()
    {
        return this.titular;
    }
    private void setTitular(Persona p_titular)
    {
        this.titular = p_titular;
    }
    public int getExtraccionesPosibles()
    {
        return this.extraccionesPosibles;
    } 
    public void setExtraccionesPosibles(int p_extracciones)
    {
        this.extraccionesPosibles = p_extracciones;
    }
    public boolean puedeExtraer(double p_importe)
    {
        if(this.getSaldo()<p_importe)
        {
            return false;
        }else{
            return true;
        }
    }
    public double extraer(double p_importe)
    {
        if (this.getExtraccionesPosibles()>0)
        {
        	//Comprueba si es posible la extracion con resultado boolean.
        	if (puedeExtraer(p_importe))
        	{
        	//Realiza la extraccion.    
        	this.setSaldo(this.getSaldo()-p_importe);
        	//Restamos una extracion.
        	this.setExtraccionesPosibles(this.getExtraccionesPosibles()-1);
        	//Devuelve el saldo actual.
        	return this.getSaldo();
        	}else{
        	//Retorna "-1" indicando que no es posible realizar la extraccion.  
        	return -1;
        	}
        }else{
        	return -2;
        }
    }
    public double dopositar(double p_importe)
    {
        this.setSaldo(this.getSaldo()+p_importe);
        return this.getSaldo();
    }
    public void mostrar()
    {
    System.out.println("- Caja de Ahorro –");
    System.out.println("Nro. Cuenta:"+this.getNroCuenta()+"- Saldo:"+this.getSaldo());
    System.out.println("Titular:"+this.getTitular().nomYApe());
    System.out.println("Extracciones posibles: "+this.getExtraccionesPosibles()+"\n");
    }
}