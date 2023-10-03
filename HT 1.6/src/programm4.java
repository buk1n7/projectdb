import java.util.Scanner;
import java.lang.Math;
public class programm4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double x = -b / a;
        if (a <= 0 && b <= 0){
            System.out.print("no such x");
        } else if (a >= 0 && b > 0) {
            System.out.print("any x");
        } else if(a > 0 && b < 0) {
            System.out.print("x<" + Math.round(b /a*10.0)/10.0 + " " + "or x>" + Math.round(-b/a*10.0)/10.0);
        } else if(a < 0 && b > 0){
            System.out.print(Math.round(b/a*10.0)/10.0+"<x<"+Math.round(-b/a*10.0)/10.0);
        }
    }
}