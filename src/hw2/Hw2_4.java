package hw2;

//請設計一隻Java程式,輸出結果為以下:
//1 4 9 16 25 36 49 64 81 100

public class Hw2_4 {
	public static void main(String[] args) {
		int output = 1;
		int plus = 3;
		while (output <= 100) {
			System.out.print(output + " ");
			output += plus;
			plus += 2;
		}
	}
}
