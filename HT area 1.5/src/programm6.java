import java.util.Locale;
import java.util.Scanner;

public class programm6 {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.print(x*x + y*y < 1 && y > x && y > -x || x*x + y*y < 1 && y < x && y > -x && x >=0 || x*x + y*y < 1 && y < -x && y <x? "YES": "NO");
        }
    }
