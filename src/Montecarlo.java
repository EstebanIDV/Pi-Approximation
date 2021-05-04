import java.awt.*;
import java.util.Random;

public class Montecarlo {
   public static void piaproximation(int recursos){
        int valor = 0;
       float X;
       float Y;
       float pointsinside = 0;
       double pi =0;
       float pointstotal =0;
       double checkinside;
        for (int i = 0; i<recursos; i++){
            X = new Random().nextFloat();
            Y = new Random().nextFloat();
            checkinside= Math.sqrt(X*X + Y*Y);
            if (checkinside <=1)
                pointsinside++;
            pointstotal ++;

        }
       pi = 4*(pointsinside/recursos);
       System.out.println(pi);
   }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        piaproximation(1000);
        long endTime = System.nanoTime();
        System.out.println("Runtime: " + (endTime - startTime) / 1e6);

    }
}
