import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List generate(int number) {
        List<Integer> result = new ArrayList<>();

        if (number < 2) return result;

        for (int index = 2; index <= number && index != 1; index++) {
            if (number % index == 0) {
                number /= index;
                result.add(index);
                index--;
            }
        }
        return result;
    }
}

