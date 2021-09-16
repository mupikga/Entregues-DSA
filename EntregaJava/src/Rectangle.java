public class Rectangle extends Figura {
    private double a,b;

    public Rectangle (double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double area(){
        return this.getA() * this.getB();
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
}
