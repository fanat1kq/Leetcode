import java.util.Arrays;

public class BuildArrayfromPermutation {
        public static void main(String[] args) {


            int[] s1 = {0,2,1,5,3,4};

            int[] a = buildArray(s1);
            System.out.println(a);
        }

    static public int[] buildArray(int[] nums) {
            int[] ans=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[nums[i]];
            System.out.println(Arrays.toString(ans));
        }
            return ans;
    }}