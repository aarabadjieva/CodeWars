import java.util.Scanner;

public class ToSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(smallest(n)[0]);
        System.out.println(smallest(n)[1]);
        System.out.println(smallest(n)[2]);
    }

    public static long[] smallest(long n) {
        String num = "" + n;
        String smallest = num;
        long takenIndex = 0;
        long putIndex = 0;

        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < num.length(); j++) {
                if (i == j) {
                    continue;
                }
                String result = num.substring(0, i) + num.substring(i+1);
                result = result.substring(0, j) + num.charAt(i) + result.substring(j);

                if (smallest.compareTo(result) > 0) {
                    smallest = result;
                    takenIndex = i;
                    putIndex = j;
                }
            }
        }

        return new long[]{Long.parseLong(smallest), takenIndex, putIndex};
    }

}
