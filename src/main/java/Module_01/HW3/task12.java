package Module_01.HW3;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {

        int number;
        int factorial = 1;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        number = in.nextInt();
        for (int i = 1; i <= number ; i++) {

            factorial = factorial * i;
        }

        System.out.println(number + "! = " + factorial);


    }


}
