// public class _06_C_While {
//     public static void main(String[] args) {
//         try(java.util.Scanner sc = new java.util.Scanner(System.in)) {
//             while(sc.hasNext()) {
//                 String N = sc.nextLine();
//                 System.out.printf("%s\n", N);
//             }
//         }
//     }
// }

public class _06_C_While {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            int w = 100;
            int c = 100;
            int wc = 0;
            while (input.hasNext() && wc < w) {
                String N = input.nextLine();
                if (N.length() > c) {
                } else {
                    System.out.println(N);
                    wc++;
                }
                if (wc >= w) break;
            }
        }
    }
}
