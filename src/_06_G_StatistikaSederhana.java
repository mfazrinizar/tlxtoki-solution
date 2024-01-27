public class _06_G_StatistikaSederhana {
    public static void main(String[] args) {
        try (java.util.Scanner x = new java.util.Scanner(System.in)) {
            int N = x.nextInt();
            int[] Ni = new int[N];
            int max = Integer.MAX_VALUE;
            int min = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                Ni[i] = x.nextInt();
                max = (Ni[i] > max) ? Ni[i] : (i == 0) ? Ni[i] : max;
                min = (Ni[i] < min) ? Ni[i] : (i == 0) ? Ni[i] : min;
            }
            System.out.printf("%d %d", max, min);
        }
    }
}
