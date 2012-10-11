
/**
*Clase ejecutable GestionHospital
*@autor(Facundo Rubin)
*@version(06/09/12)
**/
public class GestionHospital
{
      public static void  main(String args[])
   {
       Localidad vive =new Localidad("Corrientes","Monte Caseros");
       Localidad nacido =new Localidad("Corrientes","Corrientes");
       Paciente unPaciente = new Paciente(1213,"Jose Ramirez","Sarmiento",nacido,vive);
       Hospital unHospital = new Hospital("Garrahan","Martinez");
       unHospital.consultaDatosFiliatorios(unPaciente);
   } 
}
