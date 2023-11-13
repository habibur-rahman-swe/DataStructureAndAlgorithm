package com.controller.sorting;

import java.util.Arrays;

import com.chapter10.sorting.MergeSort;

public class Sort {
	public int[] arr;
	
	public static void main(String[] args) {
		Sort m = new Sort();
		
		m.arr = new int[] { 1, 9, 2, 3, 6, 5, 4, 1, 10 };
		m.print();
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(m.arr, 0, m.arr.length-1);
		
		m.print();
	}

	public void print() {
		StringBuilder res = new StringBuilder();
		Arrays.stream(arr).forEach(x -> res.append(x).append(" "));

		System.out.println(res);
	}
}
