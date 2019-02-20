
public class BubbleSort implements SortingAlgorithm{

	public BubbleSort() {
		
	}

	@Override
	public void sort(int[] a) {
		boolean swapped = true;
		for(int i = 0; i < a.length - 1 && swapped; i++) {
			swapped = false;
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					swap(a,j,j+1);
					swapped = true;
				}
			}
			
		}
	}
	
	private void swap(int a[], int i, int j){
		int temp = a[i];
		a[i]= a[j];
		a[j]= temp;
	}

}
