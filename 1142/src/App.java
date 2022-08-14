import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x=0;
        int rept=1;

            do{
                x+=1;
                System.out.printf("%d ", x);
                x+=1;
                System.out.printf("%d ", x);
                x+=1;
                System.out.printf("%d ", x);
                x+=1;
                System.out.printf("PUM%n");
                rept++;
            }
            while(rept<=n);

            sc.close();
    }
}
