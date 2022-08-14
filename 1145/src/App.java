import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int impresao=1;

        int max = y/x;

        for (int rept = 1; rept<=max; rept++){
            for (int rept2=1; rept2<x; rept2++){
                System.out.printf("%d ", impresao);
                impresao++;
            }
            System.out.printf("%d", impresao);
                impresao++;
            System.out.println("");
        }

        sc.close();

    }
}
