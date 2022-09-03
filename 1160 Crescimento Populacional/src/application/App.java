package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import utilities.PopulationGrowth;

public class App {
    public static void main(String[] args) throws Exception {
        
        //part 1

        List<PopulationGrowth> cities = new ArrayList<>();

        loopAddCities(cities);
        
        char loopComparation='l';
        
          do{
            System.out.println("Write the name of 2 cities for population comparison");
            String comparation1 = sc.nextLine();
            Integer position1 = positionList(cities, comparation1);
            String comparation2 = sc.nextLine();            
            Integer position2 = positionList(cities, comparation2);

            if(position1 != null && position2 != null){
                int time = timeToGrowth(cities, position1, position2);
                if(time<0){
                    System.out.println("More than 1 century to have same population");  
                }    
                else{
                    System.out.println(time+" years to have the same population");
                }
                
            }
            else{
                if(position1 == null){
                    System.out.println(comparation1 + " not added, want to add this city?(y/n)");
                    char add = sc.next().charAt(0);
                    if(add =='y'){
                        loopAddCities(cities);
                    }
                }
                else{
                    System.out.println(comparation2 + " not added, want to add this city?(y/n)");
                    char add = sc.next().charAt(0);
                    if(add =='y'){
                        loopAddCities(cities);
                    }
                }
                
        }
        
            System.out.println("want to make another comparison?(y/n)");
            loopComparation=sc.next().charAt(0);
            sc.nextLine();

        }while(loopComparation=='y');    

            for (int position=0; position<cities.size(); position++) {
                System.out.println(cities.get(position));
            }
            sc.close();

    }

    public static void loopAddCities(List<PopulationGrowth> cities){
        Locale.setDefault(Locale.US);
        char addCities = 'l';

        int numberCities=1;
        if(numberCities<=cities.size()){
            numberCities=cities.size()+1;
            sc.nextLine();

        }

        do{
            
            System.out.println("City "+(numberCities)+"#:");
            String name=sc.nextLine();
            System.out.println("Population:");
            int population=sc.nextInt();
            System.out.println("Population growth");
            double growth=sc.nextDouble();
            cities.add(new PopulationGrowth(name, population, growth));
            System.out.println("Want to add one more city?(y/n)");
            addCities = sc.next().charAt(0);
            sc.nextLine();
            numberCities++;
        }
        while(addCities=='y');

        
  
    }

    public static Integer positionList (List<PopulationGrowth> cities, String name){

        for(int position=0; position<cities.size(); position++){
            if(cities.get(position). getName().intern() == name.intern()){
                return position;
            }
        } 
        return null;
    }

    public static int timeToGrowth (List<PopulationGrowth> cities, int position1, int position2){
        
        int cit3=0;
        int cit1 = cities.get(position1).getPopulation();
        int cit2 = cities.get(position2).getPopulation();

        if(cit1>cit2){
            cit3=cit1;
            cit1=cit2;
            cit2=cit3;
        }
        double percentage1 = cities.get(position1).getGrowth();
        double percentage2 = cities.get(position2).getGrowth();

        int repeat=0;
        while(cit1<cit2&&repeat<100){
            cit1+=cit1*percentage1/100;
            cit2+=cit2*percentage2/100;
            repeat++;
        }
        if(repeat>=100){
            return -1;
        }
        else{

        return repeat;
        }
    }


    public static Scanner sc = new Scanner (System.in); 

}
