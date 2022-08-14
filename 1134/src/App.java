import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int gasolina=0;
        int diesel=0;
        int tipo=0;
        int alcool=0;

        tipo = sc.nextInt();

        while(tipo != 4){

            switch(tipo){
                case 1:
                    alcool+=1;
                break;

                case 2:
                    gasolina+=1;
                break;

                case 3:
                    diesel+=1;
                break;

            }
            
        tipo = sc.nextInt();

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        sc.close();
    }
}
