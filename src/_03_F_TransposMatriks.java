import java.util.Scanner;

public class _03_F_TransposMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = input.nextInt();
            }
        }
        String z = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                z += A[j][i] + " ";
            }
            z += "\n";
        }
        System.out.println(z);
        input.close();
    }
}