package finalProject;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String user;
			do {
				double[] numbers = {6.25, 6.55, 10.25, 16.85};
			      System.out.println("Numbers one by one are:");
			      
			      for(int x = 0; x < numbers.length; ++x)
			      System.out.println(numbers[x]);
				
			
			
		
				user = JOptionPane.showInputDialog(null, "Wanna see it again?");
			}while("yes".equalsIgnoreCase(user));
	}

}
