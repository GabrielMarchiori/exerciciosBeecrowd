import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int z = 1; z<=n; z++){
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(y==0){
                System.out.println("divisao impossivel");
            }
            else{
                double resp = (double) x/y;
                System.out.printf("%.1f%n", resp);
            }
        }
        sc.close();

    }
}
