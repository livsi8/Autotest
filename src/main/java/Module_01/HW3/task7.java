package Module_01.Lesson_04;

import java.util.Scanner;
class task7 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Введите первую сторону треугольника");
        int number1 = scan1.nextInt();
        System.out.println("Введите вторую сторону треугольника");
        int number2 = scan1.nextInt();
        System.out.println("Введите третюю сторону треугольника");
        int number3 = scan1.nextInt();
        scan1.close();

        if (number1 + number2 > number3 & number1 + number3 > number2 & number3 + number2 > number1) {
            System.out.println("Треугольник со сторонами" + " а = " + number1 + " b = " + number2 + " c = " + number3);
        } else {

            System.out.println("Такой треугольник не существует");
        }
    }
}
