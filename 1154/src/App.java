import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double media=0;
        double rep=0;

        int idade = sc.nextInt();

        while(idade>0){
            media+=idade;
            rep++;

            idade = sc.nextInt();
        }

        media/=(Double) rep;

        System.out.printf("%.2f%n", media);

        sc.close();
    }
}
