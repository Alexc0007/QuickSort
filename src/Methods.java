import java.util.Random;

public class Methods 
{
	//Randomized-Select method
	public static int randomizedSelect(int[]a , int start , int end , int index)
	{
		int k,q;
		if(start == end)
		{
			return a[start];
		}
		q = partition(a , start , end);
		k = q-start+1;
		if(index == k) //the pivot value is the index we are looking for
		{
			return a[q];
		}
		else
		{
			if(index < k)
			{
			 	 return randomizedSelect(a , start , q-1 , index); //search from start to q-1
			}
			else
			{
				return randomizedSelect(a, q, end, index-k); //search from q+1 to end
			}
		}
			
		
	}
	
	
	//Partition method
	public static int partition(int []a , int start , int end)
	{
		int i;
		int x = a[end];
		i = start -1;
		for(int j = start ; j < end ; j++)
		{
			if(a[j] <= x)
			{
				i=i+1;
				swap(a , i , j);
			}
		}
		swap(a , i+1 , end);
		return i+1;
	}
	
	//a basic swap inside array method
	public static void swap(int[]a , int index1 , int index2)
	{
		int temp;
		temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
	
	//QuickSort method
	public static void quickSort(int[]a , int start , int end ,double indPos)
	{
		QuickSort.rec_counter++; //increase recursion counter
		int part;
		int index = (int)Math.ceil((end-start)/indPos)+start; //the index we want to find
		if(indPos != 1) //k= (m/2 or m/4 or m/8)
		{
			if(start < end)
			{
				part = randomizedSelect(a, start, end ,index );
				quickSort(a , start , part-1 , indPos);
				quickSort(a, part+1, end, indPos);
			}
		}
		else //k=1
		{
			if(start < end)
			{
				part = randomizedSelect(a, start, end , 1);
				quickSort(a , start , part-1 , 1);
				quickSort(a, part+1, end, 1);
			}
		}
		

	}
	
	//shuffle method
	public static void shuffle(int[]a)
	{
		Random rnd = new Random();
		for(int i = a.length ; i >0 ; i--)
		{
			swap(a , i-1 , rnd.nextInt(i));
		}
	}
}


