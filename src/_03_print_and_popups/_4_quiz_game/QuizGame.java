package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String answer = JOptionPane.showInputDialog("True or false, Therizenosuarus would have most likely avoided any threat");
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				if(answer.equalsIgnoreCase("true")) {
					JOptionPane.showMessageDialog(null,"you got it correct");
					score = score+1;
				}
				else {
					JOptionPane.showMessageDialog(null, "sorry, but that is incorrect");
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
				answer = JOptionPane.showInputDialog("What was the largest dinosuar to ever walk planet earth");
				if(answer.equalsIgnoreCase("dreadnoghtus")) {
					JOptionPane.showMessageDialog(null,"you got it correct");
					score = score+1;
				}
				else {
					JOptionPane.showMessageDialog(null, "sorry, but that is incorrect");
				}
				answer = JOptionPane.showInputDialog("which primate learns very fast");
				if(answer.equalsIgnoreCase("bonbo")) {
					JOptionPane.showMessageDialog(null,"you got it correct");
					score = score+1;
				}
				else {
					JOptionPane.showMessageDialog(null, "sorry, but that is incorrect");
				}
				answer = JOptionPane.showInputDialog("what animals are most retated to people");
				if(answer.equalsIgnoreCase("chimpanzee")) {
					JOptionPane.showMessageDialog(null,"you got it correct");
					score = score+1;
				}
				else {
					JOptionPane.showMessageDialog(null, "sorry, but that is incorrect");
				}
				answer = JOptionPane.showInputDialog("what is the second evolution of styther");
				if(answer.equalsIgnoreCase("kleavor")) {
					JOptionPane.showMessageDialog(null,"you got it correct");
					score = score+1;
				}
				else {
					JOptionPane.showMessageDialog(null, "sorry, but that is incorrect");
				}
				answer = JOptionPane.showInputDialog("which of appletun, flapple, or dipplin evoles into hydrapple");
				if(answer.equalsIgnoreCase("dipplin")) {
					JOptionPane.showMessageDialog(null,"you got it correct");
					score = score+1;
				}
				else {
					JOptionPane.showMessageDialog(null, "sorry, but that is incorrect");
				}
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "you got 6 points");
		JOptionPane.showMessageDialog(null, "you got 5 points");
		JOptionPane.showMessageDialog(null, "you got 4 points");
		JOptionPane.showMessageDialog(null, "you got 3 points");
		JOptionPane.showMessageDialog(null, "you got 2 points");
		JOptionPane.showMessageDialog(null, "you got 1 points");
		JOptionPane.showMessageDialog(null, "you got 0 points");
	}
}
