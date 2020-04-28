import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*===============================================================================================
Task:
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 The first word within the output should be capitalized only if the original word was capitalized
  (known as Upper Camel Case, also often referred to as Pascal case).
===============================================================================================*/


public class ToCamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(toCamelCase(input));
    }

    public static String toCamelCase(String s){
        Matcher matcher = Pattern.compile("[-_](\\w)").matcher(s);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()){
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        return matcher.appendTail(sb).toString();
    }
}
