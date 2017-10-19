package finalProject;
import java.util.Random;
import javax.swing.JOptionPane;
public class Bingo {

	public static void main(String[]args)
	{
		System.out.println("Card 1:");
		createCard();
		System.out.println();
		System.out.println("Card 2:");
		createCard();
		int first = 0;
		String user;
	
			    user = JOptionPane.showInputDialog(null, "Do you want more numbers? Yes or No.");
	
				
		do {
				if("yes".equalsIgnoreCase(user)) {
					NumberGenerator(first);
	}
				if("no".equalsIgnoreCase(user)) {	
				JOptionPane.showMessageDialog(null, "Game over!!!");
				}
		}while ("yes".equalsIgnoreCase(user))
	}
	public static void createCard()
	{
		int[][] card = new int[5][5];
		int i, j=0;
		boolean duplicate = false;
		Random rand = new Random();
		for(i=0; i<5;i++)
		{
				card[i][0]= rand.nextInt(15)+1;
				card[i][1]= rand.nextInt(30-16+1)+16;
				card[i][2]= rand.nextInt(45-31+1)+31;
				card[i][3]= rand.nextInt(60-46+1)+46;
				card[i][4]= rand.nextInt(75-61+1)+61;
		}
		for(i=1; i<5; i++)
		{
			if(card[i][0]==card[i-1][0])
			{
				duplicate = true;
				card[i][0]= rand.nextInt(15)+1;
				
			}
		}
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
				System.out.print(card[i][j] + "\t");
			System.out.println();
		}
		
		    }
	
	public static void NumberGenerator(int first) {
	Random rand = new Random();
	first = rand.nextInt(99) + 1;
	System.out.println(first);
	
	
}	
	}
	