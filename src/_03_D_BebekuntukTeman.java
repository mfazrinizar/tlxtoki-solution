import java.util.Scanner;

public class _03_D_BebekuntukTeman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int A = N / M;
        int B = N % M;
        System.out.println("masing-masing " + A);
        System.out.println("bersisa " + B);
        input.close();
    }
}
