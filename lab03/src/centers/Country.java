package centers;

import java.util.ArrayList;

public class Country implements IPopulationCenter {
    private final ArrayList<IPopulationCenter> centers;
    private final String countyName;

    public Country(String name) {
        this.countyName = name;
        this.centers = new ArrayList<>();
    }

    public String getCountyName() {
        return this.countyName;
    }

    public void Add(IPopulationCenter center) {
        this.centers.add(center);
    }

    public void Remove(IPopulationCenter center) {
        this.centers.remove(center);
    }

    @Override
    public int countPopulation() {
        int population = 0;
        for (var center : centers) {
            population += center.countPopulation();
        }
        return population;
    }

    @Override
    public String getInfrastructure() {
        StringBuilder result = new StringBuilder(String.format("country: %s {\n", this.countyName));
        for (var center : centers) {
            result.append(String.format("\t%s\n", center.getInfrastructure()));
        }
        return result + "}";
    }
}
