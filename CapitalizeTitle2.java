public class CapitalizeTitle2 {
        public static void main(String[] args) {
            String title = "capiTalIze tHe titLe";
            String a=capitalizeTitle(title);
            System.out.println(a);
        }
        static public String capitalizeTitle(String title) {
            title=title.toLowerCase();
            String result="";
            String[] strArr = title.split(" ");

            for (String currentStr : strArr) {
                if (currentStr.length()>2){
                    currentStr=currentStr.replaceFirst(currentStr.substring(0,1),currentStr.toUpperCase().substring(0,1));}
                else {currentStr.toLowerCase(); }
                result+=" "+currentStr;
        } return result.trim();
    } }
