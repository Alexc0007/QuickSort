import java.util.Scanner;
import java.util.*;

/**
 * This class will demonstrate QuickSort on a different variations
 * the difference will be - the selected partition
 * we will count the recursion steps while selecting different partitions and see the results
 * @author Alexc007
 *
 */

public class QuickSort 
{
	public static int rec_counter = 0; //will count the recursion steps that Quicksort does
	
	public static void main(String[] args)
	{
		rec_counter = 0;
		Scanner scan = new Scanner(System.in);
		int arrLength; //will define the array length we will work on
		int pos; //will serve as k - the position value
		
		System.out.println("please insert Array Length");
		arrLength = scan.nextInt(); //arrLength will get the Array length from the user
		int[] a = new int[arrLength]; //create a new array
		for(int i=0 ;i<a.length ; i++)//insert values to a
		{
			a[i] = i;
		}
		Methods.shuffle(a); //shuffle the a array
		
		System.out.println("please enter the value of k:");
		System.out.println("for k= m/2 enter: 2");
		System.out.println("for k = m/4 enter: 4");
		System.out.println("for k = m/8 enter: 8");
		System.out.println("for k = 1 enter: 1");
		pos = scan.nextInt();
		
		Methods.quickSort(a, 1, a.length-1, pos);
		
		System.out.println("the number of recursion calls made by Quick-Sort is:" + rec_counter);
		
	}
}

