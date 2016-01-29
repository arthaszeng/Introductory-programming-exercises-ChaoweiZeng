import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List generate(int n) {
        List<Integer> result = new ArrayList<>();

        if (n < 2) return result;

        while (true){
            if (n < 2) break;
            boolean flag = true;
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    n /= i;
                    if (result.contains(i)) continue;
                    result.add(i);
                    flag = false;
                    break;
                }
            }
            if (flag) break;
        }
        return result;
    }
}
