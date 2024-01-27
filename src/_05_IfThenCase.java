public class _05_IfThenCase {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            int n = input.nextInt();
            int length = String.valueOf(n).length();
            switch (length) {
                case 1:
                    System.out.println("satuan");
                    break;
                case 2:
                    System.out.println("puluhan");
                    break;
                case 3:
                    System.out.println("ratusan");
                    break;
                case 4:
                    System.out.println("ribuan");
                    break;
                case 5:
                    System.out.println("puluhribuan");
                    break;
                default:
                    break;
            }
        }
    }
}