package utilities;

public class PopulationGrowth {

    private String name;
    private int population;
    private double growth;

    public PopulationGrowth(String name, int population, double growth) {
        this.name = name;
        this.population = population;
        this.growth = growth;
    }

    public String getName() {
        return this.name;
    }

    public int getPopulation() {
        return population;
    }

    public double getGrowth() {
        return growth;
    }

    public String toString() {
        return name+", population "+population+", population growth "+growth;
    }

    
   



    
}
