import javax.swing.JOptionPane;

// U1L02 notes-
//orignailly had problem statement but deleted other module
public class U1L02NumNickCalc {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "How many cents do you have?");
		int userInput = Integer.parseInt(input);
		int userMoney = userInput;
		
		//System.out.println(userMoney);
		//int numbNicks = userMoney/5;
		//int pennies = userMoney - (numbNicks * 5);
		int numbQuarters = userMoney/25;
		userMoney = userMoney % 25;
		System.out.println(userMoney);
		
		int numbDimes = userMoney/10;
	    userMoney = userMoney%10;
		
		int numbNicks = userMoney/5;
		userMoney = userMoney %5;

		int pennies = userMoney;
		
		JOptionPane.showMessageDialog(null, userInput + " is " + numbQuarters
		+ " quarters, " + numbDimes + " dimes,  "
		+ numbNicks + " nickels and " + pennies + " pennies");
	}

}
