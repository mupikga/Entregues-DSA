public class Triangle extends Figura {
    private double b,h;

    public Triangle (double b, double h){
        this.h = h;
        this.b = b;
    }

    @Override
    public double area(){
        return (this.getB() * this.getH())/2;
    }

    public double getH(){
        return h;
    }
    public double getB(){
        return b;
    }
}

