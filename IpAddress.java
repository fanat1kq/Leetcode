public class IpAddress {
    public static void main(String[] args) {


        String s1 = "1.1.1.1";

        String a = defangIPaddr(s1);
        System.out.println(a);
    }

    static public String defangIPaddr(String s1) {

        return s1.replace(".","[.]");
    }
}