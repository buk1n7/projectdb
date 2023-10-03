import java.util.Scanner;

public class programm3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a % 10 == 1 && a % 100 != 11) {
            System.out.print(a);
            System.out.print(" ");
            System.out.print("TORT");
        } else if (a % 10 >= 2 && a % 10 <= 4 && (a % 100 < 11 || a % 100 > 14)) {
            System.out.print(a);
            System.out.print(" ");
            System.out.print("TORTA");
        } else if (a >= 5 && a <= 20){
            System.out.print(a);
            System.out.print(" ");
            System.out.print("TORTOV");
        } else if (a % 10 >= 5 || a % 10 == 0 || a % 100 >= 11 || a % 100 <= 19){
            System.out.print(a);
            System.out.print(" ");
            System.out.print("TORTOV");
        }
    }
}
