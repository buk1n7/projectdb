import java.util.Scanner;

public class programm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a >= 0 && a < 10) {
            System.out.print("DIGIT");
        }
        else if (a >= 10 && a <= 99) {
            System.out.print("NUM");
        }
        else{
            System.out.print("OTHER");
        }
    }
}