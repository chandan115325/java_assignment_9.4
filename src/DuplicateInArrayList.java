import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*

public class DuplicateInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,num;
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>al = new ArrayList<Integer>();
		System.out.println("Enter the number of integer to be stored in ArrayList :");
		size = input.nextInt();
		 
		for(int i =0 ; i<size; i++)
		{	
			System.out.println("Enter the integer in ArrayList :");
			
			num = sc.nextInt();
			if(num%2==0)
			{
			 al.add(num);
			}
		}
			
			System.out.println(" The even integers in ArrayList :"+al);
			
			
		


	}
	}

}
*/

import java.util.*; 

public class DuplicateInArrayList { 
public static void main(String[] args) { 
List<String> list = new ArrayList<String>(); 
list.add("a"); 
list.add("b"); 
list.add("c"); 
list.add("d"); 
list.add("r"); 
list.add("2"); 
list.add("b"); 
list.add("c"); 
list.add("a"); 
list.add("a"); 
list.add("a"); 

//System.out.println("\nCount 'a' with frequency"); 
//System.out.println("a : " + Collections.frequency(list, "a")); 


System.out.println("\n Count all with frequency"); 
Set<String> uniqueSet = new HashSet<String>(list); 
for (String temp : uniqueSet) { 
//System.out.println(temp + ": " + Collections.frequency(list, temp)); 
if(Collections.frequency(list, temp)>1){ 
System.out.println(" duplicate valures are " +temp + ":"+Collections.frequency(list, temp) ); 
}else{ 
//System.out.println(temp); 
} 
} 
} 
} 