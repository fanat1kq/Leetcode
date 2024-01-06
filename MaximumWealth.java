import java.util.Arrays;

public class MaximumWealth {
    public static void main(String[] args) {
        MaximumWealth max=new MaximumWealth();
        System.out.println(max.maximumWealth(new int[][] {{1,5},{7,3},{3,5}}));
    }
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for (int[] i:accounts) {
            if (Arrays.stream(i).sum()>max){
            max=Arrays.stream(i).sum();
        } else continue;
        }
        return max;

}
}
