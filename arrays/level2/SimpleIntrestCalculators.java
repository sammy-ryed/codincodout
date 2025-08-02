import java.util.Scanner;
class SimpleIntrestCalculator{

    static double SimpleIntrest(double p, double r, double t){
        return ((p*r*t)/100);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Pricinpal amount, rate of intrest and time taken in years");
        double Pricinpal=sc.nextDouble();
        double Rate=sc.nextDouble();
        double Time=sc.nextDouble();

        //SimpleIntrestCalculator SimpleIntrest = new SimpleIntrestCalculator();
        double si= SimpleIntrest (Pricinpal,Rate,Time);

        System.err.println("The Simple Interest is "+si+" for Principal "+Pricinpal+", Rate of Interest "+Rate+" and Time "+Time);

        sc.close();
    }
}