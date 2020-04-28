import java.util.Arrays;
import java.util.Scanner;

/*======================================================================
Task:
Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.
====================================================================== */

public class ShortestWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        System.out.println(findShort(words));
    }


    public static int findShort(String words) {
        return Arrays.stream(words.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}
