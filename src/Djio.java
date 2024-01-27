import java.util.*;

public class Djio {
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
Judul: B. Djio dan Kue Pulut

Deskripsi:
Festival kue pulut hadir di kota kediaman Djio! Di festival ini, terdapat N varian kue pulut yang dinomori dari 1 hingga N. Tersedia Ai ​porsi kue pulut untuk setiap varian i.

Djio baru datang ketika festival hampir berakhir. Melihat semua pengunjung lain sudah pulang, Djio ingin menghabiskan semua kue pulut yang ada tanpa khawatir akan diambil oleh pengunjung lain. Setiap detiknya, Djio bisa melakukan salah satu aksi berikut.
 1. Makan seporsi kue pulut varian i. Dengan kata lain, mengubah Ai := Ai−1. Jika Ai ​= 0, maka tidak ada kue pulut varian i untuk Djio makan. Setelah itu, ia tidak ingin makan kue pulut dengan varian yang sama tepat di detik selanjutnya.
 2. Istirahat dan tidak memakan kue pulut di detik ini.
Berapakah waktu minimum agar ia dapat menghabiskan semua kue pulut yang tersedia?

Batasan:
1 ≤ N ≤ 100.000
1 ≤ Ai ≤ 100.000, untuk 1 <= i <= N

Masukan:
N
A1 A2 ... AN

Keluaran:
Keluarkan waktu minimum (dalam satuan detik) yang dibutuhkan Djio untuk menghabiskan semua kue pulut yang tersedia.

Contoh Masukan 1:
2
1 3

Contoh Keluaran 1:
5

Penjeasan Contoh 1:
Djio dapat menghabiskan semua kue pulut dalam 5 detik dengan cara sebagai berikut.
    1. Pada detik 1, Djio makan seporsi kue pulut varian 2, mengubah A2 = 2. 
    2. Pada detik 2, Djio tidak ingin makan kue pulut varian 2. Ia makan seporsi kue pulut varian 1, mengubah  A1 = 0. Kue pulut varian 1 habis di detik ini. 
    3. Pada detik 3, Djio dapat kembali makan seporsi kue pulut varian 2, mengubah A2 = 1. 
    4. Pada detik 4, Djio tidak ingin makan kue pulut varian 2 dan ia memilih untuk istirahat. 
    5. Pada detik 5, Djio dapat kembali makan seporsi kue pulut varian 2, mengubah A2 = 0. Kue pulut varian 2 habis di detik ini.

Contoh Masukan 2
4
3 9 3 3

Contoh Keluaran 2
18

 */