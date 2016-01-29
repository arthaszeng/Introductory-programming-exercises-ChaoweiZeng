public class DrawAsterisk {

    public void oneAsterisk() {
        System.out.println("*");
    }

    public void horizontalLine(int size) {
        drawAsterisk(size);
    }

    public void verticalLine(int line) {
        while (line-- != 0){
            drawAsterisk(1);
        }
    }

    public void normalTriangle(int line) {
        for (int i = 0; i < line; i++){
            drawAsterisk(i + 1);
        }
    }

    public void isoscelesTriangle(int line) {
        for (int i = 0; i < line; i++) {
            drawSpace(line - i - 1);
            drawAsterisk(2 * i + 1);
        }
    }

    public void diamond(int midleLine) {
        for (int i = 0; i < midleLine; i++) {
            drawSpace(midleLine - i - 1);
            drawAsterisk(2 * i + 1);
        }

        int secondHight = midleLine - 1;

        for (int i = secondHight - 1; i >= 0; i--) {
            drawSpace(midleLine - i - 1);
            drawAsterisk(2 * i + 1);
        }
    }

    public void diamondWithName(int midleLine) {
        int secondMidleLine = midleLine - 1;
        for (int i = 0; i < secondMidleLine; i++) {
            for (int j = midleLine - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * i + 1; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }

        int secondHight = midleLine - 1;

        System.out.println("Sli");

        for (int i = secondHight - 1; i >= 0; i--) {
            for (int j = midleLine - i - 1; j > 0; j--){
                System.out.print(" ");
            }
            for (int k = 2 * i + 1; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void drawOneLine(int spaceNumber, int asteriskNumber) {
        DrawAsterisk.drawSpace(spaceNumber);
        DrawAsterisk.drawAsterisk(asteriskNumber);
    }

    private static void drawAsterisk(int asteriskNumber) {
        while (asteriskNumber-- > 0) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void drawSpace(int spaceNumber) {
        while (spaceNumber-- > 0) {
            System.out.print(" ");
        }
    }
}
