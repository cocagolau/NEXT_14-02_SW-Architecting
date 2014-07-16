package me.dec7.swa_week2.sort;

public class QuickSort extends AbstractSort {

	public int[] sort(int[] input) {
		int[] result = copy(input);

		quicksort(0, result.length - 1, result);

		return result;
	}


	private void quicksort(int l, int u, int[] x) {
		if (u <= l)
			return;

		int m = l;
		for (int i = l + 1; i <= u; ++i)
			if (x[l] > x[i])
				swap(++m, i, x);

		swap(m, l, x);
		quicksort(l, m - 1, x);
		quicksort(m + 1, u, x);
	}
}
