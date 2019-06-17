package binary;

import java.util.HashMap;
import java.util.Map;

public class HexToDec {
	private String str;
	private final Map<String,Integer> map = new HashMap<String,Integer>() {{
		put("A",10);
		put("B",11);
		put("C",12);
		put("D",13);
		put("E",14);
		put("F",15);
	}};
	
	public HexToDec(String str) {
		this.str = str;
	}
	
	public String calcHexToDec() {
		
		int sum=0;
		int base=1;
		
		for(int i= str.length()-1; i>=0; i--) {
			if(map.containsKey(str.substring(i,i+1))) {
				sum += (map.get(str.substring(i,i+1)) * base);
			} else if(Integer.parseInt(str.substring(i,i+1)) >= 1 && Integer.parseInt(str.substring(i,i+1)) <= 9) {
				sum += (Integer.parseInt(str.substring(i,i+1)) * base);
			}
			base *= 16;
		}
		String output = Integer.toString(sum);
		
		return output;
	}
}
