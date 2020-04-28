package CARSHOWROOM;

import java.util.Arrays;
import java.util.List;

public class Car {
private String model;
private String type;
private int year;
private  int passenger;
private double dviglo;
private int loshadka;
private int rasshod;
private double price;

public Car (String model, String type, int year, int passenger, double dviglo, int loshadka, int rasshod, double price){
this.model = model;
this.type = type;
this.year = year;
this.passenger = passenger;
this.dviglo = dviglo;
this.loshadka = loshadka;
this.rasshod = rasshod;
this.price = price;

}
    List<Car> car = Arrays.asList(
            new Car("Zaz", "hatchback", 1999, 4, 2.0, 200, 12, 2000),
            new Car("Audi", "sedan", 2020, 2, 3.0, 270, 15, 2000000),
            new Car("Ford", "Pickup", 2000, 4, 4.5, 170, 19, 20000),
            new Car("Zaz", "sedan", 2005, 1, 3.2, 100, 8, 30000),
            new Car("Volkswagen", "sedan", 2020, 4, 2.5, 200, 12, 700000),
            new Car("Tesla", "sedan", 2009, 4, 1.1, 200, 12, 900000),
            new Car("Toyota", "hatchback", 2015, 4, 2.0, 200, 12, 400000),
            new Car("Honda", "sedan", 1999, 4, 2.0, 200, 12, 500000)
            );

}
//=== Автосалон ===
//        Автомобиль:
//        свойства:
//        - марка
//        - модель
//        - тип кузова
//        - год выпуска
//        - пасажировместимость
//        - объем двигателя
//        - мощность двигателя (л.с.)
//        - расход топлива
//        - стоимость
//        Автосалон:
//        свойства:
//        - список автомобилей
//        услуги автосалона:
//        - поиск по марке автомобился
//        ---------- году выпуска
//        ---------- пассажировместимости
//        ---------- расходу топлива
//        ---------- типу кузова
//
//        Без проблем можете придумать свои дополнительные свойства или же доп услуги (скидки и прочее)