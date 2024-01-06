import java.util.Arrays;

public class ShuffletheArray {
    public static void main(String[] args) {


        int[] s1 = {2,5,1,3,4,7};
        int n=3;


        System.out.println(shuffle(s1,n));

    }

    static public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
            System.out.println(Arrays.toString(result));
        }
        return result;
    }
}