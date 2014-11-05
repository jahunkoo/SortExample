package sort;

/**
 * (오름차순 기준)
 * 0. 특정 인덱스를 기준으로 왼쪽이 정렬된 부분.
 * 1. 두번째 인덱스부터 정렬을 시작한다.(이 값을 tmp에 저장)
 * 2. 바로 왼쪽의 값과 비교하여 tmp값이 작다면, 오른쪽 인덱스에 왼쪽 값을 넣어준다.(값을 한칸 옆으로 이동) 
 * 	{1,2,5,[4],3} 
 * 	{1,2,5, 5 ,3}
 * 	{1,2,4, 5 ,3}
 * 3. 삽입될 자리에  tmp값을 넣는다.
 * @author jahunkoo
 *
 * @param <T>
 */
public class InsertionSort<T> implements SortIF<T> {

	@Override
	public T sort(T data, boolean isAscending) {
		int[] dataArr = (int[]) data;
		
		for(int i=1;i<dataArr.length;i++){
			
			int tmp = dataArr[i];
			int prevIndex = i-1;
			
			if(isAscending){
				while( prevIndex>=0 && dataArr[prevIndex]>tmp ){
					dataArr[prevIndex+1] = dataArr[prevIndex];
					prevIndex--;
				}	
			}else{
				while( prevIndex>=0 && dataArr[prevIndex]<tmp ){
					dataArr[prevIndex+1] = dataArr[prevIndex];
					prevIndex--;
				}
			}
			
			dataArr[prevIndex+1] = tmp;
		}
		
		
		return (T) dataArr;
	}

}
