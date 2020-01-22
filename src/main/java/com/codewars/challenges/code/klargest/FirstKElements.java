package com.codewars.challenges.code.klargest;

public class FirstKElements {

	public static void main(String[] args) {
		int[] arr = { 11, 45, 88, 96 };
		int k = 2;
		firstKElements(arr, k);
	}

	private static void firstKElements(int[] arr, int k) {

		int size = arr.length;

		MinHeap minHeap = new MinHeap(arr);

		for (int i = k; i < size; i++) {
			if (arr[0] > arr[i]) {
				continue;
			} else {
				arr[0] = arr[i];
				minHeap.heapify(0);
			}
		}

		for (int i = 0; i < k; i++) {
			System.out.println(arr[i]);
		}
	}

}
