import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        for(int x=1; x<=n; x++){
            Double x1 = sc.nextDouble();
            Double x2 = sc.nextDouble();
            Double x3 = sc.nextDouble();

            Double media = ((x1*2.0) + (x2*3.0) + (x3*5.0)) / (2.0+3.0+5.0);
            System.out.printf("%.2f%n", media);
        }
        
    sc.close();

    }
}
