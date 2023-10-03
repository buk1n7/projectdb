import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;
public class programm3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.print((y <= 2 - x * x && y >= x) || (y <= 2 - x*x && y < x && x >= 0 && y >= 0) ? "YES" : "NO");
    }
}