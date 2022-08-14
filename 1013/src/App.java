import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int a = ((x+y+Math.abs(x-y))/2);
        int b = ((a+z+Math.abs(a-z))/2);

        System.out.println(b + " eh o maior");

        sc.close();
    
    }
}
