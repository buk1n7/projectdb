import java.util.Scanner;

public class programm6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a*a + b*b == c*c || a*a + c*c == b*b || c*c + b*b == a*a) {
            System.out.print("right");
        }else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.print("impossible");
        }else if(b*b + c*c > a*a && a*a + b*b > c*c && a*a + c*c > b*b) {
            System.out.print("acute");
        }else if(b*b + c*c < a*a || a*a + b*b < c*c || a*a + c*c < b*b) {
            System.out.print("obtuse");
        }
        }
    }
