public class _05_FloorCeiling {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            double n = input.nextDouble();
            int f = (n < 0 && n != (int) n) ? (int) n - 1 : (int) n;
            int c = (n > 0 && n != (int) n) ? (int) n + 1 : (int) n;
            // if (n < 0 && n != f) {
            //     f--;
            // } else if (n > 0 && n != f) {
            //     c++;
            // }
            System.out.println(f + " " + c);
        }
    }
}