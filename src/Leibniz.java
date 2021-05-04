public class Leibniz {
    public static void piapproximation(int recursos){
        double serie = 0;
        double pi;
        for(int i=0; i<=recursos;i++){
            //2/((4 ∗ n + 1) ∗ (4 ∗ n + 3))
            serie+= (float)2 / ((4 * i + 1) * (4 * i + 3));
        }
        System.out.println("Pi: "+ 4*serie);

    }
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        piapproximation(500000);
        long endTime = System.nanoTime();
        System.out.println("Runtime: " + (endTime - startTime) / 1e6);


    }
}
