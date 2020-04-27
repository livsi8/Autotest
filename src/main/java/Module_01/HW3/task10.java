package Module_01.HW3;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        long number = in.nextInt();

        if (number % 2 == 0){
            System.out.println("Число " + number + " чётное");
        }
        else {
            System.out.println("Число " + number + " не чётное");
        }




    }
}
