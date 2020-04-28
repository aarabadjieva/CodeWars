import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*=================================================================
Task:
Write a function to convert a name into initials.
This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them.
===================================================================*/

public class AbbreviateATwoWordName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String na = scanner.nextLine();
        System.out.println(abbrevName(na));
    }

    public static String abbrevName(String name) {
        String[] input = name.split(" ");
        return Arrays.stream(input).map(i->i.substring(0,1).toUpperCase()).collect(Collectors.joining("."));
    }
}

