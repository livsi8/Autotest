package String;
public class fivetask {


    public static void main(String[] args) {
        String line = "Переверни меня еще раз";
        System.out.println(arrayReverse(line));
        System.out.println(sbReverse(line));
        System.out.println(reverseStringWithRecursion(line));

    }

    public static String arrayReverse(String s) {
        char[] a = s.toCharArray();
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            b[(a.length - 1) - i] = a[i];
        }
        return new String(b);
    }

    public static String sbReverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public static String reverseStringWithRecursion(String inputString) {
        String rightPart;
        String leftPart;

        int length = inputString.length();

        if (length <= 1) {
            return inputString;
        }

        leftPart = inputString.substring(0, length / 2);

        rightPart = inputString.substring(length / 2, length);

        return reverseStringWithRecursion(rightPart) + reverseStringWithRecursion(leftPart);
    }
}
