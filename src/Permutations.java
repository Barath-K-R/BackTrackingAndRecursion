import java.util.ArrayList;

public class Permutations {

	public static ArrayList<String> permutaion(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String>internal=new ArrayList<String>();
			internal.add(p);
			return internal;
		}
		char ch=up.charAt(0);
		ArrayList<String>outer=new ArrayList<String>();
		for(int i=0;i<p.length()+1;++i) {
			String front=p.substring(0,i);
			String back=p.substring(i,p.length());
			outer.addAll(permutaion(front+ch+back, up.substring(1)));
			
		}
		return outer;
	}
	public static void main(String[] args) {
		String string="abc";
		System.out.println(permutaion("",string));
		

	}

}
