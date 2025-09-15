package tests;

public class StringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Balaji Sudhakar Nale";
//		System.out.println(s);
		
		String[] splittedString = s.split("Sudhakar");
		
		System.out.println(splittedString[0]);
//		System.out.println(splittedString[1]);
//		System.out.println(splittedString[2]); 
		System.out.println(splittedString[1].trim());
		for(int i=0;i<s.length();i++) 
		{
			
			System.out.println(s.charAt(i));
		}
		
		
		
		

	}

}
