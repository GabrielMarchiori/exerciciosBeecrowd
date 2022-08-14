import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double x = 0;
    double y = 0;
    double media;

    x = sc.nextDouble(); //11

    while ((x > 10.0) && (x < 0)){
        System.out.println("nota invalida");
        x = sc.nextDouble(); //4
    }

    y = sc.nextDouble();

    
    while (y > 10.0 && y < 0){
        System.out.println("nota invalida");
        y = sc.nextDouble();
    }

    media =  (x + y)/ 2.0;
    
    System.out.printf("media = %.2f%n", media);

    sc.close();

    }
}
