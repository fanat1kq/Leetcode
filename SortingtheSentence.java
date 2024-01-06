import java.util.Arrays;
//в foreach либо string[], либо s.split(" ")
public class SortingtheSentence {
    public static void main(String[] args) {


        String s1 = "is2 sentence4 This1 a3";

        String a = defangIPaddr(s1);
        System.out.println(a);
    }

    static public String defangIPaddr(String s) {


        String []res=new String[s.split(" ").length];
        for(String st:s.split(" ")){
            res[st.charAt(st.length()-1)-'1']=st.substring(0,st.length()-1);
            System.out.println(st.substring(0,st.length()-1));
            System.out.println(st.charAt(st.length()-1));
        }
        return String.join(" ",res);
    }
}