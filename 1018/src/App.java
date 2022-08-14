import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int n = Math.abs(a);

        int celulas100 = n / 100;
        int rest100 = n % 100;

        int celulas50 = rest100 / 50;
        int rest50 = rest100 % 50;

        int celulas20 = rest50 / 20;
        int rest20 = rest50 % 20;

        int celulas10 = rest20 / 10;
        int rest10 = rest20 % 10;

        int celulas5 = rest10 / 5;
        int rest5 = rest10 % 5;

        int celulas2 = rest5 / 2;
        int rest2 = rest5 % 2;
        
        int celulas1 = rest2 / 1;

        System.out.println(n);
        System.out.println(celulas100 + " nota(s) de R$ 100,00");
        System.out.println(celulas50 + " nota(s) de R$ 50,00");
        System.out.println(celulas20 + " nota(s) de R$ 20,00");
        System.out.println(celulas10 + " nota(s) de R$ 10,00");
        System.out.println(celulas5 + " nota(s) de R$ 5,00");
        System.out.println(celulas2 + " nota(s) de R$ 2,00");
        System.out.println(celulas1 + " nota(s) de R$ 1,00");

        sc.close();

    }
}
