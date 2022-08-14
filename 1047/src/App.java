import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal, inicio, fim, totalHoras, totalMin;

        horaInicial = sc.nextInt();
        minutoInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        minutoFinal = sc.nextInt();

        horaInicial*= 60;
        horaFinal*= 60;
        inicio = horaInicial + minutoInicial;
        fim = horaFinal + minutoFinal;

        int duracao;
        
        if(inicio < fim){
            duracao = inicio - fim;
        }
        else{
            duracao = (24 * 60 - inicio) + fim;
        }

        totalHoras = duracao / 60;
        totalMin = duracao % 60;

        System.out.println("O JOGO DUROU " + totalHoras + " HORA(S) E " + totalMin + " MINUTO(S)" );
        
        sc.close();
    }
}
