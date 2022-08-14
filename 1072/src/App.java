import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int in=0, out=0;

        for(int y=1; y<=n; y++){
           int x = sc.nextInt();

            if (x>=10 && x<=20){
                in++;
            }
            else{
                out++;
            }

        }
    System.out.println(in + " in");
    System.out.println(out + " out");

    sc.close();

    }
}
