public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());
    }

    public static int multiples() {

        int count = 0;
        for (int i = 1; i < 1000; i++) {
            boolean dBy3 = i % 3 == 0;
            boolean dBy5 = i % 5 == 0;

            if (dBy3 || dBy5) {
                count++;
            }
        }

        return count;
    }
}
