import java.util.Locale;
import java.util.Scanner;

public class programm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        boolean bl = x >= 3 && x <= 8;
        System.out.print(bl);
        }
    }
