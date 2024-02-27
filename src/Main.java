public class Main {
    public static void main(String[] args) {
        int ROW = 4;
        int COL = 4;

        for (int r = 0; r <= ROW; r++) {
            for (int c = 0; c <= COL; c++) {
                System.out.printf("*", r * c);
            }
                System.out.println("");

            }
        }
    }
