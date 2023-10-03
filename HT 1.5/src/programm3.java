import java.util.Locale;
import java.util.Scanner;

public class programm3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        boolean bl = (x < -2 || x > 3) && (x < 6 || x > 9);
        System.out.print(bl);
    }

}
