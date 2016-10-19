package finalproject;
import java.util.*;
/*Crisanto Pineda
 * Final Project
 * Purpose: To create a Grade report for a set of Students. 
 */
public class GradesReporter extends StudentGrades {
	private HashMap<Integer,String> numletter = new HashMap<Integer, String>();

	StudentInfo tryit = new StudentInfo();		//Instantiates StudentInfo
	StudentGrades addon = new StudentGrades();	//Instantiates StudentGrades
	
		public void getGrades(){	//Method that calls all the info from past Classes and Meshes it all together. 
			addon.listMap();									//Calls the first method in SutdentGrades. Allows Input of values.
			tryit.getrealNames();								//Call the students from Problem Statement registered in StudentInfo.
			
			Set<String> idnames = addon.getIdgrade().keySet();	//Calls the keys from idgrades HashMaps. Keys are the Student ID's
			for(String id : idnames){
				int numgrade = addon.getIdgrade().get(id);
				String name = tryit.getIdrealname(id);
				System.out.println();
				String letter = numletter.get(numgrade);
				System.out.println(id + "\t" + name + " "+ numgrade +  " " + letter);
				
			}
			double count = 0.0;
			double totalfail = 0.0;
			System.out.println("Failing Grades:" + "\n");   		//Finds all the failing grades.
			for(String id : idnames){								//Takes all entries from HashMap and converts it 
				String name = tryit.getIdrealname(id);
				int numgrade = addon.getIdgrade().get(id);
				if(numgrade <= 60){
					System.out.println(  name + " " + numgrade );
					count++;
					totalfail = totalfail + numgrade;
					}
				}
			double avgfail = totalfail / count;
			System.out.println("The average Flunk Grade is: " + avgfail);
			}
	
	public void calcGrades(){
		for(int idx = 51; idx <= 60; idx++){    //Calculates Int grade to Letter using HashMap and forLoop.
			numletter.put(idx , "F");
		}
		for(int idx = 61; idx <= 70; idx++){    //Index has been assigned a specific variable that ends at the desired Grade Range.
			numletter.put(idx , "D");
		}
		for(int idx = 71; idx <= 80; idx++){ 	//HashMap holds the number inserted and compares it to idx. Then given the right String.
			numletter.put(idx , "C");
		}
		for(int idx = 81; idx <= 90; idx++){
			numletter.put(idx , "B");
		}
		for(int idx = 91; idx <= 100; idx++){
			numletter.put(idx , "A");
		}
	}
	
	
	public static void main(String[]args){					//Main Method that runs the program. 
		GradesReporter test = new GradesReporter();
		test.calcGrades();
		test.getGrades();
		
	}
	
}

