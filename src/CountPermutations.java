import java.util.ArrayList;

public class CountPermutations {

	public static int permutaion(String p,String up) {
		if(up.isEmpty()) {
			return 1;
		}
		char ch=up.charAt(0);
		int count=0;
		for(int i=0;i<p.length()+1;++i) {
			String front=p.substring(0,i);
			String back=p.substring(i,p.length());
			count=count+permutaion(front+ch+back, up.substring(1));
			
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string="abcd";
		System.out.println(permutaion("",string));
	}

}
