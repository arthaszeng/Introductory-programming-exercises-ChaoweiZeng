public class FizzBuzzGame {
    public void normalNumber(int max) {
        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void fizz(int max) {
        for (int i = 1; i <= max; i++) {
            if (i % 3 == 0) {
                System.out.println("fizz");
            }else {
                System.out.println(i);
            }
        }
    }

}