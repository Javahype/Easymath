
import java.util.Random;
import javax.swing.JOptionPane;
public class Summation {

    public static void main(String[] args) {
    
 
    	Random nr = new Random();
    	int number = nr.nextInt(500);
    	int number1 = nr.nextInt(500);
    	int sum = number + number1;  
    	while (true) {
    		int ans = Integer.parseInt(JOptionPane.showInputDialog("What is the answer of " +number+ " + " +number1));
    		if (ans == sum) {
    			JOptionPane.showMessageDialog(null, "Correct!");
    		}
    		
    		else if (ans != sum) {
    			JOptionPane.showMessageDialog(null, "Wrong, the correct answer is " +sum);
    		}
    	}
    	
    }
}
