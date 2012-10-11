/**
 *CLase Principal Punto.
 * 
 * @author (Facundo Rubin) 
 */
class PrincipalPunto
{
    public static void main(String[] args)
    {
        Punto unpunto1 = new Punto(7.5 , 0.5);
        Punto unpunto2 = new Punto(7 , 0);
        unpunto1.mostrar();
        System.out.println("Distancia: "+unpunto1.distanciaA(unpunto2));
        unpunto1.desplazar(2,3);
        System.out.println("Coordenadas: "+unpunto1.coordenadas());
    }
}