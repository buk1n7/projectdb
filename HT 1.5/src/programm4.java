import java.util.Scanner;

public class programm4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        boolean c = x >= 100 && x <= 999 && x % 5 == 0;
        System.out.print(c);
    }

}
