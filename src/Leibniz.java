public class Leibniz {
    public static void piapproximation(int recursos){
        double serie = 0;
        double pi;
        for(int i=0; i<recursos;i++){
            serie+=(Math.pow((-1), i))/(2*i+1);
        }
        System.out.println("Pi: "+ 4*serie);
    }
    public static void main(String[] args) {
        piapproximation(1000);
    }
}
