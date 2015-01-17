package sort20150117;

import java.util.Arrays;

public class SortExercise {
 
	/**
	 *	min값 찾아서 맨 앞으로
	 *	http://en.wikipedia.org/wiki/Selection_sort
	 */
	public int[] selectionSort(int[] data){
		//{1,5,2,7,3,9,4,3,6,10}
		// i j 
		int tmp, minIndex;
		
		for(int i=0;i<data.length;i++){
			minIndex = i;
			for(int j=i+1;j<data.length;j++){ //min값 찾기
				if(data[j]<data[minIndex]){
					minIndex = j;
				}
			}
			
			if(minIndex != i){ //swap
				tmp = data[minIndex];
				data[minIndex] = data[i];
				data[i] = tmp;
			}			
		}
		return data;
	}
	
	
	/**
	 * 정렬된 배열을 늘려나간다는 개념  
	 * @param data
	 * @return
	 */
	public int[] insertionSort(int[] data){
		
		int i,j, tmp;
		int iMin;
		int n = data.length;
		
		for (j = 0; j < n-1; j++) {
		    iMin = j;
		    
		    for ( i = j+1; i < n; i++) {
		        if (data[i] < data[iMin]) {
		            iMin = i;
		        }
		    }
		 
		    if(iMin != j) {
		    	tmp = data[j];
		    	data[j] = data[iMin];
		    	data[iMin] = tmp;
		    }
		 
		}
		
		return data;
	}
	
	
	public int[] bubbleSort(int[] data){
		int arrLength = data.length; 
		int tmp;
		for(int i=0;i<arrLength;i++){
			
			for(int j=0;j<arrLength-1;j++){
				if(data[j]>data[j+1]){
					tmp = data[j+1];
					data[j+1] = data[j];
					data[j] = tmp;
				}
				System.out.println(Arrays.toString(data));
			}
		}
		
		return data;
	}
	
}
