package ESHOP;

public class MainClass {
    public static void main(String[] args) {

        //объекты staff


        Staff shopAssistant = new Staff();
        shopAssistant.name = "Alex";
        shopAssistant.age = 25;
        shopAssistant.experienceMonth = 12;
        shopAssistant.salary = 30000;
        shopAssistant.position = "Продавец-консультант";
      //  System.out.println("Должность:" + shopAssistant.position);
      //  System.out.println("Имя:" + shopAssistant.name);
      //  System.out.println("Возраст:" + shopAssistant.age);
      //  System.out.println("Опыт работы:" + shopAssistant.experienceMonth);
      //  System.out.println("Зарплата:" + shopAssistant.salary);

        Staff cashierSeller = new Staff();
        cashierSeller.name = "Igor";
        cashierSeller.age = 44;
        cashierSeller.experienceMonth = 33;
        cashierSeller.salary = 50000;
        cashierSeller.position = "Продавец-кассир";
      //  System.out.println("Должность:" + cashierSeller.position);
      //  System.out.println("Имя:" + cashierSeller.name);
      //  System.out.println("Возраст:" + cashierSeller.age);
      //  System.out.println("Опыт работы:" + cashierSeller.experienceMonth);
      //  System.out.println("Зарплата:" + cashierSeller.salary);

        Staff Security = new Staff();
        Security.name = "Andrew";
        Security.age = 19;
        Security.experienceMonth = 10;
        Security.salary = 44000;
        Security.position = "Охранник";
        // System.out.println("Должность:" + Security.position);
        // System.out.println("Имя:" + Security.name);
        // System.out.println("Возраст:" + Security.age);
        // System.out.println("Опыт работы:" + Security.experienceMonth);
        // System.out.println("Зарплата:" + Security.salary);


        //объекты product
        product phoneIphoneX = new product();
        phoneIphoneX.productName = "Iphone X";
        phoneIphoneX.price = 40000;
        phoneIphoneX.available = "Есть в наличии";
        phoneIphoneX.characteristic = "Производительность высокая";


    }



}
