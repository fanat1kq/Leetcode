import java.util.HashMap;

public class FinalValue {
    public static void main(String[] args) {


        String[] s1 = {"--X","X++","X++"};
        int a=finalValueAfterOperations(s1);
        System.out.println(a);
    }
    static public int finalValueAfterOperations(String[] operations) {
        HashMap<String,Integer> map=new HashMap<>();
        int result=0;
        map.put("--X",-1);
        map.put("X++",1);
        map.put("++X",1);
        map.put("X--",-1);

        for (String operat: operations) {
            result+=map.get(operat);
        }
        return result;
    }
}
