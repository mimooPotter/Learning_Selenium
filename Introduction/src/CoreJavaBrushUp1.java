import java.util.ArrayList;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum = 5;
		String website = "rahul shetty academy";
		char letter = 'r';
		double dec = 5.99 ;
		boolean myCard = true;
		
		System.out.println (myNum);
		System.out.println (myNum + " is the value i want");
		
		
		//array
		int [] arr = new int [6];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		
		//or
		
		int [] arr2 = {1,2,3,4,5,6};
		
		System.out.println (arr2[5]);
		
		//implementing for loop
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String [] name = {"rahul", "shetty", "mimoo"};
		
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
		//enhanced for loop 
		for (String s :name) {
			System.out.println(s);
		}
		
		
		
		 
		
		

	}

}
