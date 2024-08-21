public class Escseq {
    public static void main(String[] args) {
        int limit = 5;

        for (int i = 1; i <= limit; i++) {
            int multiple = i * 7;

            if (i % 2 == 0) {
                System.out.println("\t" + multiple);
            } else {
                System.out.println(multiple);
            }
        }
    }
}
