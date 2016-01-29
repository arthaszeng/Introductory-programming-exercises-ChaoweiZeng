public class FizzBuzzGame {
    public void normalNumber(int max) {
        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void fizz(int max) {
        for (int i = 1; i <= max; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }
    }

    public void buzz(int max) {
        for (int i = 1; i <= max; i++) {
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }

    public void fizzBuzz(int max) {
        for (int i = 1; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
