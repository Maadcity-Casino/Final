package finalProject;
import java.util.Random;
import javax.swing.JOptionPane;
public class BlackJack { 
	
public static void main(String[]args) {


	
String user = null;
String draw;
String play;
String user5 = null;
int total; // user total
int dealer; //total dealer
int score = 0;
	do {
			
			Random rand = new Random();
			int madi = rand.nextInt(11) + 1;
			Random rand2 = new Random();
			int madi2 = rand2.nextInt(11) + 1;
			Random rand3 = new Random();
			int madi3 = rand3.nextInt(11) + 1;
			Random rand4 = new Random();
			int madi4 = rand4.nextInt(11) + 1;
			Random rand5 = new Random();
			int madi5 = rand5.nextInt(11) + 1;
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
				++score;
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
					++score;
				}
				if (total < 21) {
					 user = JOptionPane.showInputDialog(null, madi + madi2 + madi3 + " \n1 - hit\n2 - Stand");
					 if ("hit".equalsIgnoreCase(user)) {
						 total = total + madi4;
							JOptionPane.showMessageDialog(null, + total);
							if (total > 21) {
								user5 = JOptionPane.showInputDialog(null, " \n1 - Hit\n2 - Stand");
							}
							if("hit".equalsIgnoreCase(user5)) {
								total = total + madi5;
								JOptionPane.showMessageDialog(null, total);
							}
								if (total > dealer && total < 22) {
									JOptionPane.showMessageDialog(null, "You Win");
								++ score;
								}
								if (total <= dealer || total > 21) {
									JOptionPane.showMessageDialog(null, "You Lose");
								}
							
					 
					 }
				}
				
			}
			if("stand".equalsIgnoreCase(draw)) {
				total = madi + madi2;
				if (total > dealer) {
					JOptionPane.showMessageDialog(null, "You win!");
					score ++;
				}
				if (total < dealer) {
					JOptionPane.showMessageDialog(null, "You lose");
				}
			}
			if("stand".equalsIgnoreCase(user)) {
				total = madi + madi2 + madi3;
				if (total > dealer) {
					JOptionPane.showMessageDialog(null, "You win!");
					++score;
				}
				if (total < dealer) {
					JOptionPane.showMessageDialog(null, "You lose");
				}
			}
		
		
		play = JOptionPane.showInputDialog(null, "Your score is " + score + ". Would you like to play again?");
	}while("yes".equalsIgnoreCase(play));	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//some random comment

		Random rand = new Random();
		int first = rand.nextInt(2) + 1;
		String user;
		do
		{
			Random rand = new Random();
			int first = rand.nextInt(2) + 1;
		}while("hit".equalsIgnoreCase(user))

	}


}
}