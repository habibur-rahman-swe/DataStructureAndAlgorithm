package com.chapter10.sorting;

public class MergeSort {
	public void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int mid = l + (r - l) / 2;

			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);

			merge(arr, l, mid, r);
		}
	}

	private void merge(int[] arr, int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r - mid;

		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for (int i = l; i <= mid; i++) {
			L[i - l] = arr[i];
			
		}
		
		for (int i = mid + 1; i <= r; i++) {
			R[i - mid - 1] = arr[i];
		}
		
		int i = 0, j = 0, k = l;
		
		while (i < n1 && j < n2) {
			if (L[i] < R[j]) arr[k++] = L[i++];
			else arr[k++] = R[j++];
		}
		
		while (i < n1) {
			arr[k++] = L[i++];
		}
		while (j < n2) {
			arr[k++] = R[j++];
		}
	}
}
