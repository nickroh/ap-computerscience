import java.util.*;

public class SortTest
{
	public static void main(String[] args) 
	{
		Random rand = new Random(10);
		int size;
		int[] array;
		int[] dup;
		if(args.length == 0)
			size = 10;
		else
			size = Integer.parseInt(args[0]);

		array = new int[size];
		dup = new int[size];
		randomInitialize(array, rand);

		// System.out.println("Section Sort...");
		// duplicateArray(array, dup);
		// printArray(dup);
		// SelectionSort.reverse_sort(dup);
		// enter();
		// printArray(dup);
		// System.out.println();

		// System.out.println("Insertion Sort...");
		// duplicateArray(array, dup);
		// printArray(dup);
		// InsertionSort.sort(dup);
		// enter();
		// printArray(dup);
		// System.out.println();

		// System.out.println("Merge Sort...");
		// duplicateArray(array, dup);
		// printArray(dup);
		// MergeSort.sort(dup);
		// printArray(dup);
		// System.out.println();

		System.out.println("Quick Sort...");
		duplicateArray(array, dup);
		printArray(dup);
		QuickSort.sort(dup);
		printArray(dup);
		System.out.println();
/*
		System.out.println("Heap Sort...");
		duplicateArray(array, dup);
		printArray(dup);
		HeapSort0.sort(dup);
		printArray(dup);
		System.out.println();

		System.out.println("Radix Sort...");
		duplicateArray(array, dup);
		printArray(dup);
		RadixSort.sort(dup);
		printArray(dup);
		System.out.println();
*/
	}

	public static void duplicateArray(int[] array, int[] dup)
	{
		int n = array.length;

		for(int i = 0; i < n; i++)
		{
			dup[i] = array[i];
		}
	}

	public static void randomInitialize(int[] a, Random r)
	{
		for(int i = 0; i < a.length; i++)
			a[i] = r.nextInt(100);
	}

	public static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.print("[" + i + "," + a[i] + "] ");
			if((i + 1) % 10 == 0) System.out.println();
		}
	}
	
	private static void enter(){
		System.out.println();
	}
}
