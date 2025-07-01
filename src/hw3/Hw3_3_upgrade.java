package hw3;

import java.util.Scanner;

// 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
// 厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
// 的號碼與總數
// 輸入不要的數字後，直接亂數印出6個號碼且不得重複

public class Hw3_3_upgrade {
	
	
	public static int Input() {
		Scanner input = new Scanner(System.in);
		while (true) {
			if(input.hasNextInt()) {
				int badNum = input.nextInt();
				if(badNum < 0 || badNum >9) {
					System.out.println("不要亂輸入!! 你這樣能中獎才有鬼!!! 重 key 一次!!!" );
					continue;
				}
				return badNum;
			} else {
				System.out.println("不要亂輸入!! 你這樣能中獎才有鬼!!! 重 key 一次!!!" );
				continue;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("請輸入不希望出現的數字");
		int badNum = Input();
		
		int[] choose = new int[6];
		
		again:
		for (int i = 0 ; i < 6 ; i++) {
			int randomNum = (int) (Math.random() * 49) + 1;
			
			if (randomNum % 10 == badNum || randomNum / 10 == badNum) {
				--i ;
				continue;
			}
			for (int j = i-1 ; j >= 0 ; j--) {
				if (randomNum == choose[j]) {
					--i ;
					continue again;
				}
			}
			choose[i] = randomNum;
			System.out.print(choose[i] + "\t");
		}
	}
}