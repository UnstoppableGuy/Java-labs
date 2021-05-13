import centers.City;
import centers.Country;
import centers.Region;

public class App {
    public static void main(String[] args) throws Exception {
        Country Belarus = new Country("Belarus");

        Region brestRegion = new Region("Brest");
        City Brest = new City("Brest", 350616);
        City Pinsk = new City("Pinsk", 126300);
        City Baranovichi = new City("Baranovichi", 175000);
        Belarus.Add(brestRegion.Add(Brest).Add(Pinsk).Add(Baranovichi));

        Region minskRegion = new Region("Minsk");
        City Minsk = new City("Minsk", 2020600);
        City Borisov = new City("Borisov", 140700);
        City Soligorsk = new City("Soligorsk", 101400);
        Belarus.Add(minskRegion.Add(Minsk).Add(Borisov).Add(Soligorsk));
    
        Region badenWurttembergrRegion = new Region("Baden-Wurttemberg");
        City Mannheim = new City("Mannheim", 360345);
        City Heilbronn = new City("Heilbronn", 130334);
        City Refueling = new City("Refueling", 120200);
        Belarus.Add(badenWurttembergrRegion.Add(Mannheim).Add(Heilbronn).Add(Refueling));

        System.out.println("Population in " + Belarus.getCountyName() + " is " + Belarus.countPopulation());
        System.out.println(Belarus.getInfrastructure());
        Belarus.Remove(badenWurttembergrRegion);
        System.out.println("Population in " + Belarus.getCountyName() + " is " + Belarus.countPopulation());
        System.out.println(Belarus.getInfrastructure());
    }
}
