import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class programm2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.print(x > 0 && y > 0 && y < 0.5 && x < 2 * Math.PI && y < Math.sin(x) ? "YES" : "NO");
    }
}
