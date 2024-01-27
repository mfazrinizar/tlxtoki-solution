public class _05_IfThenElse {
    public static void main(String[] args) throws java.io.IOException {
        try (java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in))) {
            int N = Integer.parseInt(input.readLine());
            if (N > 0)
                System.out.println("positif");
            else if (N < 0)
                System.out.println("negatif");
            else
                System.out.println("nol");
        }
    }
}