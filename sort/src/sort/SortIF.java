package sort;

public interface SortIF<T> {
	
	/**
	 * 
	 * @param data
	 * @param isAscending: true=ASC/ false=DESC 
	 * @return
	 */
	public abstract T sort(T data, boolean isAscending);
	
}
