package androexample;

import androexample.sweets;
import javax.swing.*;

public class Liquorice {

	public static float price = 0.80;
	public static String name = "Sweet, Sweet Liquorice";

	public static void getPrice(String amount = 1) {
		amount = Integer.parseInt(amount);
		float total = (price * amount);
		
		System.out.println(total);
    }

	public static void main(String args[]) {
		amount = JOptionPane.showInputDialog("How many " + name + "'s would you like?");
		getPrice(amount);
	}
}
