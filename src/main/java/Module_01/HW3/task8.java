package Module_01.HW3;

import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        System.out.println("Введите возраст от 0 - 100");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        scan.close();
                            switch (number1) {

                case 10:
                            System.out.println("Юнец");
                                                         break;
                case 20:
                System.out.println("Взрослый");
                                                         break;
                case 30:
                System.out.println("Взрослее взрослого.");
                                                         break;
                case 40:
                System.out.println("Юнец x4");
                                                         break;
                case 50:
                System.out.println("Юнец x5");
                                                         break;
                case 60:
                System.out.println("Юнец x6");
                                                         break;
                case 70:
                System.out.println("Юнец x7");
                                                         break;
                case 80:
                System.out.println("Юнец x8");
                                                         break;
                case 90:
                System.out.println("Юнец x9");
                                                         break;
                case 100:
                System.out.println("Юнец x10");
                                                         break;

        }
    }
}
