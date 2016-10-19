package finalproject;

public class FinalArray {
	private int[] nums = {23,33,43,53,63,73,83,93};
	private Double[][] nums2 = new Double [4][3];
	
	public void giveZeros(){												// Problem 1
	for(int index = 0; index < nums.length; index++){
		if ((index %  2) != 0);
		nums[index] = 0;
		System.out.println(nums[index]);
		}
	}
		
	public void loadNums(){													//Problem 2A
		for (int outer = 0; outer < getNums2().length; ++outer) {
			for (int inner = 0; inner < getNums2()[outer].length; ++inner ){
				getNums2()[outer][inner] = (double) ((Math.random()*100)+1);
				System.out.print(getNums2()[outer][inner] + "\t");
			}
			System.out.println("\n");
		}
	}
	
	public void findLast(){													//Problem 2B
		Double last = getNums2()[3][2];
		System.out.println("The Last number in the Two-Dim array is : " + last);
	}

	public Double[][] getNums2() {
		return nums2;
	}

	public void setNums2(Double[][] nums2) {
		this.nums2 = nums2;
	}
	
}
