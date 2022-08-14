import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

    Scanner sc = new Scanner (System.in);

    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double C = sc.nextDouble();


    double pesoA = A * 2;
    double pesoB = B * 3;
    double pesoC = C * 5;

    double media = (pesoA + pesoB + pesoC) / 10;

    System.out.printf("MEDIA = %.1f%n", media);

    sc.close();


    }
}
