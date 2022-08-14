import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int resto;
       
        Scanner sc = new Scanner (System.in);

        String escrita1 = sc.next();
        int dia1 = sc.nextInt();
        int hora1 = sc.nextInt();
        String p1 = sc.next();
        int min1 = sc.nextInt();
        String p2 = sc.next();
        int seg1 = sc.nextInt();

        String escrita2 = sc.next();
        int dia2 = sc.nextInt();
        int hora2 = sc.nextInt();
        String p3 = sc.next();
        int min2 = sc.nextInt();
        String p4 = sc.next();
        int seg2 = sc.nextInt();
        
        int inicio = (dia1 * 24 * 60 * 60) + (hora1 * 60 * 60) + (min1 * 60) + (seg1);
        int fim = (dia2 * 24 * 60 * 60) + (hora2 * 60 * 60) + (min2 * 60) + (seg2);

        int duracao = fim - inicio;

        int w = duracao / (24*60*60);
		resto = duracao % (24*60*60);
		int x = resto / (60*60);
		resto = resto % (60*60);
		int y = resto / 60;
		int z = resto % 60;

        System.out.println(w + " dia(s)");
		System.out.println(x + " hora(s)");
		System.out.println(y + " minuto(s)");
		System.out.println(z + " segundo(s)");	        
        

        sc.close();

    }
}
