import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);

        double reajuste;
        double salarioInicial = sc.nextDouble();
        double salarioFinal;
        double ganho;

        if (salarioInicial <= 400.00){
            reajuste = 0.15;
            ganho = salarioInicial * reajuste;
            salarioFinal = salarioInicial + ganho;
        }
        else if(salarioInicial <= 800.00){       
            reajuste = 0.12;
            ganho = salarioInicial * reajuste;
            salarioFinal = salarioInicial + ganho;
        }
        else if(salarioInicial<= 1200){
            reajuste = 0.10;
            ganho = salarioInicial * reajuste;
            salarioFinal = salarioInicial + ganho;
        }
        else if(salarioInicial<=2000){
            reajuste = 0.07;
            ganho = salarioInicial * reajuste;
            salarioFinal = salarioInicial + ganho;
        }else{
            reajuste = 0.04;
            ganho = salarioInicial * reajuste;
            salarioFinal = salarioInicial + ganho;
        }

        reajuste*= 100;


        System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual %.0f %%%n ", salarioFinal, ganho, reajuste);

        sc.close();

    }
}
