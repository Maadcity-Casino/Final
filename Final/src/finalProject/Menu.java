package finalProject;
import javax.swing.JOptionPane;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user;
		String name;
		do {
			name = JOptionPane.showInputDialog(null, "Enter username");
		user = JOptionPane.showInputDialog(null,
				"What game would you like to play?\n1 - Coin flip\n2 - Rock Paper Scissors"
				+ "\n3 - Guess\n4 - Bingo\n5 - Black Jack\n6 - see an array\n7 - Quit");
		if("Coin flip".equalsIgnoreCase(user)) {
			CoinFlip.main(args);
	}
		if("Rock Paper Scissors".equalsIgnoreCase(user)) {
			RockPaperScissors.main(args);
		}
		if("guess".equalsIgnoreCase(user)) {
			Guess.main(args);
		}
		if("Bingo".equalsIgnoreCase(user)) {
			Bingo.main(args);
		}
		if("Black Jack".equalsIgnoreCase(user)) {
			BlackJack.main(args);
		}
		if("Array".equalsIgnoreCase(user)) {
			Array.main(args);
		}
		if("quit".equalsIgnoreCase(user)) {
			
		}  
		}while ("Coin flip".equalsIgnoreCase(user)||"Rock paper Scissors".equalsIgnoreCase(user)||"Guess".equalsIgnoreCase(user)||"Bingo".equalsIgnoreCase(user)||"Black Jack".equalsIgnoreCase(user) );
	}
}
