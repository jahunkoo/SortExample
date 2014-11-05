package sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class QuickSort<T> implements SortIF<T>{

	
	@Override
	public T sort(T data, boolean isAscending) {
		int[] dataArr = (int[]) data;
		
		dataArr = quickSort(dataArr, 0, dataArr.length-1);
		
		return (T) dataArr;
	}
	
	
	private int[] swap(int[] dataArr, int prevIndex, int postIndex){
		int tmp = dataArr[prevIndex];
		dataArr[prevIndex] = dataArr[postIndex];
		dataArr[postIndex] = tmp;
		return dataArr;
	}
	
	//배열과, pivot값이 들어있는 인덱스번호를 반환한다. 
	private int[] quickSort(int[] dataArr, int leftIndex, int rightIndex){

		if(leftIndex<rightIndex){
			int i = leftIndex;
			int j = rightIndex;
			int pivot = dataArr[leftIndex];	//pivot을 맨 오른쪽 값으로 세팅.
			
			while(i<j){
				//i번째와 j번째 조건을 모두 만족하면, swap 
				while(dataArr[j]>pivot)	 j--;
				while( (i<j) && dataArr[i]<=pivot ) i++;	//i가 j보다 작을 때에만 i++하게 함으로써 마지막에 i==j가 되도록 함.
				//{2,5,3}
				if(i<j) dataArr = swap(dataArr, i, j);
			}
			swap(dataArr, leftIndex, i); //이 때 i==j 인 상황.i번째 인덱스와 0번째 pivot값을 바꿔줌.
			
			quickSort(dataArr, leftIndex, i-1);
			quickSort(dataArr, i+1, rightIndex);
		}
		
		return dataArr;
	}
	
	
	//pivot을 효율적으로 결정하는 건 좀 더 고민해 보자.  
	//pivot이 배열의 가장 왼쪽값보다는 크도록, 가장 오른쪽 값보다는 작은 수가 될 수 있도록 셋팅
	//if(dataArr[i]>dataArr[j]) 	swap(dataArr, i, j);  //가장 왼쪽값이 오른쪽 값보다 작도록 함
	//if(dataArr[i]>pivot) 		swap(dataArr, i, j-1);
	//if(dataArr[j]<pivot)		swap(dataArr, j-1, j);
	
	

	
}
