public class abba {
    public static void main(String[] args) {
        int i = 0;
        int x, y;
        do {
            i++;
            x = i % 5;
            y = i % 7;
            if (x == 0 && y == 0) {
                System.out.println("ABBA");
            } else if (x == 0) {
                System.out.println("A");
            } else if (y == 0) {
                System.out.println("B");
            } else {
                System.out.println(i);
            }
        }
        while (i < 100);
    }
}