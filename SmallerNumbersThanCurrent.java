import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        SmallerNumbersThanCurrent max=new SmallerNumbersThanCurrent();
        System.out.println(Arrays.toString(max.smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] sum=new int[nums.length];
        int count=0;
        for(int i = 0; i <= nums.length-1   ;i++){
            for(int j = 0; j <= nums.length-1;j++){
                if (nums[i]>nums[j]) {
                    count++;
                }

            }
            sum[i]=count;
            count=0;
        }
        return sum;
    }
}