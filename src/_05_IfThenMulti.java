/**
 * _05_IfThenMulti
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _05_IfThenMulti {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());
            if(N > 0 && N % 2 != 1) System.out.print(N); 
        }
    }
}