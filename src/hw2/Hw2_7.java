package hw2;

//請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
// 使用 unicode >> A ~ F : 65 ~ 70
// >> 用 char A = 65 (後面就以此類推) 的方式

public class Hw2_7 {
	public static void main(String[] args) {
		char letter = 65;
		
		for (int i = 1 ; i <= 6 ; i++) {
			for (int j = 1 ; j <= i ; j++) {
				System.out.print(letter);
			}
			System.out.println();
			letter += 1;
		}
		
	}
}
