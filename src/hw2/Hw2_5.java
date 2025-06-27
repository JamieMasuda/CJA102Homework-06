package hw2;

//阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//輸出結果為阿文可以選擇的數字有哪些?總共有幾個?

public class Hw2_5 {
	public static void main(String[] args) {
		for(int num = 1 ; num <= 49 ; num++) {
			if (num % 10 == 4 || num / 10 == 4) {
				continue;
			}
			System.out.print(num + " ");
		}
	}
}

// 阿文你這樣能中獎我跟妳姓