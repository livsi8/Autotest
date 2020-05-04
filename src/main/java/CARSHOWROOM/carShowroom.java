package CARSHOWROOM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class carShowroom {
    public static List<Car> car = Arrays.asList(
            new Car("Zaz", "hatchback", 1999, 4, 2.0, 200, 12, 2000),
            new Car("Audi", "sedan", 2020, 2, 3.0, 270, 15, 2000000),
            new Car("Ford", "Pickup", 2000, 4, 4.5, 170, 19, 20000),
            new Car("Zaz", "sedan", 2005, 1, 3.2, 100, 8, 30000),
            new Car("Volkswagen", "sedan", 2020, 4, 2.5, 200, 12, 700000),
            new Car("Tesla", "sedan", 2009, 4, 1.1, 200, 12, 900000),
            new Car("Toyota", "hatchback", 2015, 4, 2.0, 200, 12, 400000),
            new Car("Honda", "sedan", 1999, 4, 2.0, 200, 12, 500000)
    );

    public static List<Car> getCar(String textSearch, String model) {

        List<Car> carSearch = new ArrayList<>();
        for (Car value : car) {
            if (value.model.contains(textSearch)) {
                carSearch.add(value);
            }


        }
        return carSearch;
    }
}
