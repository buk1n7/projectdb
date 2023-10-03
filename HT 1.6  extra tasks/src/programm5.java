import java.util.Scanner;

public class programm5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a < b && b < c){
            System.out.print(a + " " + b + " " + c);
        }else if(a == b && b < c){
            System.out.print(a + " " + b + " " + c);
        }else if (a == c & c < b){
            System.out.print(a + " " + c + " " + b);
        }else if (c == b & c < a){
            System.out.print(c + " " + b + " " + a);
        }else if (c == b && a < c){
            System.out.print(a + " " + b + " " + c);
        }else if (a == c && a > b){
            System.out.print(b + " " + a + " " + c);
        }else if (a == b && b > c){
            System.out.print(c + " " + b + " " + a);
        }else if (c == b && b == a){
            System.out.print(a + "" + b + " " + c);
        }else if (a < c && c < b){
            System.out.print(a + " " + c + " " + b);
        }else if(c < b && b < a){
            System.out.print(c + " " + b + " " + a);
        }else if(c < a && a < b){
            System.out.print(c + " " + a + " " + b);
        } else if (b < a && a < c){
            System.out.print(b + " " + a + " " + c);
        } else if (b < c && c < a){
            System.out.print(b + " " + c + " " + a);
        }
    }
}
