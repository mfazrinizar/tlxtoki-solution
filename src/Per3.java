// public class Per3 {
//     public static void main(String[] args) {

//         java.util.Scanner n = new java.util.Scanner(System.in);
//         int nilai = n.nextInt(); // Ganti dengan nilai yang sesuai

//         if (nilai > 100 || nilai < 0) {
//             System.out.println("Nilai tidak valid. Nilai harus berada dalam rentang 0-100.");
//         } else {
//             System.out.println((nilai > 89) ? "A" : (nilai > 78) ? "B" : (nilai > 65) ? "C" : (nilai > 37) ? "D" : "E");
//         }
//     }
// }

// public class Per3 {
//     public static void main(String[] args) {

//         java.util.Scanner n = new java.util.Scanner(System.in);
//         String warna = n.nextLine().toLowerCase(); // Ganti dengan warna yang sesuai
//         n.close();
//         switch (warna) {
//             case "merah":
//                 System.out.println("Berhenti!");
//                 break;
//             case "kuning":
//                 System.out.println("Hati-hati!");
//                 break;
//             case "hijau":
//                 System.out.println("Silakan jalan!");
//                 break;
//             default:
//                 System.out.println("Salah");
//                 break;
//         }
//     }
// }

/**
 * Per3
 */
// public class Per3 {

//     public static void main(String[] args) {
//         System.out.println("Hello World|".repeat(10));
//         System.out.println("Hello World".repeat(10));
//     }

// }

/**
 * Per3
 */
public class Per3 {

    static void deret() {

        int i;
        // 2 4 6 8 ... 16
        i = 2;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 16);
        System.out.println("\n");

        // 21 18 9 6 3 0
        i = 21;
        boolean kurangTiga = true;
        do {
            System.out.print(i + " ");
            i = (kurangTiga) ? i - 3 : i / 2;
            kurangTiga = !kurangTiga;
        } while (i >= 0);
        System.out.println("\n");

        // 4 8 12 16 20 24 28
        i = 4;
        do {
            System.out.print(i + " ");
            i += 4;
        } while (i <= 28);
        System.out.println("\n");

        // 15 13 11 9 7 5
        i = 15;
        do {
            System.out.print(i + " ");
            i -= 2;
        } while (i >= 5);
        System.out.println("\n");
    }

    static void piramida() {
        // int baris = 4;

        // for (int i = 1; i <= baris; i++) {
        //
        // for (int j = baris; j > i; j--) {
        // System.out.print(" ");
        // }

        //
        // for (int k = 1; k <= (2 * i - 1); k++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("Input: ");
            int baris = scanner.nextInt();

            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < baris - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Pola Deret:");
        deret();

        System.out.println("Pola Piramida:");
        piramida();

    }
}