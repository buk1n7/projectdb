import java.util.Scanner;

public class programm4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a > b && a > c || a == b && b > c) {
            System.out.print(a);
        } else if (b > a && b > c || c == b && b > a) {
            System.out.print(b);
        } else if (c > b && c > a || a == c && c > b || a == c && a == b) {
            System.out.print(c);
        }
    }
}

