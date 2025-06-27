package hw2;

//講義 P87 第二題

public class TestNineNine {
	public static void main(String[] args) {
		
		// 一:使用for迴圈 + while迴圈		
		
//		for (int j = 1 ; j <= 9 ; j++) {
//			int i = 1;
//			while (i <= 9) {
//				System.out.print(i + " * " + j + " = " + i*j + "\t");
//				i++ ;
//			}
//			System.out.println();
//		}
//		=================================================================
			
		// 二:使用for迴圈 + do while迴圈
		
//		for (int j = 1 ; j <= 9 ; j++) {
//			int i = 1;
//			do {
//				System.out.print(i + " * " + j + " = " + i*j + "\t");
//				i++ ;
//			}
//			while (i <= 9);
//			System.out.println();
//		}
		
//		=================================================================
		
		// 三:使用while迴圈 + do while迴圈
		
		int j = 1;
		do {
			int i = 1;
			do {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
				i++ ;
			} while (i <= 9);
			System.out.println();
			j++ ;
		} while (j <= 9);
	}
}

