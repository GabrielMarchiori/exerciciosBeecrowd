import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner sc = new Scanner(System.in);

        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int m, n;

        while(x>0 && y>0){
            int soma=0;
            if (x>y){
                m = x;
                n = y;        
            }
            else{
                m = y;
                n = x;
            }

            for(int rept=n; rept<=m; rept++){
                System.out.printf("%d ", rept);
                soma+=rept;                
            }
        
            System.out.println("Sum="+soma);

            x = sc.nextInt();
            y = sc.nextInt();

        }   
        sc.close();
    }
}
