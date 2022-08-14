import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        int x = sc.nextInt();
        for (int y=1; y<x; y+=2){
            System.out.println(y);            
        }
        sc.close();
    }
}
