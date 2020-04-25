package ESHOP;

public class MainClass {
    public static void main(String[] args) {
        //объекты staff
        Staff shopAssistant = new Staff();
        shopAssistant.name = "Alex";
        shopAssistant.age = 25;
        shopAssistant.experienceMonth = 12;
        shopAssistant.salary = 3000;
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

    }



}
