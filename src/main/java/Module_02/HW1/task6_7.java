package Module_02.HW1;

import java.util.Scanner;

public class task6_7 {

    public static void main(String[] args) {

        int[] array = {10, 2, 4, 5, 6, 91, 2};

        int index = searchIndex(array);

        if (index < 0) {
            System.out.println("Данное число не найдено в массиве!");
        } else {
            System.out.println("Index: " + index);
        }

        createArray(3);

    }

    /*Поиск индекса по числу*/
    public static int searchIndex(int[] array) {
        int index = -1;

        System.out.println("Введите число: ");

        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();

        for (int i = 0; i < array.length - 1; i++) {
            if (value == array[i]) {
                index = i;
            }
        }

        return index;
    }

    /*Создание массива по числу*/
    public static void createArray(int value) {

        while (((value % 2) != 0) || (value < 0)) {
            System.out.println("Введите чётное положительное число:");
            Scanner scan = new Scanner(System.in);
            value = scan.nextInt();
        }

        int[] array = new int[value];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = -5 + (int) (Math.random() * 5);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        int summ = 0;

        for (int i = 0; i < (array.length - 1) / 2; i++) {
            summ += Math.abs(array[i]);
        }

        int summ1 = 0;

        for (int i = array.length - 1; i > (array.length - 1) / 2; i--) {
            summ1 += Math.abs(array[i]);
        }

        if (summ > summ1) {
            System.out.println("Первая половина больше второй!");
        } else if (summ < summ1) {
            System.out.println("Вторая половина больше первой!");
        } else {
            System.out.println("Значения равны!");
        }
    }
}


