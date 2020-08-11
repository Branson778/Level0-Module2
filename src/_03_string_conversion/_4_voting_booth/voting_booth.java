package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting_booth {
	public static void main(String[] args) {
String ageString = JOptionPane.showInputDialog("How Old Are You?");
int ageInt = Integer.parseInt(ageString);
if (ageInt >=18) {
	JOptionPane.showInputDialog("Who Do You Want To Be President");
}
else {
	JOptionPane.showMessageDialog(null, "Sorry but no one cares about what you think.");
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
