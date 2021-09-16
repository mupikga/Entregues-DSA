import java.util.Arrays;
import java.util.Iterator;

public class GestorFiguras {

    public static void sort(Figura[] vec){
       Arrays.stream(vec).sorted();
        }


    public static double suma(Figura[] vec){
        double res = 0;
        for (Figura f : vec){
            res += f.area();
        }
        return res;
    }
}