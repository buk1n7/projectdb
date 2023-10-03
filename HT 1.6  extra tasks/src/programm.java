import java.util.Scanner;

public class programm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x % 2 == 1 && x <= 7 || x % 2 == 0 && x >= 8) {
            System.out.print(31);
        } else if (x == 2) {
            System.out.print(28);
        } else if (x < 1 || x > 12) {
            System.out.print(0);
        } else {
            System.out.print(30);
        }
    }
}