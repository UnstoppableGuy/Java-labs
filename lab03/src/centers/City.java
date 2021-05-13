package centers;

public class City implements IPopulationCenter {
    private String cityName;
    private int population;

    public City(String name, int population) {
        this.cityName = name;
        this.population = population;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setPopulation(int newPopulation) {
        this.population = newPopulation;
    }

    @Override
    public int countPopulation() {
        return this.population;
    }

    @Override
    public String getInfrastructure() {
        return this.cityName;
    }
}
