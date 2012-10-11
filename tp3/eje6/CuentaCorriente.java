/**
*Clase CuentaCorriente
*@autor(Facundo Rubin)
*@version(04/09/12)
**/
public class CuentaCorriente{
    private int nroCuenta; 
    private double saldo; 
    private double limiteDescubierto;
    private Persona titular; 

    /**
     *Metodo Costructor con 2 parametros, tomando saldo el valor 0.
     *@param nroCuenta: entero
     *@param titular: Persona
    */
    public CuentaCorriente(int p_nroCuenta,Persona p_titular) 
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setLimiteDescubierto(500);
        this.setSaldo(0);
    }
    /**
     *Metodo Costructor con 3 parametros.
     *@param nroCuenta: entero
     *@param titular: Persona
     *@param saldo: double
    */
    public CuentaCorriente(int p_nroCuenta,Persona p_titular, double p_saldo) 
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setLimiteDescubierto(500);
        this.setSaldo(p_saldo);
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
    public double getLimiteDescubierto()
    {
        return this.limiteDescubierto;
    } 
    public void setLimiteDescubierto(double p_descubierto)
    {
        this.limiteDescubierto = p_descubierto;
    }
    /**
     * Metodo puedeExtraer() calcula el limite de la posible extracion (suma saldo y decubierto)
     * determina si es posible extraer esa suma.
     * @return boolean
     */ 
    public boolean puedeExtraer(double p_importe)
    {
        
        double limite = this.getSaldo()+this.getLimiteDescubierto();
        if(limite < p_importe)
        {
            return false;
        }else{
            return true;
        }
    }
    /**
     * Metodo extrar() comprueba si es posible mandando un mensaje a puedeExtraer()
     * @return importe acutual o codigo de error
     * Codigos errores:
     * "-1" indicando que no es posible realizar la extraccion.  
     */
    public double extraer(double p_importe)
    {
        //Comprueba si es posible la extracion con resultado boolean.
        if (puedeExtraer(p_importe))
      	{
        //Realiza la extraccion.
        double saldo = this.getSaldo()-p_importe;   
        if (saldo>=0) {
            //Resta el importe a extraer al saldo.
            this.setSaldo(this.getSaldo()-p_importe);
        }else{
        	//Esta trabajando al descubierto, su saldo es 0
            this.setSaldo(0);
            //Resta la extraccion al descubierto
            this.setLimiteDescubierto(this.getLimiteDescubierto()+saldo);
        }
        //Devuelve el saldo actual.
        return this.getSaldo();
        }else{
        //Retorna "-1" indicando que no es posible realizar la extraccion.  
        return -1;
        }
    }
    public double dopositar(double p_importe)
    {
        this.setSaldo(this.getSaldo()+p_importe);
        return this.getSaldo();
    }
    public void mostrar()
    {
    System.out.println("– Cuenta Corriente –");
    System.out.println("Nro. Cuenta:"+this.getNroCuenta()+"- Saldo:"+this.getSaldo());
    System.out.println("Titular:"+this.getTitular().nomYApe());
    System.out.println("Descubierto: "+this.getLimiteDescubierto()+"\n");
    }
}