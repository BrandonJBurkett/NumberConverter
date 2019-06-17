package binary;

import java.util.Scanner;

public class UserInput {
	private DecToBin dTB;
	private DecToHex dTH;
	private BinToHex bTh;
	private BinToDec bTD;
	private HexToBin htB;
	private HexToDec hTd;
	
	public UserInput() {
		boolean guardian = false;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome please enter an number:\n 1: Decimal to Binary\n 2: Decimal to Hexadecimal\n 3: Binary to Hexadecimal\n 4: Binary to Decimal\n 5: Hexadecimal to Binary\n 6: Hexadecimal to Decimal");
			String num = sc.nextLine();
			
			switch (num) {
			case "1": 
				System.out.println("Enter a Decimal number: ");
				String case1 = sc.nextLine();
				dTB = new DecToBin(case1);
				System.out.println(case1 + " in binary is " + dTB.calcDecToBin());
				guardian = terminated();
				break;
			case "2": 
				System.out.println("Enter a Decimal number: ");
				String case2 = sc.nextLine();
				dTH = new DecToHex(case2);
				System.out.println(case2 + " in Hexadecimal is " + dTH.calcDecToHex());
				guardian = terminated();
				break;
			case "3": 
				System.out.println("Enter a Binary number: ");
				String case3 = sc.nextLine();
				bTh = new BinToHex(case3);
				System.out.println(case3 + " in Hexadecimal is " + bTh.calcBinToHex());
				guardian = terminated();
				break;
			case "4":
				System.out.println("Enter a Binary number: ");
				String case4 = sc.nextLine();
				bTD = new BinToDec(case4);
				System.out.println(case4 + " in decimal is " + bTD.calcBinToDec());
				guardian = terminated();
				break;
			case "5": 
				System.out.println("Enter a Hexadecimal number: ");
				String case5 = sc.nextLine();
				htB = new HexToBin(case5);
				System.out.println(case5 + " in binary is " + htB.calcHexToBin());
				guardian = terminated();
				break;
			case "6": 
				System.out.println("Enter a Hexadecimal number: ");
				String case6 = sc.nextLine();
				hTd = new HexToDec(case6);
				System.out.println(case6 + " in decimal is " + hTd.calcHexToDec());
				guardian = terminated();
				break;
			}

		} while(guardian);
	}
	
	public boolean terminated() {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("Would you like to continue? y/n");
		input = sc.nextLine();
		if(!(input.equalsIgnoreCase("y"))) {
			System.out.println("Operation terminated. Goodbye!");
			return false;
		}
		return true;
	}
}
