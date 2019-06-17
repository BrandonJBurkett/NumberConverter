package binary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import java.awt.Font;

public class NumberConversionApplication {

	private JFrame frame;
	private JTextField Binary;
	private JTextField Decimal;
	private JTextField Hexadecimal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberConversionApplication window = new NumberConversionApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NumberConversionApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 799, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Number Conversion");
		
		Binary = new JTextField();
		Binary.setFont(new Font("Yu Gothic", Font.PLAIN, 25));
		Binary.setBounds(200, 13, 360, 100);
		frame.getContentPane().add(Binary);
		Binary.setColumns(10);
		
		Decimal = new JTextField();
		Decimal.setFont(new Font("Yu Gothic", Font.PLAIN, 25));
		Decimal.setColumns(10);
		Decimal.setBounds(200, 126, 360, 100);
		frame.getContentPane().add(Decimal);
		
		Hexadecimal = new JTextField();
		Hexadecimal.setFont(new Font("Yu Gothic", Font.PLAIN, 25));
		Hexadecimal.setColumns(10);
		Hexadecimal.setBounds(200, 239, 360, 100);
		frame.getContentPane().add(Hexadecimal);
		
		JButton BinaryButton = new JButton("Convert");
		BinaryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BinToDec bTD;
				BinToHex bTH;
				String binaryNum;
				try {
					binaryNum = Binary.getText();
					bTD = new BinToDec(binaryNum);
					String ansD = bTD.calcBinToDec();
					Decimal.setText(ansD);
					bTH = new BinToHex(binaryNum);
					String ansH = bTH.calcBinToHex();
					Hexadecimal.setText(ansH);
					
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a binary number that consists of 1's and 0's");
				}
			}
		});
		BinaryButton.setBounds(572, 51, 97, 25);
		frame.getContentPane().add(BinaryButton);
		
		JButton DecimalButton = new JButton("Convert");
		DecimalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DecToBin dTB;
				DecToHex dTH;
				String decimalNum;
				try {
					decimalNum = Decimal.getText();
					dTB = new DecToBin(decimalNum);
					String ansB = dTB.calcDecToBin();
					Binary.setText(ansB);
					dTH = new DecToHex(decimalNum);
					String ansH = dTH.calcDecToHex();
					Hexadecimal.setText(ansH);
					
				} catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter a Decimal number.");
				}
			}
		});
		DecimalButton.setBounds(572, 164, 97, 25);
		frame.getContentPane().add(DecimalButton);
		
		JButton HexadecimalButton = new JButton("Convert");
		HexadecimalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HexToBin hTB;
				HexToDec hTD;
				String hexadecimalNum;
				try {
					hexadecimalNum = Hexadecimal.getText();
					hTB = new HexToBin(hexadecimalNum);
					String ansB = hTB.calcHexToBin();
					Binary.setText(ansB);
					hTD = new HexToDec(hexadecimalNum);
					String ansD = hTD.calcHexToDec();
					Decimal.setText(ansD);
					
				} catch(Exception e3) {
					JOptionPane.showMessageDialog(null, "Please enter a Hexadecimal number 0-9 or A-F.");
				}
			}
		});
		HexadecimalButton.setBounds(572, 277, 97, 25);
		frame.getContentPane().add(HexadecimalButton);
		
		JLabel lblBinary = new JLabel("Binary Number");
		lblBinary.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBinary.setBounds(37, 37, 123, 52);
		frame.getContentPane().add(lblBinary);
		
		JLabel lblDecimal = new JLabel("Decimal Number");
		lblDecimal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDecimal.setBounds(37, 150, 123, 52);
		frame.getContentPane().add(lblDecimal);
		
		JLabel lblHexadecimal = new JLabel("Hexadecimal Number");
		lblHexadecimal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHexadecimal.setBounds(37, 263, 151, 52);
		frame.getContentPane().add(lblHexadecimal);
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Binary.setText("");
				Decimal.setText("");
				Hexadecimal.setText("");
			}
		});
		ResetButton.setBounds(672, 333, 97, 25);
		frame.getContentPane().add(ResetButton);
	}
}
