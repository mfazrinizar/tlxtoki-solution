
public class _06_F_FaktorBilangan {
    public static void main(String[] args) throws Exception {
        try (java.io.BufferedReader x = new java.io.BufferedReader(new java.io.InputStreamReader(System.in))) {
            int N = Integer.parseInt(x.readLine());
            for (int i = N; i >= 1; i--) {
                if (N % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
