import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
/* 1 ano tem 365 dias
 * 1 mes tem 30 dias */

        Scanner sc = new Scanner (System.in);

        int x = sc.nextInt();

        int anos = x / 365;
        int y = x % 365;

        int meses = y / 30;
        int dias = y % 30;

    
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        sc.close();

    }
}
