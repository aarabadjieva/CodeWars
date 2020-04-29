import java.util.Scanner;

/*============================================================================
Task:
You live in the city of Cartesia where all roads are laid out in a perfect grid.
You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk.
The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you
an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You
always walk only a single block in a direction and you know it takes you one minute to traverse one city block,
so create a function that will return true if the walk the app gives you will take you exactly ten minutes
(you don't want to be early or late!) and will, of course, return you to your starting point.
Return false otherwise.

Note:
You will always receive a valid array containing a random assortment of direction letters
('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).
===========================================================================*/

public class TakeTenMinuteWalk {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] directions = scanner.nextLine().replaceAll("'|,|", "").toCharArray();
        System.out.println(isValid(directions));
    }

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        int east = 0, west = 0, north = 0, south = 0;

        for (char c : walk) {
            switch (c) {
                case 'e':
                    east++;
                    break;
                case 'w':
                    west++;
                    break;
                case 'n':
                    north++;
                    break;
                case 's':
                    south++;
                    break;
            }
        }

        return north == south && west == east;
    }
}
