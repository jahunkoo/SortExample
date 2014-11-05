package sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class QuickSort<T> implements SortIF<T>{

	
	@Override
	public T sort(T data, boolean isAscending) {
		int[] dataArr = (int[]) data;
		
		//0,1,2,3    4/2	
		int middleIndex = dataArr.length/2;	//짝수개일때는 중간에서 오른쪽 인덱스를 선택 , 2개일 경우엔 오른쪽 값  
		int lastIndex = dataArr.length-1;
		
		//배열의 개수가 2개이면 그냥 swap사용
		
		//배열의 개수가 3개 이상인 경우
		//가장 먼저 맨왼쪽 값, 중앙값, 맨오른쪽 값을 정렬한다. 
		int[] subArr = new int[3];
		subArr[0] = dataArr[0];
		subArr[1] = dataArr[middleIndex];
		subArr[2] = dataArr[lastIndex];
		subArr = (int[]) new InsertionSort<>().sort(subArr, isAscending);		
		dataArr[0] = subArr[0];
		dataArr[middleIndex] = dataArr[1];
		dataArr[lastIndex] = dataArr[2];
		
		
		
		return (T) dataArr;
	}
	
	
	private int[] swap(int[] dataArr, int prevIndex, int postIndex){
		int tmp = dataArr[prevIndex];
		dataArr[prevIndex] = dataArr[postIndex];
		dataArr[postIndex] = tmp;
		return dataArr;
	}
	
	//배열과, pivot값이 들어있는 인덱스번호를 반환한다. 
	private Map<String,T> quickSort(int[] dataArr){
		Map<String,T> dataMap = new HashMap<>();
		
		
		
		dataMap.put("arr", arg1);
		return dataMap;
	}
	
	
	
	

	
}
