package redboxcopy;

import java.util.Date;

public class Rental {

	private double cost = 2.99;
	private String movie = " ";
	private Date  date;
	
	public Rental(int cost, String movie, Date date){
		this.cost = cost;
		this.movie = movie;
		this.date = date;
	}
	public void Cost(){
		if (cost >1 ){
			cost = 4;
		}
			
	}
	
	public static void main(String []args){
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
