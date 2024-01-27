/**
 * _06_B_For
 */
public class _06_B_For {
    public static void main(String[] args) {
        try(java.util.Scanner sc = new java.util.Scanner(System.in)) {
            int N = sc.nextInt();
            int hasil = 0;
            for (int i = 0; i < N; i++) {
                int B = sc.nextInt();
                hasil += B;
            }
            System.out.printf("%d\n", hasil);
        }
    }
}