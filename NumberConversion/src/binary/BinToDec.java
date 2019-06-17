package binary;

public class BinToDec {
	private String str;
	
	public BinToDec(String str) {
		this.str = str;
	}
	
	public String calcBinToDec() {
		int sum = 0;
		int base = 0;
		
		//start at the back
		for(int i = str.length()-1; i>=0; i--) {
			int num = Integer.parseInt(str.substring(i,i+1));
			if(num == 0) {
				sum+=0;
			} else if(num == 1){
				int num2 = 2*num;
				sum += ((int) Math.pow(num2,base));
			}
			base++;
		}
		String result = Integer.toString(sum);
		
		return result;
	}
}
