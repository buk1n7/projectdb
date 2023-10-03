import java.util.Scanner;

public class programm2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int d = in.nextInt();
        if (m == 1 && d <= 31) {
            System.out.print(365 - d);
        } else if (m == 2 && d <= 28 ) {
            System.out.print(365 - 31 - d);
        } else if (m == 3 && d <= 31) {
            System.out.print(365 - 59 - d);
        } else if (m == 4 && d <= 30) {
            System.out.print(365 - 90 - d);
        } else if (m == 5 && d <= 31) {
            System.out.print(365 - 120 - d);
        } else if (m == 6 && d <= 30) {
            System.out.print(365 - 151 - d);
        } else if (m == 7 && d <= 31) {
            System.out.print(365 - 181 - d);
        } else if (m == 8 && d <= 31) {
            System.out.print(365 - 212 - d);
        } else if (m == 9 && d <= 30) {
            System.out.print(365 - 243 - d);
        } else if (m == 10 && d <= 31) {
            System.out.print(365 - 273 - d);
        } else if (m == 11 && d <= 30) {
            System.out.print(365 - 304 - d);
        } else if (m == 12 && d <= 31) {
            System.out.print(365 - 334 - d);
        } else if (m > 12 || d > 31) {
            System.out.print(-1);
        }  else {
              System.out.print(-1);
            }

    }
}