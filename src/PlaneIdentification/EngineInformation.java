
package PlaneIdentification;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EngineInformation {
	public boolean yesno(String Message) {
		boolean cont = true;
		System.out.println(Message);
		String[] choices = { "Yes", "No" };
		String input = (String) JOptionPane.showInputDialog(null, Message, "Engine Information",
				JOptionPane.QUESTION_MESSAGE, null, // U // icon
				choices, // Array of choices
				choices[1]); // Initial choice
		if (input.equals("Yes"))
			return true;
		else
			return false;

	}

	public boolean JetOrPropeller() {// Dylan
		String Message = ("\nDoes The Plane Have A Jet Engine?");
		boolean Jet = yesno(Message);
		return Jet;

	}

	public int NumberOfEngines() {// Ryan
		String num = JOptionPane.showInputDialog(null, "");

		return 1;
	}

	public int FourEngineLocation() {// Dylan

		// All On Wings?

		return 0;
	}

	public int ThreeEngineLocation() {// JTsr
		String Message = ("\n Are The Three Engines On The Nose And The Wings?");
		if (yesno(Message) == true)
			return 0;
		else {
			String Message1 = ("\n Are The Three Engises On The Tail Only?");
			if (yesno(Message1) == true)
				return 1;
			else
				return 2;

		}

		// Nose & Wings

		// Tail

		// Wings&Tail

	}

	public int TwoEngineLocation() {// JT
		String Message = ("\n Are The Two Engines On The Wings?");
		if (yesno(Message) == true)
			return 0;
		else {
			String Message1 = ("\n Are The Two Engines On The Body?");
			if (yesno(Message1) == true)
				return 1;
			else
				return 2;
		}
		// WIngs

		// Tail

		// Fuselage

	}

	public int OneEngineLocation() {// Ryan

		// Nose

		// Tail

		return 0;
	}

	public void start() {

	}
}
