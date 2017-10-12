package finalProject;
import java.util.Random;
import javax.swing.JOptionPane;
public class CoinFlip {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user;
		int score = 0;
		Random rand = new Random();
		int n = rand.nextInt(2) + 1;
		user = JOptionPane.showInputDialog(null,"Heads or tails");
		
		if(n == 1) {
			if("Heads".equalsIgnoreCase(user)) {
				JOptionPane.showMessageDialog(null,"You picked Heads. You win");
				++score;
		}
			if("Tails".equalsIgnoreCase(user)) {
				JOptionPane.showMessageDialog(null,"You picked Tails. You lose");
			}
		}
		if(n == 2) {
			if("Heads".equalsIgnoreCase(user)) {
				JOptionPane.showMessageDialog(null,"You picked Heads. You lose");
			}
			if("Tails".equalsIgnoreCase(user)) {
				JOptionPane.showMessageDialog(null,"You picked Tails. You win");
				++score;
			//Guess.main(args);	
			}
		}	
		}
}
