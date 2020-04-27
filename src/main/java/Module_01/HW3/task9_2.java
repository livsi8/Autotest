package Module_01.HW3;

import java.util.Scanner;

public class task9_2 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите 3 начания:");
        int number1 = scan1.nextInt();
        int number2 = scan1.nextInt();
        int number3 = scan1.nextInt();
        int number4;

        scan1.close();

        if (number1 > number2 & number1 > number3) {

            System.out.println("Максимальное число " + number1);

        } else if (number2 > number3 & number2 > number1) {

            System.out.println("Максимальное число " + number2);

        } else {
            System.out.println("Максимальное число " + number3);
        }


        if (number1 < number2 & number1 < number3) {

            System.out.println("Минимальное число " + number1);

        } else if (number2 < number3 & number2 < number1) {

            System.out.println("Минимальное число " + number2);

        } else {

            System.out.println("Минимальное число " + number3);

        }
        number4 = (number1 + number2 + number3) / 2;
        System.out.println("Сумма всех числел " + (number3 + number2 + number1));
        System.out.println("Среднее число " + number4);
    }
}
