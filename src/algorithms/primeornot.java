


package algorithms;

import javax.swing.JOptionPane;

public class primeornot {
	
public static void main(String[] args) {

String prime = JOptionPane.showInputDialog("Put a number in");

int p = Integer.parseInt(prime);
boolean isPrime = true;

if (p%2==0 && p>2) {
	isPrime=false;
}
else {
	for(int i = 3; i<p; i+=2) {
		if(p % i == 0) {
			isPrime=false;
			break;
	    }

     }
}

if(isPrime) {
	System.out.println("prime");
}
else {
	System.out.println("not prime");
}

}



}
