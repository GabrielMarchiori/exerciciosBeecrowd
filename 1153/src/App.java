import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x;

        sc.close();

        for (x=n; x!=1; x--){
            n = n * (x-1);
            
        }

        System.out.println(n);

        
    }        
}

