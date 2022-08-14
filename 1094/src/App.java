import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int geral = sc.nextInt();
        int teste=0;
        int testeGeral=0;
        int rept=0;
        int rato=0;
        int sapo=0;
        int coelho=0;
        double percCoelho=0;
        double percRatos=0;
        double percSapos=0;


        for(rept=1; rept<= geral; rept++){
            teste = sc.nextInt();
            char especie = sc.next().charAt(0);
            if (especie == 'R'){
                rato+=teste;
            }
            else if (especie=='S'){
                sapo+=teste;
            }
            else {
                coelho+=teste;
            }
            testeGeral+=teste;
        }
        percCoelho = (double)(100*coelho)/testeGeral;
        percSapos = (double)(100*sapo)/testeGeral;
        percRatos = (double)(100*rato)/testeGeral;

        System.out.println("Total: " + testeGeral + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f %% %n", percCoelho);
        System.out.printf("Percentual de ratos: %.2f %% %n", percRatos);
        System.out.printf("Percentual de sapos: %.2f %% %n", percSapos);
        
        sc.close();
    }
}
