import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double notaA = A * 3.5;
        double notaB = B * 7.5;

        double media = (notaA + notaB) / 11;

        System.out.printf("MEDIA = %.5f%n", media);

        sc.close();


    }
}
