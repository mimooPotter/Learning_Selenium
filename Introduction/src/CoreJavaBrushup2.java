import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr2 = {1,2,3,4,5,6,8,122,133};
		
		//check if array has multiple of 2
		for (int i=0; i<arr2.length; i++) {
			if (arr2[i]%2 ==0) {
				System.out.println(arr2[i] + " is  a multiple of 2");
				break;   //break is used to discontinue the for loop when you find a desire element
			}
			else
			{
				System.out.println(arr2[i] + " is not a multiple of 2");
			}
		}
		
		//for dynamic array list we can create an object called arraylist
				ArrayList<String> a = new ArrayList<String>();    //array list is a class in java
				a.add("rahul"); //create object of the method object.method
				a.add("mimoo");
				a.add("fahim");
				a.add("bubs");
				a.add("i am learining selenium");
				a.remove(3);
				System.out.println (a.get(2));
				
				for (int i=0; i<a.size(); i++ ) {            //can't use a.length here have to use a.size() to get the size of the array
				   System.out.println(a.get(i));
				}
				
				System.out.println("*");
				//enhanced for loops
				
				for (String val: a ) {
					System.out.println(val);
				}
				
				//item is present in the array list or not
				
				System.out.println(a.contains("selenium"));    
				//key word is contains. it only returns in boolean, can only be used if you are using array list
				
				//converting an array to arraylist
				//String [] name = {"rahul", "shetty", "mimoo"};
				//List <String> nameArrayList = Arrays.asList(name);
				
	}

}
