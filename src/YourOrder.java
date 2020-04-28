import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*==============================================================================
Task:
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples:
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
============================================================================= */
public class YourOrder {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String words = scanner.nextLine();
            System.out.println(order(words));
        }
    }

    public static String order(String words) {
        List<String> allWords = Arrays.stream(words.split(" ")).collect(Collectors.toList());
        String[] ordered = new String[allWords.size()];
        for (String current : allWords) {
            for (int j = 0; j < current.length(); j++) {
                if (Character.isDigit(current.charAt(j))) {
                    int position = Integer.parseInt(String.valueOf(current.charAt(j))) - 1;
                    ordered[position] = current;
                    break;
                }
            }
        }
        return String.join(" ", ordered);
    }
}
