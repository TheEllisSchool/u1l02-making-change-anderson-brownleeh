import javax.swing.JOptionPane;

// U1L02 notes-
//orignailly had problem statement but delated other module
public class U1L02NumNickCalc {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "How many cents do you have?");
		int userMoney = Integer.parseInt(input);
		
		//System.out.println(userMoney);
		int numbNicks = userMoney/5;
		int pennies = userMoney - (numbNicks * 5);
		
		JOptionPane.showMessageDialog(null, userMoney + " is "
		+ numbNicks + " nickels and " + pennies + " pennies");
	}

}
