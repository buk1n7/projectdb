import java.util.Scanner;

public class programm5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int z = in.nextInt();
        int u = in.nextInt();
        int q = in.nextInt();
        boolean cv = x == -z || x == -u || x == -q || z == -u || z == -q || q == - u;
        System.out.print(cv);
    }
}
