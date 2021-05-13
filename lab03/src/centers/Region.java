package centers;

import java.util.ArrayList;

public class Region implements IPopulationCenter {
    private final ArrayList<IPopulationCenter> centers;
    private final String regionName;

    public Region(String name) {
        this.regionName = name;
        this.centers = new ArrayList<>();
    }

    public String getCountyName() {
        return this.regionName;
    }

    public Region Add(IPopulationCenter center) {
        this.centers.add(center);
        return this;
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
        StringBuilder result = new StringBuilder(String.format("region: %s [\n", this.regionName));
        for (var center : centers) {
            result.append(String.format("\t\t%s\n", center.getInfrastructure()));
        }
        return result + "\t]";
    }
}
