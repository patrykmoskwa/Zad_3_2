public class Main {
    public static void main(String[] args) {
        int wysokosc = 6;

        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < wysokosc - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}