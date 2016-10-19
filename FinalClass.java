package finalproject;

public class FinalClass extends FinalArray {
	private double price;
	private String car;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public void setPrice(int prices){  //Overloaded Method.
		this.price = prices;
	}
	public void loadNums(){
		for (int outer = 0; outer < getNums2().length; ++outer) {
			for (int inner = 0; inner < getNums2()[outer].length; ++inner ){
				getNums2()[outer][inner] = (double) ((Math.random()*100)+1);
				System.out.print(getNums2()[outer][inner] + "\t");
			}
		}
	}
	public void findLast(){
		Double last = getNums2()[3][2];
		System.out.println("The Last number in the Two-Dim array is : " + last);
	}
	public static void main(String[]args){
		FinalClass finish = new FinalClass();
		finish.loadNums();
		System.out.println();
		finish.setPrice(22056.34);
		finish.setPrice(240987);
		int cost = (int) finish.getPrice();
		double cost2 = finish.getPrice();
		System.out.println(cost +  " , " + cost2);
		finish.findLast();
	}
}
