import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int soma1 = c + d;
        int soma2 = a + b;
        int div = a % 2;


        if (b > c && d > a && c > 0 && d > 0 && soma1 > soma2 && div == 0){
                    System.out.println("Valores aceitos");      
        }
        else {
            System.out.println("Valores nao aceitos");
        }
        sc.close();

    }
}
