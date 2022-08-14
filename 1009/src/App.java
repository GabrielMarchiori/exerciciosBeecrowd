import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        Double salario = sc.nextDouble();
        Double vendas = sc.nextDouble();

        Double total = (0.15 * vendas) + salario;

        System.out.printf("TOTAL = R$ %.2f", total);

    }
}
