import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner (System.in);

    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    double delta =Math.pow(b, 2)-4*a*c;

    if (a == 0 || delta <= 0.0){

        System.out.println("Impossivel calcular");
    }
    else{
        double x1 = (-b + Math.sqrt(delta))/(2*a);
        double x2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.printf("R1 = %.5f%n", x1);
        System.out.printf("R2 = %.5f%n", x2);
    }
     

    sc.close();

    }
}
