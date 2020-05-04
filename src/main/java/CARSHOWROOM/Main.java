package CARSHOWROOM;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> filtredCar = carShowroom.getCar("u", "model");
        for (Car car : filtredCar) {
            System.out.println(car.getInfo());

        }





    }
}
