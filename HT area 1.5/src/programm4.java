import java.util.Locale;
import java.util.Scanner;

public class programm4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.print(y >= x && y <= -x && y >= x * x - 2 || y < x && y > x*x -2 && y < -x|| y <= x && y >= -x && y >= x*x -2? "YES" : "NO");
    }
}

