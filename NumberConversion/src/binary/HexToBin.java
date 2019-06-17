package binary;

import java.util.ArrayList;

public class HexToBin {
	private String str;

	public HexToBin(String str) {
		this.str = str;
	}
	
	
	public String calcHexToBin() {
		ArrayList<String> output = new ArrayList<String>();
		for(int i =0; i< str.length(); i++) {
			switch (str.substring(i,i+1)) {
			case "0" :
				output.add("0000");
				break;
			case "1" :
				output.add("0001");
				break;
			case "2" :
				output.add("0010");
				break;
			case "3" :
				output.add("0011");
				break;
			case "4" :
				output.add("0100");
				break;
			case "5" :
				output.add("0101");
				break;
			case "6" :
				output.add("0110");
				break;
			case "7" :
				output.add("0111");
				break;
			case "8" :
				output.add("1000");
				break;
			case "9" :
				output.add("1001");
				break;
			case "A" :
				output.add("1010");
				break;
			case "B" :
				output.add("1011");
				break;
			case "C" :
				output.add("1100");
				break;
			case "D" :
				output.add("1101");
				break;
			case "E" :
				output.add("1110");
				break;
			case "F" :
				output.add("1111");
				break;
			}	
			
		}
		
		//translate arraylist to string
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<output.size(); i++) {
			String word = output.get(i);
			  sb.append(word);
		}
		String result = sb.toString();
		
		return result;
	}
}
