package Module_01.Lesson_04;

import java.util.Scanner;
class task1 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите 3 начания:");
        int number1 = scan1.nextInt();
        int number2 = scan1.nextInt();
        int number3 = scan1.nextInt();
        scan1.close();
        if (number1 > number2 & number1 > number3){
            System.out.println(number1);}
        else if (number2 > number3)
            System.out.println(number2);

        else System.out.println(number3);
    }
}