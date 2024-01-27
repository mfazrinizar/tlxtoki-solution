public class _07_C_PolaIII {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            int N = input.nextInt();
            int num = 0;
            String l = "";
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= i; j++) {
                    l += num;
                    num = (num + 1) % 10;
                }
                l += "\n";
            }
            System.out.print(l);
        }
    }
}