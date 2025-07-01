package hw3;

import java.util.Scanner;

//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數

public class Hw3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int badNum = input.nextInt();
		int count = 0;
		
		for(int num = 1 ; num <= 49 ; num++) {
			if (num % 10 == badNum || num / 10 == badNum) {
				continue;
			}
			System.out.print(num + "\t");
			++ count;
			if (count % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println("一共可以選 " + count + " 個數字");
		
	}
}
