import java.util.Arrays;

public class NumberOfEmployees {
    public static void main(String[] args) {
        NumberOfEmployees max=new NumberOfEmployees();
        System.out.println(max.numberOfEmployeesWhoMetTarget(new int[] {5,1,4,2,2},3));
    }
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int max=0;
        for (int i:hours) {
            if (i>=target){
               max++;
            } else continue;
        }
        return max;

    }
}
