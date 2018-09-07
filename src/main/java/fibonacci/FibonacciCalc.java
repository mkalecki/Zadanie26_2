package fibonacci;

import org.springframework.stereotype.Component;

@Component
public class FibonacciCalc {


    public int calculate(int limit) {
        int x = 1;
        int y = 2;
        int z = x + y;
        int result = 2;

        while (z < limit) {
            if ((z % 2) == 0) {
                result += z;
            }
            x = y;
            y = z;
            z = x + y;
        }
        return result;
    }

}
