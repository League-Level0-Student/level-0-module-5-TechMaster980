package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class stalin {

	public static void main(String[] args) {

		stalin skills = new stalin();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();

	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many sickles and hammers they have
		
//		String mailbox = JOptionPane.showInputDialog("how much sickle and hammers do you have");
//		int ironcross = Integer.parseInt(mailbox);
//		// Tell them how many sickle and hammer they have (hint multiply by 10)
//
//		JOptionPane.showMessageDialog(null, "you have " + ironcross * 10 + " sickle and hammers");
//
//		// Ask the user how hungry they are (inches)
//		String triaginalsign = JOptionPane.showInputDialog("how hungry are you");
//		int holomondor = Integer.parseInt(triaginalsign);
//		// If they are shorter than 36 inches, tell them to destroy stalin
//
//		 if(holomondor<36) {
//		 System.out.println("destroy stalin");
//		 }

	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
//		for(int i = 0; i <= 30; i++) {
//			if(i%3==0) {
//		
//			System.out.println(i);
//		}
//		}
	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		   Random rand = new Random();
		   int mao = rand.nextInt(20);
			System.out.println(mao);
		
		// Get another random number that is less than 10 and print it to the console
			   int mussolini = rand.nextInt(10);
				System.out.println(mussolini);
			
		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction

	}

	void skill4() { // In a pop-up, ask the user for the city they live in

		// If they answered "San Diego", tell them they live in America's Finest City

		// Otherwise, tell them to move to San Diego

		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."

		// If there is 1 car, use a pop-up to display the make/model of the car

		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.

	}

	void skill5() { // In a pop-up, ask the user for the name of their school

		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.

	}
}
