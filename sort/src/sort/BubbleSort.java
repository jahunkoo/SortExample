package sort;


public class BubbleSort<T> implements SortIF<T>{


	@Override
	public T sort(T data, boolean isAscending) {
		int[] dataArr = (int[]) data;
		int lastIndex = dataArr.length-1; 
		
		for(int i=0;i<lastIndex;){
			
			for(int j=0;j<lastIndex;j++){
				if(isAscending){
					if(dataArr[j]>dataArr[j+1]){
						int tmp = dataArr[j];
						dataArr[j] = dataArr[j+1];
						dataArr[j+1] = tmp;
					}
				}else{
					if(dataArr[j]<dataArr[j+1]){
						int tmp = dataArr[j];
						dataArr[j] = dataArr[j+1];
						dataArr[j+1] = tmp;
					}
				}
			}
			
			lastIndex--;
			if(lastIndex == 1) break;
		}
		
		
		return (T) dataArr;
	}

	
	
}
