import java.util.Locale;
import java.util.Scanner;

public class programm5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
                System.out.print(x*x + y*y < 1 && y >= x || x*x + y*y < 1 && y < x && x <= 0 ? "YES": "NO");
    }
}
