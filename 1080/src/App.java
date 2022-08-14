import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int maior=0, posicao=0, rept;

        for(rept=1; rept <= 100; rept++){
            int numero = sc.nextInt();

            if(maior<numero){
                maior=numero;
                posicao=rept;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);
        sc.close();
        
    }
}
