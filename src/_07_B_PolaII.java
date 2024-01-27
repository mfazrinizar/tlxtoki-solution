// public class _07_B_PolaII {
//     public static void main(String[] args) {
//         try (java.util.Scanner input = new java.util.Scanner(System.in)) {
//             int N = input.nextInt();
//             for (int i = 1; i <= N; i++) {
//                 for (int j = 1; j <= N - i; j++) {
//                     System.out.print(" ");
//                 }
//                 for (int k = 1; k <= i; k++) {
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }

public class _07_B_PolaII {
    public static void main(String[] args) {
        try(java.util.Scanner sc = new java.util.Scanner(System.in)) {
            int N = sc.nextInt();
            String l = "";
            for(int i = 1; i <= N; i++) {
                for(int j = 1; j <= N - i; j++) {
                    l += " ";
                }
                for(int k = 1; k <= i; k++) {
                    l += "*";
                }
                    l += "\n";
            }
            System.out.print(l);
        }
    }
}

/*
 * Input: 5
 * Output:
 *     *
 *    **
 *   ***
 *  ****
 * *****
 */