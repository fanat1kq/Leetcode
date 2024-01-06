//StringBuilder append, insert, setChartAt, reverse, delete, deleteChartAt
//String[] - через stream
//StringBuilder - перевеодим toString()


public class CapitalizeTitle {

        public static void main(String[] args) {
            String title = "First leTTeR of EACH Word";
            String a=capitalizeTitle(title);
            System.out.println(a);
        }
    static public String capitalizeTitle(String title) {
        //trim - убирает пробелмы в начале и в конце
        //substring - забирает отрезок строки в диапозоне (ф, ф)
        //сначала убираем
            title=title.toLowerCase();
            StringBuilder result = new StringBuilder();

            String[] strArr = title.split(" ");

            for (String currentStr : strArr) {
                if (currentStr.length()>2){ //проходит по массиву strArr, где i - сurrentStr
                    String firstChar = currentStr.substring(0,1).toUpperCase();
                    String remain = currentStr.substring(1,currentStr.length());
                    currentStr=firstChar+remain;
                }
                else {currentStr.toLowerCase();}
                result.append(currentStr).append(" ");
            }return result.toString().trim();
        }

    }
