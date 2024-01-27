// import java.util.Arrays;
// import java.util.Scanner;

// public class _01_DjioDanTumpukanPiring {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = input.nextInt();
//         }
//         Arrays.sort(a);
//         int tumpukan = 1;
//         for (int i = 1; i < n; i++) {
//             if (a[i] < a[i - 1]) {
//                 tumpukan++;
//             }
//         }
//         System.out.println(tumpukan);
//         input.close();
//     }
// }

// import java.util.Stack;

// public class _01_DjioDanTumpukanPiring {
//     public static void main(String[] args) {
//         int N = 7;
//         int[] A = {22, 13, 22, 14, 18, 20, 25};
//         System.out.println(minStack(N, A));  // Output: 5
//     }

//     public static int minStack(int N, int[] A) {
//         Stack<Integer> stack = new Stack<>();
//         for (int i = 0; i < N; i++) {
//             while (!stack.isEmpty() && stack.peek() <= A[i]) {
//                 stack.pop();
//             }
//             stack.push(A[i]);
//         }
//         return stack.size();
//     }
// }

// import java.util.*;

// public class _01_DjioDanTumpukanPiring {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int N = scanner.nextInt();

//         int[] piring = new int[N];
//         for (int i = 0; i < N; i++) {
//             piring[i] = scanner.nextInt();
//         }

//         scanner.close();

//         int result = minimumStacks(piring);
//         System.out.println(result);
//     }

//     public static int minimumStacks(int[] piring) {
//         Arrays.sort(piring);
//         PriorityQueue<Integer> tumpukan = new PriorityQueue<>(Collections.reverseOrder());
//         for (int i : piring) {
//             Integer top = tumpukan.peek();
//             if (top == null || top < i) {
//                 tumpukan.add(i);
//             } else {
//                 tumpukan.poll();
//                 tumpukan.add(i);
//             }
//         }
//         return tumpukan.size();
//     }
// }

// import java.util.*;

// public class _01_DjioDanTumpukanPiring {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int N = scanner.nextInt();

//         int[] piring = new int[N];
//         for (int i = 0; i < N; i++) {
//             piring[i] = scanner.nextInt();
//         }

//         scanner.close();

//         int result = minimumStacks(piring, N);
//         System.out.println(result);
//     }

//     public static int minimumStacks(int[] piring, int N) {
//         Arrays.sort(piring);
//         int tumpukan = 1;
//         int current_diameter = piring[N - 1];

//         for (int i = 1; i < piring.length; i++) {
//             if (piring[i] > current_diameter) {
//                 tumpukan++;
//                 current_diameter = piring[i];
//             }
//         }
//         return tumpukan;
//     }
// }

import java.util.*;

public class _01_DjioDanTumpukanPiring {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            System.out.println(minimumStacks(A));
        }

    }

    public static int minimumStacks(int[] A) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : A) {
            queue.add(i);
        }
        int maxStacks = 0;
        while (!queue.isEmpty()) {
            maxStacks = Math.max(maxStacks, queue.poll());
            if (!queue.isEmpty()) {
                queue.add(queue.poll() - 1);
            }
        }
        return maxStacks;
    }
}

/*
 * 
 * Judul Masalah: A. Djio dan Tumpukan Piring
 * 
 * Deskripsi:
 * Di dapurnya, Djio memiliki berbagai piring dengan N ukuran yang berbeda. Ia
 * memiliki Ai ​ buah piring yang berdiameter i untuk setiap i dari 1 hingga N.
 * Untuk meminimalkan tempat penyimpanan, Djio ingin menumpuk semua piring yang
 * ia miliki. Piring dengan diameter i hanya dapat ditumpuk di atas piring
 * berdiameter j apabila i < j. Djio penasaran, berapa banyakkah tumpukan
 * minimum yang dapat ia buat?
 * 
 * Batasan:
 * 1 <= N <= 100.000
 * 1 <= Ai <= 10^9, untuk 1 <= i <= N
 * 
 * Masukan:
 * N
 * A1 A2 ... AN
 * 
 * Keluaran:
 * Keluarkanlah banyak tumpukan minimum yang dapat menampung semua piring yang
 * dimiliki Djio.
 * 
 * Contoh Masukan 1:
 * 5
 * 1 2 1 2 1
 * 
 * Contoh Keluaran 1:
 * 2
 * 
 * Penjelasan Contoh 1:
 * Terdapat 2 tumpukan yang bisa dibuat.
 * 1. Tumpukan 1 menampung piring berdiameter 5, 4, 3, 2, dan 1 secara berurutan
 * dari paling bawah.
 * 2. Tumpukan 2 menampung piring berdiameter 4 dan 2 secara berurutan dari
 * paling bawah.
 * 
 * Contoh Masukan 2:
 * 5
 * 1 1 1 1 1
 * 
 * Contoh Keluaran 2:
 * 1
 * 
 * Contoh Masukan 3:
 * 7
 * 22 13 22 14 18 20 25
 * 
 * Contoh Keluaran 3:
 * 25
 * 
 * 
 */
