import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {


        int[] s1 = {1,2,1};

        int[] a = getConcatenation(s1);
        System.out.println(a);
    }

    static public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for(int i = 0; i < nums.length; i++){
            ans[i]  = nums[i];
            ans[i + nums.length] = nums[i];
//            ans[i] = ans[i + nums.length] = nums[i] // можно сократить
            System.out.println(Arrays.toString(ans));
        }

        return ans;
    }
}