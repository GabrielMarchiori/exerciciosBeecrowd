import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int gremio=0, inter=0 , grenal=0 , empate=0 , golGremio=0 , golInter=0 , rept;
        String ganhador;

        rept = 1;

        while(rept==1){

            golInter=sc.nextInt();
            golGremio=sc.nextInt();

            if(golGremio>golInter){
                gremio+=1;
            }
            else if(golInter>golGremio){
                inter+=1;
            }
            else{
                empate+=1;
            }

            grenal+=1;
            rept=0;

            while(rept!=1 && rept!=2){
                System.out.println("Novo grenal (1-sim 2-nao)");
                rept = sc.nextInt();
            }
        }

        if (gremio>inter){
            ganhador = "Gremio venceu mais";
        }
        else if (inter>gremio){
            ganhador = "Inter venceu mais";
        }
        else{
            ganhador = "Nao houve vencedor";
        }

        System.out.println(grenal + " grenais");
        System.out.println("Inter: " + inter);
        System.out.println("Gremio: " + gremio);
        System.out.println("Empates: " + empate);
        System.out.println(ganhador);

        sc.close();
    }
}
