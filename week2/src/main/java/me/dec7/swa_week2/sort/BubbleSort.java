package me.dec7.swa_week2.sort;


public class BubbleSort extends AbstractSort {
	
	public int[] sort(int[] input) {
		
		return bubblesort(input);
	}

	private int[] bubblesort(int[] input) {
		int[] result = copy(input);
		int count = result.length-1;
		
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < (count - i); j++) { // 비교를 하나씩 감소 시키기 위해서 N-i 번 째 까지 해줌
				if (result[j] > result[j + 1]) {
					swap(j, j+1, result);
				}
			}
		}
		
		return result;
	}
}
