package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area(){
        double p = (a+b+c)/2.0;
        return Math.sqrt(p*(p-1)*(p-b)*(p-c));

    }
}
