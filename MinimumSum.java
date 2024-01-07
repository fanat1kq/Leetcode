import java.util.Arrays;

public class MinimumSum {
    public static void main(String[] args) {
        MinimumSum max=new MinimumSum();
        System.out.println((max.minimumSum(2932)));
    }
    public int minimumSum(int num) {
        int[] dig=new int[4];
        int cur=0;
        while(num > 0)
        {
            dig[cur++] = num % 10;
            num =num/ 10;
        }
        Arrays.sort(dig);
        return (dig[0]*10+dig[3])+(dig[1]*10+dig[2]);
//        char[] ch=(num+"").toCharArray();
//        Arrays.sort(ch);
//        return Integer.parseInt(""+ch[0]+ch[2])+Integer.parseInt(""+ch[1]+ch[3]);;
    }
}
