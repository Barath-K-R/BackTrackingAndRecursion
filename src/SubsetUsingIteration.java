import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetUsingIteration {

	public static List<List<Integer>> subset(int[]arr) {
		Arrays.sort(arr);
		List<List<Integer>>outerList=new ArrayList<List<Integer>>();
		outerList.add(new ArrayList<Integer>());
		int start=0,end=0;
		for(int j=0;j<arr.length;++j) {
			start=0;
			if(j>0 && arr[j]==arr[j-1]) {
				start=end+1;
			}
			end=outerList.size()-1;
			int n=outerList.size();
			for(int i=start;i<n;++i) {
				
				List<Integer>internaList=new ArrayList<Integer>(outerList.get(i));
				internaList.add(arr[j]);
				outerList.add(internaList);
			}
		}
		return outerList;
	}
	public static void main(String[] args) {
		int[]arr= {2,1,2};
		System.out.println(subset(arr));

	}

}
