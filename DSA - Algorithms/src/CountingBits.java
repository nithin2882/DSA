import java.util.Arrays;
public class CountingBits {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if ((i & 1) == 0)
                res[i] = res[i / 2];
            else
                res[i] = res[i - 1] + 1;
        }
        //System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new CountingBits().countBits(5));

    }
}
