import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        String clase1, clase2, clase3;

        clase1 = sc.nextLine();
        clase2 = sc.nextLine();
        clase3 = sc.nextLine();

        switch(clase1){
        case "vertebrado":
            switch(clase2){
            case "ave":
                switch(clase3){
                    case "carnivoro":
                        System.out.println("aguia");
                    break;
                    case "onivoro":
                        System.out.println("pomba");
                    break;
                }
            break;
            case "mamifero":
                switch(clase3){
                    case "onivoro":
                        System.out.println("homem");
                    break;
                    case "herbivoro":
                        System.out.println("vaca");
                    break;
                }
            break;
            }
        break;

        case "invertebrado":
            switch(clase2){
            case "inseto":
                switch(clase3){
                    case "hematofago":
                        System.out.println("pulga");
                    break;
                    case "herbivoro":
                        System.out.println("lagarta");
                    break;
                }
            break;
            case "anelideo":
                switch(clase3){
                    case "hematofago":
                        System.out.println("sanguessuga");
                    break;
                    case "onivoro":
                        System.out.println("minhoca");
                    break;              
            
            }
        break;

        }
            
        }

        sc.close();
    }
}
