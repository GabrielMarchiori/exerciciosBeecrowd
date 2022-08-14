import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);

        float n1, n2, n3, n4, nota;

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        nota = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2+3+4+1);

        System.out.printf("Media: %.1f%n", nota);

        if (nota >= 7){
            System.out.println("Aluno aprovado.");
        }else if(nota < 5){
            System.out.println("Aluno reprovado.");
        }else{
            System.out.println("Aluno em exame.");
            
            float exame = sc.nextFloat();

            System.out.printf("Nota do exame: %.1f%n", exame);

            nota+= exame;
            nota/= 2;
                
            if (nota >= 5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", nota);
            }
            else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", nota);
            }
        }

        sc.close();

    }
}
