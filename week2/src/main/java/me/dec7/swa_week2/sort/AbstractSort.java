package me.dec7.swa_week2.sort;

public abstract class AbstractSort implements ISort{
	
	protected void swap(int a, int b, int[] x) {
		int temp = x[a];
		x[a] = x[b];
		x[b] = temp;
	}
	
	protected int[] copy (int[] input) {
		int[] result = new int[10];
		for (int i = 0; i < input.length; i++) {
			result[i] = input[i];
		}
		
		return result;
	}

}