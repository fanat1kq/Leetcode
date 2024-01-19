import java.util.*;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate().dupl(new int[]{1,2,3,4}));

    }
    public boolean dupl(int[] nums){

//        List list=new ArrayList<>(Arrays.asList(nums));             //нет
//        List list2=new ArrayList<>(Arrays.asList(1,2,3,4,3));        //да
//        HashSet<Integer> result = Arrays.stream(nums)                 //да
//                .boxed()
//                .collect(Collectors.toCollection(HashSet::new));
//        new ArrayList<>(Arrays.asList(nums))
        Set<Integer> set=new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (nums.length==set.size()) return false;
        else return true;
    }
}
