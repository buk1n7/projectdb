import java.util.Scanner;

public class programm6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int z = in.nextInt();
        int s = in.nextInt();
        boolean ln = x % 2 == 0 && z % 2 == 0 || x % 2 == 0 && s % 2 == 0 || s % 2 == 0 && z % 2 == 0;
        System.out.print(ln);
    }
}
