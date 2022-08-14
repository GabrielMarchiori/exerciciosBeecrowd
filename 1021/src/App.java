import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);

        double n = sc.nextDouble();

        int n100 = (int) n / 100;
        double r100 = n % 100;
        
        int n50 = (int) r100 / 50;
        double r50 = r100 % 50;
        
        int n20 = (int) r50 / 20;
        double r20 = r50 % 20;
        
        int n10 = (int) r20 / 10;
        double r10 = r20 % 10;
        
        int n5 = (int) r10 / 5;
        double r5 = r10 % 5;
        
        int n2 = (int) r5 / 2;
        double r2 = r5 % 2;

        int n01 = (int) r2 / 1;
        double m01 = r2 % 1;

        m01 = m01 * 100;

        int n050 = (int) (m01 / 50);
        double m050 = m01 % 50;

        int n025 = (int) (m050 / 25);
        double m025 = m050 % 25;

        int n010 = (int) (m025 / 10);
        double m010 = m025 % 10;

        int n005 = (int) (m010 / 5);
        double m005 = m010 % 5;

        int n001 = (int) (m005 / 1);
        double m001 = m005 % 1;



        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n", n100);
        System.out.printf("%d nota(s) de R$ 50.00%n", n50);
        System.out.printf("%d nota(s) de R$ 20.00%n", n20);
        System.out.printf("%d nota(s) de R$ 10.00%n", n10);
        System.out.printf("%d nota(s) de R$ 5.00%n", n5);
        System.out.printf("%d nota(s) de R$ 2.00%n", n2);

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00%n", n01);
        System.out.printf("%d moeda(s) de R$ 0.50%n", n050);
        System.out.printf("%d moeda(s) de R$ 0.25%n", n025);
        System.out.printf("%d moeda(s) de R$ 0.10%n", n010);
        System.out.printf("%d moeda(s) de R$ 0.05%n", n005);
        System.out.printf("%d moeda(s) de R$ 0.01%n", n001);

        
        sc.close();
        

    }
}
