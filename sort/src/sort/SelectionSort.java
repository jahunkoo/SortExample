package sort;

public class SelectionSort<T> implements SortIF<T> {

	@Override
	public T sort(T data, boolean isAscending) {
		int[] dataArr = (int[]) data;
		int dataLength = dataArr.length;
		
		for(int i=0; i<dataLength; i++){		//가장 작은 인덱스번호를 찾고, swap
			
			int specificIndex = i;				//정렬되지 않은 것들 중 가장 앞에 위치한 인덱스로 초기화
			for(int j=i; j<dataLength; j++){	//가장 작은(큰) 값을 가진 index를 찾는다. 
				if(isAscending){
					if(dataArr[j] < dataArr[specificIndex])	specificIndex = j;
				}else{
					if(dataArr[j] > dataArr[specificIndex])	specificIndex = j;
				}
			}
			
			if(specificIndex != i){				//swap
				int tmp = dataArr[i];
				dataArr[i] = dataArr[specificIndex];
				dataArr[specificIndex] = tmp;
			}
			
		}
		
		return (T) dataArr;
	}

}
