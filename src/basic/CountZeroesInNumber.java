package basic;

public class CountZeroesInNumber {
    public static int countzeroes(int n,int count){
        if(n==0)
        return count;
         if(n%10==0)
         count++;
         return countzeroes(n/10, count);
    }
    public static void main(String[] args) {
        int n=302045000;
        System.out.println(countzeroes(n,0));
    }
}
