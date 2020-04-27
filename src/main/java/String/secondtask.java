package String;
import java.util.Scanner;

public class secondtask {
    public static void main(String[] args) {
        System.out.println("Введите любое предложение: ");
        Scanner revers = new Scanner(System.in);
        String line = revers.nextLine();
        System.out.println(Reverse(line));
    }
    public static String Reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}