public class Escseq {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int multiple = i * 7;

            if (i == 1) {
                System.out.println();
            }

            if (i % 2 == 0) {
                System.out.println("\t" + multiple);
            } else {
                System.out.println(multiple);
            }
        }
    }
}
