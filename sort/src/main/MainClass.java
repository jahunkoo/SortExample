package main;

import java.util.Arrays;

import sort.BubbleSort;
import sort.InsertionSort;
import sort.QuickSort;
import sort.SelectionSort;


public class MainClass {

	//public static int[] data = {4,6,8,2,1,5,3,9,10,9,10,9,11,13,14,12,22,20,28,26,21};
	public static int[] data = {4,6,8,2,1,5,3};
	public static <T> void main(String[] args) {
		
		//BubbleSort bubble = new BubbleSort<>();
		//data = (int[]) bubble.sort(data, true);
		//System.out.println(Arrays.toString(data));
		
		//SelectionSort<T> selection = new SelectionSort<>();
		//data = (int[]) selection.sort((T) data, true);
		//System.out.println(Arrays.toString(data));
		
		//InsertionSort<T> insertion = new InsertionSort<>();
		//data = (int[]) insertion.sort((T) data, false);
		//System.out.println(Arrays.toString(data));
		
		QuickSort<T> quick = new QuickSort<>();
		data = (int[]) quick.sort((T) data, false);
		System.out.println(Arrays.toString(data));
		
	}

}
