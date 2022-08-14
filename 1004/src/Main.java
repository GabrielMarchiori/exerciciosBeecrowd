import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int fator1 = sc.nextInt();
        int fator2 = sc.nextInt();

        int PROD = fator1 * fator2;

        System.out.println("PROD = " + PROD);

        sc.close();
        
        
    }
}
