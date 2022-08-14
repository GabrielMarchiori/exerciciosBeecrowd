import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int resp=0;

        int maior, menor;

        if(x>y){
            maior = x;
            menor = y;
        }
        else{
            maior = y;
            menor = x;
        }


        for (int rept = menor; rept<=maior; rept++){
            if(rept % 13 != 0){
                resp+=rept;
            }
        }

        System.out.println(resp);
        sc.close();

    }
}
