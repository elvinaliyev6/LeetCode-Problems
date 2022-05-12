import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) list.add(i);
        }
        return list;
    }
    private boolean isSelfDividing(int n) {
        int num = n;
        while (n > 0) {
            int modulo = n % 10;
            if (modulo == 0 || num % modulo != 0) return false;
            n /= 10;
        }
        return true;
    }
}
