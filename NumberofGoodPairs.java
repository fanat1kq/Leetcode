import java.util.Arrays;

public class NumberofGoodPairs {
    public static void main(String[] args) {


        int[] s1 = {1,2,3,1,1,3};

        int[] a = numIdenticalPairs(s1);
        System.out.println(a);
    }

    static public int[] numIdenticalPairs(int[] nums) {
        int[] ans=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[nums[i]];
            System.out.println(Arrays.toString(ans));
        }
        return ans;
    }}