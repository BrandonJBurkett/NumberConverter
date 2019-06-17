package binary;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BinToHex {
	private ArrayList<Integer> output = new ArrayList<Integer>();
	private final Map<Integer,String> map = new HashMap<Integer,String>() {{
		put(10,"A");
		put(11,"B");
		put(12,"C");
		put(13,"D");
		put(14,"E");
		put(15,"F");
	}};
	//parse str to a arraylist of integers
	public BinToHex(String str) {
		for(int i=0; i<str.length(); i++) {
			int num = Integer.parseInt(str.substring(i,i+1));
			this.output.add(num);
		}
	}
	
	//setter
	public void setArr(ArrayList<Integer> newInput) {
		output = newInput;
	}
	
	//getter
	public String getArr(ArrayList<Integer> arr) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.size(); i++) {
			int num = arr.get(i);
			  sb.append(num);
		}
		String result = sb.toString();
		return result;
	}
	
	public String calcBinToHex() {
		ArrayList<String> print = new ArrayList<String>();
		ArrayList<Integer> temp = output;
		
		int k =0;
		int sum=0;
		//start at the back
		for(int i= temp.size()-1; i>=0; i--) {
			
			// 1 == true 0 == false
			if(temp.get(i) == 1) {
				sum += (int)(Math.pow(2, k));
			}
			
			if((k == 3 || i==0) && sum != 0) {
				if(map.containsKey(sum)) {
					print.add(0, map.get(sum));
					k=0;
					sum=0;
				} else {
					print.add(0,Integer.toString(sum));
					k=0;
					sum =0;
				}
			} else {
				k++;
			}
		}
		
		//translate arraylist to a string
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<print.size(); i++) {
			String word = print.get(i);
			  sb.append(word);
		}
		String result = sb.toString();
		
		return result;
	}
}


//Second method 
/* 
 * public class binaryToHexa {
	private ArrayList<Integer> output;
	private final Map<Integer,String> map = new HashMap<Integer,String>() {{
		put(10,"A");
		put(11,"B");
		put(12,"C");
		put(13,"D");
		put(14,"E");
		put(15,"F");
	}};
	//change arg to a string without changing anything big
	public binaryToHexa(ArrayList<Integer> input) {
		output = input;
		System.out.println(bTh());
	}
	
	public void setArr(ArrayList<Integer> newInput) {
		output = newInput;
	}
	
	public String getArr(ArrayList<Integer> arr) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.size(); i++) {
			int num = arr.get(i);
			  sb.append(num);
		}
		String result = sb.toString();
		return result;
	}
	
	public String bTh() {
		ArrayList<String> print = new ArrayList<String>();
		ArrayList<Integer> temp = output;
		
		int k =0;
		int sum=0;
		for(int i= temp.size()-1; i>=0; i--) {
			
			if(temp.get(i) == 1) {
				sum += (int)(Math.pow(2, k));
			}
			
			if((k == 3 || i==0) && sum != 0) {
				if(map.containsKey(sum)) {
					print.add(0, map.get(sum));
					k=0;
					sum=0;
				} else {
					print.add(0,Integer.toString(sum));
					k=0;
					sum =0;
				}
			} else {
				k++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<print.size(); i++) {
			String word = print.get(i);
			  sb.append(word);
		}
		String result = sb.toString();
		
		return getArr(output) + " in hexadecimal is: " + result;
	}
}*/
