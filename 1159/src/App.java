import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int x;
        int saida=0;
        int rept=0;
        int soma=0;

        x = sc.nextInt();

        while(x!=0){
            soma=x;

            while(rept!=4){

                if(x%2 != 0){
                x++;
                soma=x;

            }else{}

            rept++;
            soma+=2;
            x+=soma;
            

           }

           System.out.println(x);
           
           soma=0;
           rept=0;
           x = sc.nextInt();

        }

        sc.close();

    }
}
