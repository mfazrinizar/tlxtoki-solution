import java.util.Scanner;

public class _03_E_LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int T = input.nextInt();
        double luas = 0.5 * A * T;
        System.out.printf("%.2f", luas);
        input.close();
    }
}