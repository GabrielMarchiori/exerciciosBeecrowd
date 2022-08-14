import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double renda = sc.nextDouble();
        double imposto, part1, part2, part3, part4;

        if(renda<=2000.00){
            System.out.println("Isento");
        }
        else if(renda<=3000.00){
            renda-= 2000.00;
            imposto = renda * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        }
        else if(renda<=4500.00){
            renda-= 2000.00;
            part1 = renda - 1000;
            imposto = (part1 * 0.18)+(1000.00 * 0.08);
            System.out.printf("R$ %.2f%n", imposto);
        }
        else{
            renda-= 2000.00;
            part1 = renda - 2500;
            imposto = (part1 * 0.28)+(1500.00 * 0.18)+(1000.00 * 0.08);
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
        
    }
}
