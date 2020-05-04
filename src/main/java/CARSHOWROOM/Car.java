package CARSHOWROOM;


public class Car {
    public String model;
    public String type;
    public int year;
    public int passenger;
    public double dviglo;
    public int loshadka;
    public int rasshod;
    public double price;

    public Car(String model, String type, int year, int passenger, double dviglo, int loshadka, int rasshod, double price) {
        this.model = model;
        this.type = type;
        this.year = year;
        this.passenger = passenger;
        this.dviglo = dviglo;
        this.loshadka = loshadka;
        this.rasshod = rasshod;
        this.price = price;

    }
        public String getInfo(){

        return "Model: " + model + ", Type: " + type;
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