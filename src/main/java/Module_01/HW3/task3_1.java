package Module_01.HW3;
import java.util.Scanner;
class task3_1 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите два числа");
        System.out.println("Число a");
        int number1 = scan1.nextInt();

        System.out.println("Число b");
        int number2 = scan1.nextInt();

        scan1.close();
        if (number1 % 2 != 0){
            System.out.println("Число а нечётное = " + number1);
        }
        else{
            System.out.println("Число а чётное = " + number1);
        }
        if (number2 % 2 != 0){
            System.out.println("Число b нечётное = " + number2);
        }
        else {
            System.out.println("Число b чётное = " + number2);
        }

    }
}