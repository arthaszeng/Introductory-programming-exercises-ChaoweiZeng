public class Main {

    public static void main(String[] args) {
        System.out.println("*");
    }

    public void oneAsterisk() {
        System.out.println("*");
    }

    public void horizontalLine(int number) {
        while ( number-- != 0) {
            System.out.print("*");
        }
        System.out.println();
    }
}
