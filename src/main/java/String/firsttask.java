package String;
import java.util.Scanner;

public class firsttask {
    public static void main(String[] args)
    {
        System.out.print("Введите строку с любым наполнением: ");
        Scanner count = new Scanner(System.in);
        String imput = count.next();
        countCharacters("" + imput, 'a', 'b' ); // interestedCharacters = искомые символы
    }

    public static void countCharacters(String inputString, char... interestedCharacters)
    {
        final int[] occurences = new int[2000];
        final char[] array = inputString.toCharArray();
        for (final char c : array) {
            occurences[c] = occurences[c] + 1;
        }
        for (int i = 0; i < interestedCharacters.length; i++) {
            System.out.println("Найдено '" + occurences[interestedCharacters[i]] + "' повторений для символа '" + interestedCharacters[i] + "'");
        }
        System.out.println();
    }
}