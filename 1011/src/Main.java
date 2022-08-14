import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Double pi = 3.14159;

        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        Double volume = (4.0/3) * pi * Math.pow(r, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();


    }
}
