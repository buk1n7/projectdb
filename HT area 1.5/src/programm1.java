import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class programm1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.print(x*x + y*y > 4 && x < 2 && y < x && y > 0 ? "YES" : "NO");
    }
}