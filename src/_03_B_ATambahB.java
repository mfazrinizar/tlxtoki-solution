// import java.util.Scanner;

// public class _03_B_ATambahB {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         int A = s.nextInt();
//         int B = s.nextInt();

//         System.out.printf("%d", A + B);
//         s.close();
//     }
// }

/**
 * _03_B_ATambahB
 */
// public class _03_B_ATambahB {

//     public static void main(String[] args) {
//         boolean A = true, B = false, C = true;
//         System.out.println((A || B) && C);
//         System.out.println(A || (B && C));
//         System.out.println((A ^ B) && C);
//         System.out.println((A ^ C) && B);
//         System.out.println((A && C) || B);
//     }
// }

public class _03_B_ATambahB {
    public static void main(String[] args) {
        boolean a = true, b = false, c = true, d = true;
        System.out.println(a && !b || c && d);
        System.out.println((a || !b) && c || !d);
        System.out.println(a || b && !c && d);
        System.out.println(a && !d || !c || a && b);
    }
}