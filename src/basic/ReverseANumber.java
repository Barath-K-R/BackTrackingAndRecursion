package basic;

public class ReverseANumber {
    public static int reverse(int n,int digits){
        if(n==0)
        return 0;
        int rem=n%10;
         return (int)(rem*Math.pow(10,digits))+reverse(n/10, digits-1);
    }
    public static void main(String[] args) {
        int n=3467;
        int digits=(int)Math.log10(n)+1;
        
        System.out.println(reverse(n,digits-1));
       
    }
}
