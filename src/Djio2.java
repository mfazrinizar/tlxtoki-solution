import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Djio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i : A) {
            pq.add(i);
        }
        int time = 0;
        int lastEaten = -1;
        Queue<Integer> rest = new LinkedList<>();
        while (!pq.isEmpty() || !rest.isEmpty()) {
            if (!pq.isEmpty()) {
                if (pq.peek() != lastEaten) {
                    lastEaten = pq.peek();
                    pq.poll();
                    if (lastEaten > 1) {
                        rest.add(lastEaten - 1);
                    }
                } else {
                    rest.add(pq.peek());
                    pq.poll();
                }
            }
            if (pq.isEmpty()) {
                while (!rest.isEmpty()) {
                    pq.add(rest.poll());
                }
                lastEaten = -1;
            }
            time++;
        }
        System.out.println(time);
        sc.close();
    }
}
