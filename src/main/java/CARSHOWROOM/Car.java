package CARSHOWROOM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
public String model;
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