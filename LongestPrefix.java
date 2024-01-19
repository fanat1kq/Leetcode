import java.util.Arrays;
import java.util.HashSet;

public class LongestPrefix {
    public static void main(String[] args) {
System.out.println(new LongestPrefix().dupl(new String[]{"asd","asd","az"}));
}
    public String dupl(String[] in){
        String pre = in[0];//c 1го слова

        if(pre.isEmpty()){
            return "";
        }

        for(int i = 0 ;i < in.length; i++){
            while(in[i].indexOf(pre) != 0){//показывает индекс буквы, индекс пустой строки-0(когда закон слова)
                System.out.println("pre "+pre);
                pre = pre.substring(0,pre.length()-1);
            }
        }
        return pre;

}}

