package com.chaptersSeven;

public class PassArray {
public static void main(String...args) {
	int[][] scores = new int[3][6];
	for(int i = 0;i<scores.length;i++) {
		for(int j = 0; j<scores[i].length; j++) {
			System.out.print(scores[i][j]);
		}
		System.out.println();
	}System.out.println();
	
	scores[0] = new int[4];
	scores[1] = new int[10];
	scores[2]= new int[2];
	for(int i = 0;i<scores.length;i++) {
	for(int j = 0; j<scores[i].length; j++) {
		System.out.print(scores[i][j]);
	}
	System.out.println();
}
	
}
}
