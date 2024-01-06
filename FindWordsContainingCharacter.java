import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
        public static void main(String[] args) {
            char s1 = 'a';
            String[] s2={"abc","bcd","aaaa","cbc"};
            List<Integer> a = findWordsContaining(s2, s1);
            System.out.println(a);
        }

    static public List<Integer> findWordsContaining(String[] words, char x) {
            List<Integer> list=new ArrayList<>();
            int index=0;
        for (String str:words) {
            if (str.contains(Character.toString(x))){
                list.add(index);
            } index ++;
        }
            return list;
    }
    }