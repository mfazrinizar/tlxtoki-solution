public class _05_JarakManhattan {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();
            // int jarak = (((x1 - x2) < 0) ? -(x1 - x2) : (x1 - x2)) + (((y1 - y2) < 0) ? -(y1 - y2) : (y1 - y2)); 
            // int jarak = Math.abs(x1 - x2) + Math.abs(y1 - y2);
            System.out.println((((x1 - x2) < 0) ? -(x1 - x2) : (x1 - x2)) + (((y1 - y2) < 0) ? -(y1 - y2) : (y1 - y2)));
        }
    }
}