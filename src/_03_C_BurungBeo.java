

/**
 * 03_C_BurungBeo
 */

import java.util.Scanner;
public class _03_C_BurungBeo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();
        kalimat = kalimat.substring(0, Math.min(kalimat.length(), 100));
        System.out.println(kalimat);
        input.close();
    }
}