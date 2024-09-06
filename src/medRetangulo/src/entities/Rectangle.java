package entities;

public class Rectangle {

    public double Width;
    public double Height;

    public double area(){
        return Width*Height;
    }
    public double peri(){
        return (Width*2)+(Height*2);
        }
    public double diag(){
        return Math.sqrt((Width*Width)+(Height*Height));
    }


}



