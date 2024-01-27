public class _06_H_PolaI {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            int N = input.nextInt();
            int K = input.nextInt();

            for (int j = 1; j <= N; j++) {
                if (j % K == 0) {
                    System.out.printf("* ");
                } else {
                    System.out.printf("%d ", j);
                }
            }
        }
    }
}