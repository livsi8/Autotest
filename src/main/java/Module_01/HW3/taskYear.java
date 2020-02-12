package Module_01.Lesson_04;

import java.util.Scanner;
class taskYear {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Введите год");
     int year = scan1.nextInt();
     if (year % 4 == 0){
         System.out.println("Год " + year + " високосный");

     }
     else {
         System.out.println("Год " + year + " не високосный");
     }
    }
    }
