public class Cercle extends Figura{
    double d;

    public Cercle (double d){
        this.d = d;
    }

    @Override
    public double area(){
        return this.d*Math.PI;
    }
    public double getD(){
        return this.d;
    }
}
