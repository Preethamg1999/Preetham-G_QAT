/* 1. Create an List of Strings where you take n elements from user.
Reverse the order of strings entered and print it. */

import java.util.*;
public class StringList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		ArrayList<String> arr= new ArrayList<String>();
		System.out.println("Enter the no of elements in the list:");
		int n = sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr.add(sc.next());
		}
		System.out.println("String list in reverse order is");
		for(int i=arr.size()-1;i>=0;i--)
		{
			System.out.print(arr.get(i)+" ");
		}
		
	}

}
