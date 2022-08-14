import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x, y, media;
        double rept=1;

        while(rept==1){
            x = sc.nextDouble();
            while(x<0 || x>10){
                System.out.println("nota invalida");
                x = sc.nextDouble();
            }
            y = sc.nextDouble();
            while(y<0 || y>10){
                System.out.println("nota invalida");
                y = sc.nextDouble();
            }
            media = (x + y)/2;
            rept = 0;

            System.out.printf("media = %.2f%n", media);
            while(rept != 1 && rept != 2){
            System.out.println("novo calculo (1-sim 2-nao)");
            rept = sc.nextInt();
            }
        }
        sc.close();
    }
}
