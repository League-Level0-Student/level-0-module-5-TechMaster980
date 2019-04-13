import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {

public static void main(String[] args) {
	
	SkillPractice skills = new SkillPractice();
  	//skills.skill1();
  	//skills.skill2();
  	//skills.skill3();
  	//skills.skill4();
  	skills.skill5();
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

void skill2() { 
for(int i=2; i < 30; i+=3) {
System.out.println(i);
}
}
void skill3() { 
Random rd=new Random();
int result=rd.nextInt(20);
System.out.println(result);
int result1=rd.nextInt(10);
System.out.println(result1);
JOptionPane.showMessageDialog(null, result-result1);
}

void skill4() { 

String city = JOptionPane.showInputDialog("what city do you live at");
if(city.equals("sandiego")) {
JOptionPane.showMessageDialog(null, "you live in america's finest city");
}
else {
JOptionPane.showMessageDialog(null, "you should move to san diego");	
}
int cars	 = 2;
if(cars==0) {
JOptionPane.showMessageDialog(null, "I bet you use public transportation.");	
}
if(cars==1) {
JOptionPane.showMessageDialog(null, "the model of your car");	
}
if(cars>1) {
JOptionPane.showMessageDialog(null, "how many wheels does the car have between them");	
}
}

void skill5() { 
String school = JOptionPane.showInputDialog("what the name of your school");
JOptionPane.showMessageDialog(null, (school)+" is a great school");



	}
	}










