package binary;

import java.util.ArrayList;

public class DecToBin {
	private double dec; 
	private ArrayList<Integer> bin;
	
	//parse str to a double
	public DecToBin(String str) {
		this.dec = Double.parseDouble(str);
	}
	
	
	public String calcDecToBin() {
		//using a arraylist of integers to make a binary number
		bin = new ArrayList<Integer>();
		
		double cDec = dec;
		while(cDec >= 0.5) {
			cDec = (cDec/2.0);
			if(cDec%1 == .5) {
				cDec-=0.5;
				bin.add(0,(int)1.0);
			} else {
				bin.add(0,(int)0.0);
			}
		}
		
		//translate arraylist to a string
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<bin.size(); i++) {
			int word = bin.get(i);
			  sb.append(word);
		}
		 String result = sb.toString();
		
		return result;
	}
}
