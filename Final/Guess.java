package finalProject;
import javax.swing.JOptionPane;
import java.util.Random;
public class Guess {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ask user to pick how many numbers are in range
		String user;
		user = JOptionPane.showInputDialog(null,
				"Pick a range to guess from\n1 - 1-2\n2 - 1-5"
				+ "\n3 - 1-8\n4 1-10");
		if("1-2".equalsIgnoreCase(user)) {
			Random rand = new Random();
			int first = rand.nextInt(2) + 1;
			String pick;
			int real;
			pick = JOptionPane.showInputDialog(null,"please pick a number 1-2");
			real = Integer.parseInt(pick);
			if(first == 1) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You win");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
			}
			if(first == 2) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You win");
				}
			}
		}
		if("1-5".equalsIgnoreCase(user)) {
			Random rand = new Random();
			int second = rand.nextInt(5) + 1;
			int real;
			String pick;
			pick = JOptionPane.showInputDialog(null,"please pick a number 1-5");
			real = Integer.parseInt(pick);
			if(second == 1) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You win");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
					JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
					JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
					JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
			}
			if(second == 2) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You win");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
			}
			if(second == 3) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You win");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
			}
			if(second == 4) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You win");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
			}
			if(second == 5) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You win");
				}
			}
		}
		if("1-8".equalsIgnoreCase(user)) {
			Random rand = new Random();
			int third = rand.nextInt(8) + 1;
			int real;
			String pick;
			pick = JOptionPane.showInputDialog(null,"please pick a number 1-8");
			real = Integer.parseInt(pick);
			if(third == 1) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You win");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
					JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
					JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
					JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You lose");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You lose");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You lose");
				}
			}
			if(third == 2) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You win");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You lose");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You lose");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You lose");
				}
			}
			if(third == 3) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You win");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You lose");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You lose");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You lose");
				}
			}
			if(third == 4) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You win");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You lose");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You lose");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You lose");
				}
			}
			if(third == 5) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You win");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You lose");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You lose");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You lose");
				}
			}
			if(third == 6) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You win");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You lose");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You lose");
				}
			}
			if(third == 7) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You lose");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You win");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You lose");
				}
			}
			if(third == 8) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You lose");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You lose");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You win");
				}
			}
		}
		if("1-10".equalsIgnoreCase(user)) {
			Random rand = new Random();
			int four = rand.nextInt(10) + 1;
			int real;
			String pick;
			pick = JOptionPane.showInputDialog(null,"please pick a number 1-10");
			real = Integer.parseInt(pick);
			if(four == 1) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You win");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
					JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
					JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
					JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You lose");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You lose");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You lose");
				}
				if(real == 9) {
					JOptionPane.showMessageDialog(null,"You picked 9. You lose");
				}
				if(real == 10) {
					JOptionPane.showMessageDialog(null,"You picked 10. You lose");
				}
			}
			if(four == 2) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You win");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You lose");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You lose");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You lose");
				}
				if(real == 9) {
					JOptionPane.showMessageDialog(null,"You picked 9. You lose");
				}
				if(real == 10) {
					JOptionPane.showMessageDialog(null,"You picked 10. You lose");
				}
			}
			if(four == 3) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You win");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You lose");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You lose");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You lose");
				}
				if(real == 9) {
					JOptionPane.showMessageDialog(null,"You picked 9. You lose");
				}
				if(real == 10) {
					JOptionPane.showMessageDialog(null,"You picked 10. You lose");
				}
			}
			if(four == 4) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You win");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You lose");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You lose");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You lose");
				}
				if(real == 9) {
					JOptionPane.showMessageDialog(null,"You picked 9. You lose");
				}
				if(real == 10) {
					JOptionPane.showMessageDialog(null,"You picked 10. You lose");
				}
			}
			if(four == 5) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You win");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You lose");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You lose");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You lose");
				}
				if(real == 9) {
					JOptionPane.showMessageDialog(null,"You picked 9. You lose");
				}
				if(real == 10) {
					JOptionPane.showMessageDialog(null,"You picked 10. You lose");
				}
			}
			if(four == 6) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You win");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You lose");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You lose");
				}
				if(real == 9) {
					JOptionPane.showMessageDialog(null,"You picked 9. You lose");
				}
				if(real == 10) {
					JOptionPane.showMessageDialog(null,"You picked 10. You lose");
				}
			}
			if(four == 7) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You lose");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You win");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You lose");
				}
				if(real == 9) {
					JOptionPane.showMessageDialog(null,"You picked 9. You lose");
				}
				if(real == 10) {
					JOptionPane.showMessageDialog(null,"You picked 10. You lose");
				}
			}
			if(four == 8) {
				if(real == 1) {
					JOptionPane.showMessageDialog(null,"You picked 1. You lose");
				}
				if(real == 2) {
					JOptionPane.showMessageDialog(null,"You picked 2. You lose");
				}
				if(real == 3) {
				JOptionPane.showMessageDialog(null,"You picked 3. You lose");
				}
				if(real == 4) {
				JOptionPane.showMessageDialog(null,"You picked 4. You lose");
				}
				if(real == 5) {
				JOptionPane.showMessageDialog(null,"You picked 5. You lose");
				}
				if(real == 6) {
					JOptionPane.showMessageDialog(null,"You picked 6. You lose");
				}
				if(real == 7) {
					JOptionPane.showMessageDialog(null,"You picked 7. You lose");
				}
				if(real == 8) {
					JOptionPane.showMessageDialog(null,"You picked 8. You win");
				}
				if(real == 9) {
					JOptionPane.showMessageDialog(null,"You picked 9. You lose");
				}
				if(real == 10) {
					JOptionPane.showMessageDialog(null,"You picked 10. You lose");
				}
			}
		}
	}
}
