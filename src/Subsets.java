//returning subsets as arraylist
import java.util.ArrayList;

public class Subsets {

	public static ArrayList<String> subsets(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String>arr=new ArrayList<>();
			
			arr.add(p);
			return arr;
		}
		ArrayList<String>leftArrayList=subsets(p+up.substring(0,1), up.substring(1));
		ArrayList<String>rightArrayList=subsets(p, up.substring(1));
		leftArrayList.addAll(rightArrayList);
		return leftArrayList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String string="abc";
        System.out.println(subsets("", string));
       
	}

}
