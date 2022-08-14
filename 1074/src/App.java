import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        for(int y = 1; y<=n; y++){
            int x = sc.nextInt();

            if(x<0 && x%2==0){
                System.out.println("EVEN NEGATIVE");
            }
            else if(x<0){
                System.out.println("ODD NEGATIVE");
            }
            else if(x>0 && x%2==0){
                System.out.println("EVEN POSITIVE");
            }
            else if(x>0){
                System.out.println("ODD POSITIVE");
            }
            else{
                System.out.println("NULL");
            }
        }

        sc.close();
    }
}
