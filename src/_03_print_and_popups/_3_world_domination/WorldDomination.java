package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
String knowsCode = JOptionPane.showInputDialog("Do you know coding");
		// 2. If they say "yes", tell them they will rule the world.
 if(knowsCode.contentEquals("yes")){
	 JOptionPane.showMessageDialog(null,"you will rule the world");
 }
		// 3. Otherwise, tell them to sign up for classes at The League.
 else {
	 JOptionPane.showMessageDialog(null,"sign up for coding classes at The League Of Amazing Programers then.");
 }
	}
}

