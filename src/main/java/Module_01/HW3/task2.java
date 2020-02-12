package Module_01.Lesson_04;

import java.util.Scanner;
class task2 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите число a");
        int number1 = scan1.nextInt();
        System.out.println("Введите число b");
        int number2 = scan1.nextInt();
        int number3;
        scan1.close();

        number3 = number1;
        number1 = number2;
        number2 = number3;

        System.out.println("Число a=" + number1);
        System.out.println("Число b=" + number2);

    }
}
