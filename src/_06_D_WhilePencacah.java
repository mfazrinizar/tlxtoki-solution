public class _06_D_WhilePencacah {
    public static void main(String[] args) {
        try(java.util.Scanner sc = new java.util.Scanner(System.in)) {
            int hasil = 0;
            while (sc.hasNext()) {
                int B = sc.nextInt();
                hasil += B;
            }
            System.out.print(hasil);
        }
    }
}
