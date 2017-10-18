package finalProject;
import java.util.Random;
import javax.swing.JOptionPane;
public class BlackJack { 
	
public static void main(String[]args) {

	
String user = null;
String draw;
String play;
int total; // user total
int dealer; //total dealer
	do {
			
			Random rand = new Random();
			int madi = rand.nextInt(11) + 1;
			Random rand2 = new Random();
			int madi2 = rand2.nextInt(11) + 1;
			Random rand3 = new Random();
			int madi3 = rand3.nextInt(11) + 1;
			Random rand4 = new Random();
			int madi4 = rand4.nextInt(11) + 1;
			Random comp = new Random();
			int deal = comp.nextInt(11) + 1;
			Random comp2 = new Random();
			int deal2 = comp2.nextInt(11) + 1;
			Random comp3 = new Random();
			int deal3 = comp3.nextInt(11) + 1;
			dealer = deal + deal2;
			if (dealer <= 16) {
				dealer = (deal + deal2 + deal3);
			
				if (dealer > 21) {
				JOptionPane.showMessageDialog(null, "Dealer bust, you win.");
			}
			}
			
			draw = JOptionPane.showInputDialog(null, madi + madi2 + ". \n1- Hit\n2 - Stand");
			if("hit".equalsIgnoreCase(draw)) {
				
				total = (madi + madi2 + madi3);
				JOptionPane.showMessageDialog(null, total);
				if (total >21) {
					JOptionPane.showMessageDialog(null, "You lose dealer beat you.");
				}
				if (total == 21) {
					JOptionPane.showMessageDialog(null, "You win!");
				}
				if (total < 21) {
					 user = JOptionPane.showInputDialog(null, madi + madi2 + madi3 + " \n1 - hit\n2 - Stand");
					 if ("hit".equalsIgnoreCase(user)) {
						 total = total + madi4;
							JOptionPane.showMessageDialog(null, + total);
							if (total > 21 || total < dealer) {
								JOptionPane.showMessageDialog(null, "You lose");
							}
					 
					 }
				}
				
			}
			if("stand".equalsIgnoreCase(draw)) {
				total = madi + madi2;
				if (total > dealer) {
					JOptionPane.showMessageDialog(null, "You win!");
				}
				if (total < dealer) {
					JOptionPane.showMessageDialog(null, "You lose");
				}
			}
			if("stand".equalsIgnoreCase(user)) {
				total = madi + madi2 + madi3;
				if (total > dealer) {
					JOptionPane.showMessageDialog(null, "You win!");
				}
				if (total < dealer) {
					JOptionPane.showMessageDialog(null, "You lose");
				}
			}
		
		
		play = JOptionPane.showInputDialog(null, "Would you like to play again?");
	}while("yes".equalsIgnoreCase(play));	
}
}