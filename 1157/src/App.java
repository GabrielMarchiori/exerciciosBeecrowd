import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        for(int rept=1; rept<=n; rept++){
            if (n%rept == 0){
                System.out.println(rept);
            }
        }
    sc.close();

    }
}
