/*
ITESS- Tics
Enero -junio 2024
Calculo integral
TI-202
12/febrero/2024
Aproximacion de areas usando sumas

 */
package ci.unidaduno.aproximation;

public class functionAprximationTest {
    public static void main(String [] args){
        functionAprximation fa=new functionAprximation(0.0,4.0,4);
        fa.compute();
        System.out.print("area:"+fa.getArea());
    }
}
