package finalproject;
import java.util.*;

/*Crisanto Pineda
 * Final Project
 * Purpose: To create a Grade report for a set of Students. 
 */
public class StudentGrades {
	private HashMap<String, Integer> idgrade = new HashMap<String, Integer>();
	
	public void listMap(){
		int count = 0;
		
		while(count <= 0 ){									//Method that allows for looping of Input. 
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter ID# or Quit to proceed:"); //Holds the String ID input
			String namein = input.nextLine();
			
			if (namein.equals("Quit")){						//Ends Method when user Enters Quit.
				System.out.print("Thank you! Your Grades were stored.");
				break;
			
				}
			System.out.print("Please enter grade:");
			
			int gradein = input.nextInt();					//Holds the Grade as int and Stores it. 
			
			idgrade.put(namein, gradein);					//Takes every <String ID, and int Grade> and brings that to HashMap.
		}
		count++;
	}
	public HashMap<String, Integer> getIdgrade() {			//Getter Method to use for other classes. Returns the values of HashMap idgrade.
		return idgrade;
	}



	public void setIdgrade(HashMap<String, Integer> idgrade) { //Generic setter Method. 
		this.idgrade = idgrade;
	}
}
	
