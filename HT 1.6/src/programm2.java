import java.util.Scanner;

public class programm2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if (x > z && z > y) {
            System.out.print(y);
            System.out.print(" ");
            System.out.print(z);
            System.out.print(" ");
            System.out.print(x);
        } else if (x > y && y > z) {
            System.out.print(z);
            System.out.print(" ");
            System.out.print(y);
            System.out.print(" ");
            System.out.print(x);
        } else if (y > x && x > z) {
            System.out.print(z);
            System.out.print(" ");
            System.out.print(x);
            System.out.print(" ");
            System.out.print(y);
        } else if (y > z && z > x) {
            System.out.print(x);
            System.out.print(" ");
            System.out.print(z);
            System.out.print(" ");
            System.out.print(y);
        } else if (z > x && x > y) {
            System.out.print(y);
            System.out.print(" ");
            System.out.print(x);
            System.out.print(" ");
            System.out.print(z);
        } else if (z > y && y > x) {
            System.out.print(x);
            System.out.print(" ");
            System.out.print(y);
            System.out.print(" ");
            System.out.print(z);
        }
    }
}