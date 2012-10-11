import java.util.*;
public class Fecha
{
	int dia;
	int mes;
	int anio;

	public Fecha()
	{
		Calendar fecha = new GregorianCalendar();
		this.setDia(fecha.get(Calendar.DATE));
		this.setMes(fecha.get(Calendar.MONTH));
		this.setAnio(fecha.get(Calendar.YEAR));	
	}
	public Fecha(int p_dia, int p_mes, int p_anio)
	{
		this.setDia(p_dia);
		this.setAnio(p_anio);
		this.setMes(p_mes);
	}
	public Fecha(Calendar p_fecha)
	{
		this.setDia(p_fecha.get(Calendar.DATE));
		this.setMes(p_fecha.get(Calendar.MONTH)+1);
		this.setAnio(p_fecha.get(Calendar.YEAR));
	}
	public Fecha(Fecha p_fecha)
	{
		this.setDia(p_fecha.getDia());
		this.setAnio(p_fecha.getAnio());
		this.setMes(p_fecha.getMes());
	}
	public int getMes()
	{
		return this.mes;
	}
	public int getAnio()
	{
		return this.anio;
	} 
	public int getDia()
	{
		return this.dia;
	}
	private void setMes(int p_mes)
	{
		this.mes=p_mes;
	}
	private void setDia(int p_dia)
	{
		this.dia=p_dia;
	}
	private void setAnio(int p_anio)
	{
		this.anio=p_anio;
	}
	public Fecha incrementarFecha(int p_incremento)
	{
		Calendar fecha = new GregorianCalendar(this.getAnio(),(this.getMes()-1),this.getDia());
		fecha.add(Calendar.DATE,p_incremento);
		this.setDia(fecha.get(Calendar.DATE));
		this.setMes(fecha.get(Calendar.MONTH));
		this.setAnio(fecha.get(Calendar.YEAR));
		Fecha tem = new Fecha(fecha.get(Calendar.DATE),fecha.get(Calendar.MONTH)+1,fecha.get(Calendar.YEAR));
		return tem;
	}
	public String verNumero()
	{
		return this.getDia()+"/"+this.getMes()+"/"+this.getDia();
	}
	public String verLetra()
	{
		
         return this.getDia()+" de "+this.nombreMes()+" de "+this.getAnio();
	}
     
     public String nombreMes(){
         switch (this.getMes()){
             case 0: return "Enero";
             case 1: return "Febrero";             
             case 2: return "Marzo";
             case 3: return "Abril";
             case 4: return "Mayo";
             case 5: return "Junio";
             case 6: return "Julio";
             case 7: return "Agosto";
             case 8: return "Septiembre";
             case 9: return "Octubre";
             case 10: return "Noviembre";
             case 11: return "Diciembre";
             default: return "";
            }
        }
 
	public Fecha incrementarSinCambio(int p_dias)
	{
		//Intancio un objeto de tipo GregorianCalendar estado actual de las variables de instacia
		Calendar fecha = new GregorianCalendar(this.getAnio(),(this.getMes()-1),this.getDia());
		//Incremeto en n dias segun el paramentro p_dias
		fecha.add(Calendar.DATE,p_dias);
		//Intacio una objeto de tipo fecha temporal para devolver sin modificar el objeto actual		
		Fecha tem = new Fecha(fecha.get(Calendar.DATE),fecha.get(Calendar.MONTH)+1,fecha.get(Calendar.YEAR));
		return tem;	
	}
	public int diasCorridos(Fecha p_fecha)
	{
		Calendar fActual = Calendar.getInstance();
        fActual.set(this.getAnio(),this.getMes(),this.getDia());
        Calendar fIngreso = Calendar.getInstance();
        fIngreso.set(p_fecha.getAnio(),p_fecha.getMes(),p_fecha.getDia());
        double dif = fIngreso.getTimeInMillis()-fActual.getTimeInMillis();
        return (int) dif/1000/60/60/24;
	}
}