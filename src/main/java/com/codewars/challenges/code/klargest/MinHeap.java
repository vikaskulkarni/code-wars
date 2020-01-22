package com.codewars.challenges.code.klargest;

public class MinHeap {

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	int size;
	int[] arr;

	public MinHeap(int[] arr) {
		this.size = arr.length;
		this.arr = arr;
		this.buildMinHeap();
	}

	public void heapify(int i) {
		if (i >= size / 2)
			return;

		int minimumIndex;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		minimumIndex = arr[left] < arr[i] ? left : i;

		if (right < size) {
			minimumIndex = arr[right] < arr[minimumIndex] ? right : minimumIndex;
		}

		if (minimumIndex != i) {
			swap(arr[i], arr[minimumIndex]);
			heapify(minimumIndex);
		}
	}

	private void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}

	public void buildMinHeap() {
		for (int i = size / 2 - 1; i >= 0; i++) {
			heapify(i);
		}
	}

}
