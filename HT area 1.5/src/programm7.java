import java.util.Locale;
import java.util.Scanner;

public class programm7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.print(y >= 2*x*x && y > 1 - x && x <= 0 || y > 2*x*x && y > 1 - x && x > 0 && x <= 1|| y < 2*x*x && y > 1 - x && x <= 1 && x > 0? "YES":"NO");
    }
}
