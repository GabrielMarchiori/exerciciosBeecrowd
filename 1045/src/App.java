import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double variavel1 = sc.nextDouble();
        double variavel2 = sc.nextDouble();
        double variavel3 = sc.nextDouble();

        double a=0;
        double b=0;
        double c=0;

        if(variavel2>=variavel1 && variavel2>=variavel3){
            a=variavel2;
            if(variavel1<variavel3){
                c=variavel1;
                b=variavel3;
            }
            else{
                c=variavel3;
                b=variavel1;
            }
        }

        else if(variavel3>=variavel1 && variavel3>=variavel2){
            a=variavel3;
            if(variavel1<variavel2){
                c=variavel1;
                b=variavel2;
            }
            else{
                c=variavel2;
                b=variavel1;
            }
        }
        else if(variavel1>=variavel2 && variavel1>=variavel3){
            a=variavel1;
            if(variavel2<variavel3){
                c=variavel2;
                b=variavel3;
            }
            else{
                c=variavel3;
                b=variavel2;
            }
        }
        else if(variavel1 == variavel2 && variavel2 < variavel3){
            a = variavel3;
            b = variavel1;
            c = variavel1;
        }
        else if(variavel1== variavel3 && variavel1 < variavel2){
            a = variavel2;
            b = variavel1;
            c = variavel1;
        }
        else if(variavel3 == variavel2 && variavel2 < variavel1){
            a = variavel1;
            b = variavel2;
            c = variavel2;
        }
        else if(variavel1 == variavel3 && variavel3 == variavel2){
            a = variavel1;
            b = variavel2;
            c = variavel3;
        }
        

        if (a >= b+c){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else{
            
            if(a*a==(b*b)+(c*c)){
                System.out.println("TRIANGULO RETANGULO");
            }
            if(Math.pow(a, 2)>Math.pow(b, 2)+Math.pow(c, 2)){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if((a*a)<((b*b)+(c*c))){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if(a==b && a==c){
                System.out.println("TRIANGULO EQUILATERO");
            }
            if(a==b && b!=c|| a==c && c!=b|| b==c && c!=a){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();

    }
}

