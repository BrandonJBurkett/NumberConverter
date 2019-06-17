package binary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DecToHex {
	private double dec;
	private ArrayList<String> print;
	private final Map<Integer,String> map = new HashMap<Integer,String>() {{
		put(10,"A");
		put(11,"B");
		put(12,"C");
		put(13,"D");
		put(14,"E");
		put(15,"F");
	}};
	
	//parse str to a double
	public DecToHex(String str) {
		this.dec = Double.parseDouble(str);
	}
	
	public String calcDecToHex() {
		//using a arraylist to put numbers and letter together
		print = new ArrayList<String>();
		
		double num = dec;
		double xNum = num;
		//calculates dec to hex
		do {
			xNum /= 16.0;
			if(xNum*16.0 < 16.0) {
				int temp1 = (int)(16.0*xNum);
				
				if(map.containsKey(temp1)) {
					print.add(0, map.get(temp1));
				} else {
					print.add(0,""+temp1+"");
				}
			} else if(xNum%1 < 1.0) {
				int temp2 = (int)(16.0*(xNum%1));
				xNum = (xNum - (xNum%1));
				
				if(map.containsKey(temp2)) {
					print.add(0, map.get(temp2));
				} else {
					print.add(0,""+temp2+"");
				}
			} 
		} while(xNum >= 1.0);
		
		//translate arraylist to string
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<print.size(); i++) {
			String word = print.get(i);
			  sb.append(word);
		}
		 String result = sb.toString();
		
		return result;
	}
}