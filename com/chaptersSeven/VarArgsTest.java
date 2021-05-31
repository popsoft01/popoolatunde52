package com.chaptersSeven;

import java.util.Arrays;

public class VarArgsTest {
	public static double varLength(double...numbers) {
		double sumNumber = 0.0;
		for(int i =0; i< numbers.length;i++) {
			sumNumber += numbers[i];
		}
		return sumNumber/numbers.length;
	}


//	public static void collection(Arraylist<String> item) {
//		item.add("love","boy");
//		item.add("bessie","frank");
//		System.out.print(Arrays.toString(item));
//	}

}
