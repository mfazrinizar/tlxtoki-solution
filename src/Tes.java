
// public class Tes {
//     public static String print(String s) {
//         System.out.print(s);
//         return s;
//     }

//     public static void main(String[] args) {
//         int a = -50;
//         do System.out.printf("masuk "); while (a > 0);
//         System.out.printf(" keluar");
//     }

// }

// public class Tes {
//     public static void main(String[] args) {
//         try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
//             int N = scanner.nextInt();
//             int sum = 0;
//             for (int i = 1; i <= N; i++) {
//                 sum += i;
//             }
//             System.out.println(sum);
//         }
//     }
// }

// public class Tes {
//     public static void main(String[] args) {
//         for (int i = 0; i <= 9; i++) {
//             for (int j = 0; j < 11; j++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

// public class Tes {
//     public static void main(String[] args) {
//         for (int i = 0; i <= 9; i++) {
//             System.out.println(String.valueOf(i).repeat(10));
//         }
//     }
// }

// import java.util.Scanner;
// public class Tes {
//     public static void main (String[]args){
//         Scanner input =new Scanner(System.in);
//         System.out.print("enter year: ");
//         int year = input.nextInt();
//         System.out.print("enter month: ");
//         int month = input.nextInt();
//         if (month > 12){
//             System.out.print("invalid");
//         }
//         System.out.print("enter the day of month 1-31: ");
//         int day = input.nextInt();
//         if (day < 1 && day >31) {
//             System.out.println("invalid");
//         }
//         int yearCentury = year % 100;
//         int century = year/100;
//         int h = (int) (day + (Math.pow ((26 * ( month + 1)),10) + yearCentury + ((yearCentury / 4) +(century/4))+ (5*century))) %7;
//             if(h==1){
//                 System.out.println("day of the week is sunday");
//             }
//             if(h==2){
//                 System.out.println("day of the week is monday");
//             }
//             if (h==3){
//                 System.out.println("day of the week is Tuesday");
//             }
//             if (h==4){
//                 System.out.println("day of the week is Wednesday");
//             }
//             if (h==5){
//                 System.out.println("day of the week is Thursday");
//             }
//             if (h==6){
//                 System.out.println("day of the week is Friday");
//             }
//             if (h==0){
//                 System.out.println("day of the week is Saturday");
//             }
//             else {
//                 System.out.println("Invalid");
//             }
//             input.close();
//     }
// }

// public class Tes {
//     public static void main(String[] args) {
//         try (java.util.Scanner input = new java.util.Scanner(System.in)) {
//             System.out.print("Enter year: ");
//             int year = input.nextInt();
//             System.out.print("Enter month: ");
//             int month = input.nextInt();
//             if (month < 3) {
//                 month += 12;
//                 year--;
//             }
//             System.out.print("Enter the day of month 1-31: ");
//             int day = input.nextInt();
//             if (day < 1 || day > 31) {
//                 System.out.println("Invalid day");
//                 return;
//             }
//             int yearCentury = year % 100;
//             int century = year / 100;
//             int h = (day + ((13 * (month + 1)) / 5) + yearCentury + (yearCentury / 4) + (century / 4) + (5 * century)) % 7;
//             switch (h) {
//                 case 0:
//                     System.out.println("Day of the week is Saturday");
//                     break;
//                 case 1:
//                     System.out.println("Day of the week is Sunday");
//                     break;
//                 case 2:
//                     System.out.println("Day of the week is Monday");
//                     break;
//                 case 3:
//                     System.out.println("Day of the week is Tuesday");
//                     break;
//                 case 4:
//                     System.out.println("Day of the week is Wednesday");
//                     break;
//                 case 5:
//                     System.out.println("Day of the week is Thursday");
//                     break;
//                 case 6:
//                     System.out.println("Day of the week is Friday");
//                     break;
//                 default:
//                     System.out.println("Invalid");
//                     break;
//             }
//         }
//     }
// }

/**
 * Tes
 */
// public class Tes {
//     public static void main(String[] args) {
//         System.out.println("Pattern A");
//         for(int i = 1; i <= 6; i++) {
//             for(int k = 1; k <= i; k++) {
//                 System.out.print(k + " ");
//             }
//             System.out.println();
//         }
//         System.out.println("\n");

//         System.out.println("Pattern B");
//         for(int i = 6; i >= 1; i--) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//         System.out.println("\n");

//         System.out.println("Pattern C");
//         for(int i = 1; i <= 6; i++) {
//             for(int j = 1; j <= 6 - i; j++) {
//                 System.out.print("  ");
//             }
//             for(int k = i; k >= 1; k--) {
//                 System.out.print(k + " ");
//             }
//             System.out.println();
//         }
//         System.out.println("\n");

//         System.out.println("Pattern D");
//         for(int i = 6; i >= 1; i--) {
//             for(int j = 1; j <= 6 - i; j++) {
//                 System.out.print("  ");
//             }
//             for(int k = 1; k <= i; k++) {
//                 System.out.print(k + " ");
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * Tes
 */

// public class Tes {
// public static void main(String[] args) {
// int n = 5;
// System.out.println("Hasil: " + add(n));
// }

// public static int add(int n) {
// if (n <= 0) {
// return 0;
// }
// return n + add(n - 1);
// }
// }
// public class Tes {
// public static void main(String[] args) {
// int n = new java.util.Scanner(System.in).nextInt();
// int[] hasil = new int[1];
// add(n, hasil);
// System.out.println("Hasil: " + hasil[0]);
// }

// public static void add(int n, int[] hasil) {
// if (n == 0) {
// return;
// }
// hasil[0] += n;
// if (n > 0) {
// add(n - 1, hasil);
// } else {
// add(n + 1, hasil);
// }
// }
// }

// import java.util.Scanner;

// public class Tes {
// public static void main(String[] args) {
// Scanner x = new Scanner(System.in);
// int n = x.nextInt();
// // if (n<0){
// // n=-1;
// // System.out.println(add(n)-1);
// // } else
// System.out.println(add(n));
// x.close();
// }

// static int add(int n) {
// if (n == 0) {
// return 0;
// }
// if (n < 0)
// return n + add(n + 1);
// else if (n > 0)
// return n + add(n - 1);
// return n;

// }
// }

// public class Tes {
// public static void main(String[] args) {
// System.out.println("Enter the number of lines: ");
// int n = new java.util.Scanner(System.in).nextInt();
// n = (n <= 15 && n >= 1) ? n : 0;

// /*
// * Sample Output:
// * 1
// * 2 1 2
// * 3 2 1 2 3
// * 4 3 2 1 2 3 4
// * 5 4 3 2 1 2 3 4 5
// * 6 5 4 3 2 1 2 3 4 5 6
// * 7 6 5 4 3 2 1 2 3 4 5 6 7
// */

// for (int i = 1; i <= n; i++) {
// for (int j = n; j > i; j--)
// System.out.print(j < 10 ? " " : " ");
// for (int k = i; k > 1; k--)
// System.out.print(k + " ");
// for (int l = 1; l <= i; l++)
// System.out.print(l + " ");
// System.out.println();
// }

// System.out.println("8");
// }
// }
// public class Tes {
// static void PatternF(int n) {
//     for (int i = 1; i <= n; i++) {
//         for (int j = n; j > i; j--) {
//             System.out.print(" ");
//         }
//         for (int j = 1; j <= i; j++) {
//             int p = j;
//             p = (int) Math.pow(2, j - 1);
//             for (int z = 1; z <= 4 - Integer.toString(p).length(); z++) {
//                 System.out.print(" ");

//             }
//             System.out.print(p);
//         }
//         for (int k = i - 1; k >= 1; k--) {
//             int p = k;
//             p = (int) Math.pow(2, k - 1);
//             for (int z = 1; z <= 4 - Integer.toString(p).length(); z++) {
//                 System.out.print(" ");
//             }
//             System.out.print(p);
//         }
//         System.out.println();
//     }
// }

//     static void PatternF(int n){
//         for (int i = 1; i <= n; i++) {
//             for (int j = n; j > i; j--) {
//                 System.out.print("    ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 int p = j;
//                 p = (int)Math.pow(2,j-1);
//                 System.out.print(p < 10 ? "   "+p : (p < 100) ? "  "+p : (p < 1000) ? " "+p : p);
//             }
//             for (int k = i-1; k >= 1; k--) {
//                 int p = k;
//                 p = (int)Math.pow(2,k-1);
//                 System.out.print(p < 10 ? "   "+p : (p < 100) ? "  "+p : (p < 1000) ? " "+p : p);
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int n = new java.util.Scanner(System.in).nextInt();
//         PatternF(n);
//     }
// }

// public class Tes {
// public static void main(String[] args) {
// int startRight = 0, endSpace = 7;
// int row = 1;
// while (row <= 128) {
// int startSpace = 0;
// while (startSpace < endSpace) {
// System.out.print(" ");
// startSpace++;
// }
// int l = 1;
// while (l <= row) {
// System.out.printf("%4d", l);
// l += l;
// }
// int r = startRight;
// while (r > 0) {
// System.out.printf("%4d", r);
// r /= 2;
// }
// System.out.println();
// endSpace--;
// startRight = row;
// row += row;
// }
// }
// }

// public class Tes {
// public static void main(String[] args) {
// int startRight = 0, endSpace = 7;
// for (int row = 1; row <= 128; row += row) {
// for (int startSpace = 0; startSpace < endSpace; startSpace++) {
// System.out.print(" ");
// }
// for (int l = 1; l <= row; l += l) {
// System.out.printf("%4d", (l));
// }
// for (int r = startRight; r > 0; r /= 2) {
// System.out.printf("%4d", (r));
// }
// System.out.println();
// endSpace--;
// startRight = row;
// }
// }
// }

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tes {
    public static void main(String[] args) throws IOException {
        LocalDate tanggalPeminjaman, tanggalPengembalian, tanggalAwal, tanggalAkhir;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Masukkan tanggal peminjaman buku (DD/MM/YYYY): ");
            String tanggalPeminjamanStr = reader.readLine();
            System.out.print("Masukkan tanggal pengembalian buku (DD/MM/YYYY): ");
            String tanggalPengembalianStr = reader.readLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            try {
                tanggalPeminjaman = LocalDate.parse(tanggalPeminjamanStr, formatter);
                tanggalPengembalian = LocalDate.parse(tanggalPengembalianStr, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("format tanggal tidak valid");
                return;
            }

            System.out.print("Masukkan tarif denda harian: ");
            int tarifDendaHarian = Integer.parseInt(reader.readLine());

            if (tarifDendaHarian < 1 || tarifDendaHarian > 1000)
                return;

            tanggalAwal = LocalDate.of(1900, 1, 1);
            tanggalAkhir = LocalDate.of(2099, 12, 31);

            System.out.println(tanggalPeminjaman.isBefore(tanggalAwal));
            if (tanggalPeminjaman.isBefore(tanggalAwal) || tanggalPeminjaman.isAfter(tanggalAkhir) ||
                    tanggalPengembalian.isBefore(tanggalAwal) || tanggalPengembalian.isAfter(tanggalAkhir)) {
                System.out.println("format tanggal tidak valid");
                return;
            }
            
            int selisihHari = Integer.parseInt(String.valueOf(ChronoUnit.DAYS.between(tanggalPeminjaman, tanggalPengembalian)));

            int totalDenda = 0;
            if (selisihHari > 0) {
                totalDenda = (int) (selisihHari) * tarifDendaHarian;
            }
            
            System.out.println("Total denda yang harus dibayar: " + totalDenda);
        }
    }
}