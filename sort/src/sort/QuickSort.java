package sort;

import java.util.Arrays;

public class QuickSort<T> implements SortIF<T>{

	
	@Override
	public T sort(T data, boolean isAscending) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//{3,2,5,4,1};
	/**
	 * start 가장 왼쪽값
	 * end 가장 오른쪽 값
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	public void sort(int[] arr, int start, int end){
		System.out.println(Arrays.toString(arr));
		
		int pivot = arr[0];
		int left = 	start+1;//인덱스 값
		int right = end;//인덱스 값
		
		if(start < end){ //배열 개수가 3개 이상일 경우
			
			while(left<right){
				System.out.println(left+" "+right);
				while(arr[left]<pivot){	//값이 피봇보다 크면 중지 
					left++;
				}
				while(arr[right]>pivot){//값이 피봇보다 작으면 중지
					right--;
				}
				
				
				int tmp = arr[left];
				arr[left] = arr[right];
				arr[right] = tmp;
				
			}
			
			if(left >= right){ //pivot값(arr[0]과 arr[right]를 바꿔준다.)
				int tmp = arr[0];
				arr[0] = arr[right];
				arr[right] = tmp;
				pivot = arr[0];
			}
			
			int[] leftArr = Arrays.copyOfRange(arr, 0, right-1);
			sort(leftArr, 0, leftArr.length-1);
			int[] rightArr = Arrays.copyOfRange(arr, left, arr.length-1);
			sort(rightArr, 0, leftArr.length-1);
		}
		
	}

	
}
