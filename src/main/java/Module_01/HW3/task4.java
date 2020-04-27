package Module_01.HW3;
import java.util.Scanner;
public class task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;

        do {
            number1 = (int) (Math.random() * 40 + 1) - 20;
        }
        while (number1 == 0);
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите целое число из отрезка от -20 до 20");
        if (scn.hasNextInt()) {
            do {
                number2 = scn.nextInt();
                if (number2 < -10 || number2 == 0 || number2 > 10) {
                    System.out.println("Вы ввели число не из-заданного диапазона или 0");
                    System.out.println("Повторите ввод");
                } else {
                    ++number3;
                    if (number2 == number1) {
                        System.out.println("Вы угадали с " + number3 + " попытки");
                    } else {
                        if (number2 < number1) System.out.println("Число больше");
                        else System.out.println("Число меньше");
                        if ((number2 < 0 & number1 > 0) || (number2 > 0 & number1 < 0))
                            System.out.println("Число с другим знаком");
                    }
                }
            }

            while (number2 != number1);
        } else System.out.println("Ошибка. Введено не целое число");
    }
}
