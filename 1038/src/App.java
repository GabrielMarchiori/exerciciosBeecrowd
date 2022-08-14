import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);

        int codigo = sc.nextInt();
        int quant = sc.nextInt();
        double valor = 0;

        switch (codigo) {

        case 1:
            valor = 4.0 * quant;
            break;      

        case 2:
            valor = 4.5 * quant;
            break;      

        case 3:
            valor = 5.0 * quant;
            break;      

        case 4:
            valor = 2.0 * quant;
            break;      

        case 5:
            valor = 1.5 * quant;
            break;
        }

        System.out.printf("Total: R$ %.2f%n", valor);

        sc.close();

    }
}
