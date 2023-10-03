import java.util.Locale;
import java.util.Scanner;

public class programm8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.print(x * x + y * y > 1 && y >= x - 1 && x >= 0 && y <= 1  || x * x + y * y < 1 && x >= 0 && y >= 0 && y <= 1|| x * x + y * y < 1 && y >= x - 1 && x >= 0 && y <= 0 && y >= -1 || y < x - 1 && x * x + y * y < 1 && x >= 0 && y < 0 && y >= -1 ? "YES" : "NO");
    }
}
