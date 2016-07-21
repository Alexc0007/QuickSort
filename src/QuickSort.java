import java.util.Scanner;
import java.util.*;

/**
 * @author Alex Cherniak & Yoav Diamant
 * 
 * This class will demonstrate QuickSort on a different variations
 * the difference will be - the selected partition
 * we will count the recursion steps while selecting different partitions and see the results
 * 
 *
 *instructions:
 *as you run the program , the first step is to insert array length - the program will fill the array with
 *different number and shuffle them so array wouldn't be sorted after it was created
 *
 *second step: enter K modifier - following the instructions on the screen
 ****WARNING: not following the instructions will lead to fatal results which i don't recommend***
 *
 *
 */


/**
 * NOTE: due to a small problem with the Random Class - the random part of the program is played by
 * the shuffling that is made to the array
 */

/**
 * ANSWER to B:
 * based on the results we can conclude on this experiment - the Quick-Sort is making about 2n recursion calls
 * when it's sorting an array of n length in the worst case
 * and nlgn number of recursions in the best case
 * 
 * we can see that selecting the sub array will affect the results of the Quick-Sort
 * when k = 1 we will get the worst case and it will cause O(n^2) runtime
 * when k = m/2 we will get the best case and it will cause O(nlgn) runtime
 * when k = m/4 we will get O(n*lg4(n)) runtime
 * when k = m/8 we will get O(n*lg8(n)) runtime
 */
public class QuickSort 
{
	public static int rec_counter = 0; //will count the recursion steps that Quicksort does
	
	public static void main(String[] args)
	{
		rec_counter = 0;
		Scanner scan = new Scanner(System.in);
		int arrLength; //will define the array length we will work on
		double pos; //will serve as k - the position value
		
		System.out.println("please insert Array Length");
		arrLength = scan.nextInt(); //arrLength will get the Array length from the user
		int[] a = new int[arrLength]; //create a new array
		for(int i=0 ;i<a.length ; i++)//insert values to a
		{
			a[i] = i;
		}
		Methods.shuffle(a); //shuffle the a array
		System.out.println("the array before QuickSort is: \n");
		for(int i=0 ;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println(" \nplease enter the value of k:");
		System.out.println("for k= m/2 enter: 2");
		System.out.println("for k = m/4 enter: 4");
		System.out.println("for k = m/8 enter: 8");
		System.out.println("for k = 1 enter: 1");
		pos = scan.nextDouble();
		
		Methods.quickSort(a, 0, a.length-1, pos);
		System.out.println("\nthe array after QuickSort is: \n");
		for(int i=0 ;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println(" \n the number of recursion calls made by Quick-Sort is:" + rec_counter);
		
	}
}

