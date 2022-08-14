import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double aa = (a * c /2);
        double bb = pi * Math.pow(c, 2);
        double cc = ((a + b) * c)/2;
        double d = Math.pow(b, 2);
        double e = a * b;

        System.out.printf("TRIANGULO: %.3f%n", aa);
        System.out.printf("CIRCULO: %.3f%n", bb);
        System.out.printf("TRAPEZIO: %.3f%n",cc);
        System.out.printf("QUADRADO: %.3f%n", d);
        System.out.printf("RETANGULO: %.3f%n", e);

        sc.close();


    }
}
