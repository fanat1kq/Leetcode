
public class findMinimumOperation {
    public static void main(Stringq[] args) {


        String s1 = "abc";
        String s2 = "abb";
        String s3 = "ab";
        int a=findMinimumOperations(s1,s2,s3);
        System.out.println(a);
    }
    static public int findMinimumOperations(String s1, String s2, String s3) {
        int x=0;
        int y=0;
        int z=0;
        if (s1.charAt(0)!=s2.charAt(0) ||s2.charAt(0)!=s3.charAt(0)||s3.charAt(0)!=s1.charAt(0)){
            return -1;
        }
        while (x<s1.length() && y<s2.length() && z<s3.length()){
            if (s1.charAt(x)!=s2.charAt(x) ||s2.charAt(x)!=s3.charAt(x)||s3.charAt(x)!=s1.charAt(x)){
               break;
            }

            x++;y++;z++;
        }
            return s1.length()+s2.length()+s3.length()-x-y-z;
    }
}
