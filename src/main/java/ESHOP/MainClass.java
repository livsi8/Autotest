package ESHOP;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        //объекты staff

        Staff shopAssistant1 = new Staff("Alex", "Продавец-консультант", 30000, 25, 22, "Отдел бытовой техники");
        Staff shopAssistant2 = new Staff("Igor", "Продавец-консультант", 45000, 29, 33, "Отдел компьютерной техники");
        Staff shopAssistant3 = new Staff("Valentina", "Продавец-консультант", 20000, 19, 3, "Отдел мобильных устройств");
        Staff security = new Staff("Andrew", "Охранник", 35000, 44, 45, "Торговый зал");
        Staff cashierSeller = new Staff("Petr", "Продавец-кассир", 40000, 33, 23, "Кассовая зона");

        //объекты product
        Product phoneIphoneX = new Product("Iphone X", 22000, true, "Высокая производительность", "Отдел мобильных устройств", 2);
        Product computerNotebook = new Product("Acer", 50000, true, "Высокая производительность", "Отдел компьютерной техники",1);
        Product stove = new Product("Greta", 10000, false, "Газовая", "Отдел бытовой техники",0);

        //объекты Buyer
        Buyer buyer1 = new Buyer();

        buyer1.hiBuyer();
        security.chooseDepartment();
        Scanner in = new Scanner(System.in);
        String enterDepartment = in.nextLine();
        security.chooseBuyer(enterDepartment);

        String choosePr = in.nextLine();
        







      //  System.out.println("Должность:" + shopAssistant1.position);
      //  System.out.println("Имя:" + shopAssistant1.name);
      //  System.out.println("Возраст:" + shopAssistant1.age);
      //  System.out.println("Опыт работы:" + shopAssistant1.experienceMonth);
      //  System.out.println("Зарплата:" + shopAssistant1.salary);

       // Staff shopAssistant2 = new Staff();
       // shopAssistant2.name = "Alex";
       // shopAssistant2.age = 25;
       // shopAssistant2.experienceMonth = 12;
       // shopAssistant2.salary = 30000;
       // shopAssistant2.position = "Продавец-консультант";
       // shopAssistant2.department = "Отдел бытовой техники";
//
       // Staff shopAssistant3 = new Staff();
       // shopAssistant3.name = "Alex";
       // shopAssistant3.age = 25;
       // shopAssistant3.experienceMonth = 12;
       // shopAssistant3.salary = 30000;
       // shopAssistant3.position = "Продавец-консультант";
       // shopAssistant3.department = "Отдел компьютерной техники";
//
       // Staff cashierSeller = new Staff();
       // cashierSeller.name = "Igor";
       // cashierSeller.age = 44;
       // cashierSeller.experienceMonth = 33;
       // cashierSeller.salary = 50000;
       // cashierSeller.position = "Продавец-кассир";
      ////  System.out.println("Должность:" + cashierSeller.position);
      ////  System.out.println("Имя:" + cashierSeller.name);
      ////  System.out.println("Возраст:" + cashierSeller.age);
      ////  System.out.println("Опыт работы:" + cashierSeller.experienceMonth);
      ////  System.out.println("Зарплата:" + cashierSeller.salary);
//
       // Staff Security = new Staff();
       // Security.name = "Andrew";
       // Security.age = 19;
       // Security.experienceMonth = 10;
       // Security.salary = 44000;
       // Security.position = "Охранник";
       // // System.out.println("Должность:" + Security.position);
       // // System.out.println("Имя:" + Security.name);
       // // System.out.println("Возраст:" + Security.age);
       // // System.out.println("Опыт работы:" + Security.experienceMonth);
       // // System.out.println("Зарплата:" + Security.salary);
//
//
       // //объекты product
       // product phoneIphoneX = new product();
       // phoneIphoneX.productName = "Iphone X";
       // phoneIphoneX.price = 40000;
       // phoneIphoneX.available = "Есть в наличии";
       // phoneIphoneX.characteristic = "Производительность высокая";
       // phoneIphoneX.department = "Отдел мобильной техники";


    }



}
