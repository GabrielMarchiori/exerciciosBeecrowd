import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int multiplicador = 1;
        int fator = 1;
        int prdt1, prdt2, prdt3;

        for(int rept=1; rept<=n; rept++){
            
            prdt1 = fator * multiplicador;
            prdt2 = prdt1 * multiplicador;
            prdt3 = prdt2 * multiplicador;
            System.out.println(prdt1 + " " + prdt2 + " " + prdt3);

            prdt2++;
            prdt3++;

            System.out.println(prdt1 + " " + prdt2 + " " + prdt3);

            multiplicador++;
            
        }
        
        sc.close();

    }

       
}
