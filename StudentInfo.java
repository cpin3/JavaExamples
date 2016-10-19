package finalproject;
import java.util.*;
/*Crisanto Pineda
 * Final Project
 * Purpose: To create a Grade report for a set of Students. 
 * Last edited 12/07/14 11:45pm.
 */
public class StudentInfo {
	private HashMap<String, String> idrealname = new HashMap<String, String>(); //New HashMap to Input the 7 students. 
	

	public void getrealNames(){
		idrealname.put("ABC1" , "Bear Grylls");			
		idrealname.put("DEF2" , "Les Stroud");
		idrealname.put("GHI3" , "Joe Teti");
		idrealname.put("JKL4" , "Mick Dodge");
		idrealname.put("MNO5" , "Ruth Hawke");
		idrealname.put("PQR6" , "Dave Canterburry");
		idrealname.put("STU7" , "Ray Mears");
	
	}


	public String getIdrealname(String nomen) {
		return idrealname.get(nomen);
	}


	public void setIdrealname(HashMap<String, String> idrealname) {
		this.idrealname = idrealname;
	}
	
	
}
