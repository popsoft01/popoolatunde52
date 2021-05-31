package com.chaptersSeven;

public class SelectionSort {
	public static void selectionSort(double[] list) {
		for(int i = 0; i < list.length-1; i++) {
			double currentMin = list[i];
			int currentMinIndex = i;
			
			
			for(int j = 0; j<list.length-1; j++) {
				if(currentMin > list[j]) {
					currentMin = list[j];
				currentMinIndex = j;
				}
			}
			if(currentMinIndex != 0) {
				list[currentMinIndex] = i;
				list[i] = currentMin;
		}
		
		
		}
}
	public static void main(String...args) {
		double[] arrays = {5,4,6,2,1,6,7};
		
		selectionSort(arrays);
	}
}

