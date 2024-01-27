public class _07_A_BreakContinueExit {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            int N = input.nextInt();
            for (int i = 1; i <= N; i++) {
                if (i % 10 == 0)
                    continue;
                if (i == 42) {
                    System.out.println("ERROR");
                    break;
                }
                System.out.println(i);
            }
        }
    }
}