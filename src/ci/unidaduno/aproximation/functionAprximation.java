/*
ITESS- Tics
Enero -junio 2024
Calculo integral
TI-202
12/febrero/2024
Aproximacion de areas usando sumas

 */
package ci.unidaduno.aproximation;

public class functionAprximation {
    private double xini;
    private double xend;
    private int n;
    private double dx;
    private double x[];
    private double fx[];
    private double area;

    public functionAprximation(double xini, double xend, int n) {
        this.xini = xini;
        this.xend = xend;
        this.n = n;
       this.x=new double[n+1];
       this.fx=new double[n+1];
    }
    public void compute(){
        dx = (xend - xini)/n;
        area=0.0;
        for(int i = 0; i<= n; i++){
            x[i]=xini +i*dx;
            fx[i]=x[i]*x[i];
            area=area + fx[i]*dx;
        }
    }

    public double getArea() {
        return area;
    }
    
    }
