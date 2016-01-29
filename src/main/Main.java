public class Main {

    public static void main(String[] args) {
        System.out.println("*");
    }

    public void oneAsterisk() {
        System.out.println("*");
    }

    public void horizontalLine(int row) {
        while ( row-- != 0) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void verticalLine(int line) {
        while (line-- != 0){
            System.out.println("*");
        }
    }

    public void triangle(int line) {
        for (int i = 0; i < line; i++){
            for (int j = i; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void isoscelesTriangle(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = line - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * i + 1; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
