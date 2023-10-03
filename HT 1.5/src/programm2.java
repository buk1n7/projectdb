import java.util.Locale;
import java.util.Scanner;

public class programm2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        boolean bn = x >= -3 &&  x <= 5 || x >= 9 && x <= 15;
        System.out.print(bn);
    }
}
