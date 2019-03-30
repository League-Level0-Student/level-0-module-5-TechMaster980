import javax.swing.JOptionPane;

public class SkillPractice {

public static void main(String[] args) {
	
	SkillPractice skills = new SkillPractice();
  	skills.skill1();
  	//skills.skill2();
  	//skills.skill3();
  	//skills.skill4();
  	//skills.skill5();
}

void skill1() {
	// Use pop-ups for the following.
	// Ask the user how many dimes they have

	String dime = JOptionPane.showInputDialog("how much dimes do you have");
    int int_dime=Integer.parseInt(dime);
//Tell them how many cents they have (hint multiply by 10)
	
	
	JOptionPane.showMessageDialog(null, "you have "+(10*int_dime));	
	
	// Ask the user how tall they are (inches)

	String height = JOptionPane.showInputDialog("how tall are you");
	int int_height=Integer.parseInt(height);
	// If they are shorter than 36 inches, tell them to eat their Wheaties
	
	if(int_height<36) {
		JOptionPane.showMessageDialog(null, "you have to eat your wheaties" );
	}
}

}

