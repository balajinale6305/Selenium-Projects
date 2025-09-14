package testproject;

import java.util.ArrayList;

public class corejavaBrushup2 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5,6,7,8,10,12,16};
		
	//output should be multiply by 2:  2,4,6,8,10,12,16
		for (int i = 0; i<= arr.length; i++ ) {
		 {
			 if (arr[i] % 2 == 0) {
				 
				 System.out.println(arr[i]);
				 break;
			 }
			 else {
				 System.out.println(arr[i] + " is not multiple of 2");
			 }
	      }
		ArrayList a = new ArrayList();
		a.add("Balaji");
		a.add("Sudhakar");
		a.add("Nale");
		System.out.println(a.get(1));
			
		}
		
		
		
	}

}
