public class _06_E_DuaPangkat {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            int N = input.nextInt();
            // int i = 0;
            while (N % 2 != 1) {
                N /= 2;
                // i++;
            }
            // System.out.print((N == 1 && i > 0) ? "ya" : "bukan"); tidak passed test case terakhir
            System.out.print((N == 1) ? "ya" : "bukan");
        }
    }
}
