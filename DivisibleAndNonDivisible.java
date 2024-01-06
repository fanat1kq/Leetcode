public class DivisibleAndNonDivisible {
    public static void main(String[] args) {
        DivisibleAndNonDivisible max=new DivisibleAndNonDivisible();
        System.out.println(max.differenceOfSums(10,3));
    }
    public int differenceOfSums(int n, int m) {
        int sum = n*(n+1)/2;
        int anotherSum = 0;
        for(int i = 1; i <= n;i++){
            anotherSum += i % m == 0 ? i : 0;
        }
        return sum - 2*anotherSum;
    }
}