package hw3;
import java.util.Scanner;

// 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
// 對則顯示正確訊息，如圖示結果：

public class Hw3_2{
	
	// 設定亂數
	public static int SetRandom(){
		//         轉換為整數       0 ~ 10 共 11 個整數  最小為 0, + 0 可省略
		int random = (int) (Math.random() * 11);
		return random;
	}
	
	// 猜錯時給提示(但猜到沒別的好猜時會有額外提示XD)
	public static void Hint(int guess, int min, int max){
		System.out.println("猜錯囉, 在 " + (min + 1) + " ~ " + (max - 1) + " 之內(含), 再輸入一次~");
		if ((min + 1) == (max - 1)) {
			System.out.println("(但也沒別的數字好猜了啦...XD)");
		}
	}
	
	// 取得合理的 guess 值 (不合理的話就要再輸入一次)
	public static int Input() {
		while (true) {
			Scanner input = new Scanner(System.in);
			if(input.hasNextInt()) {
				int guess = input.nextInt();
				return guess;
			}
			if(! input.hasNextInt()) {
				System.out.println("不要亂輸入!! 你是覺得索引值是從1開始的那類人是不是!! 再輸入一次!!!" );
				continue;
			}
		}
	}

//	===========================  我是分隔線   ==============================================
	
	public static void main(String[] args) {
		int max = 11, min = -1, count = 1, haiYa = 0; // 亂猜就會嗨呀一次XD	
		
		int random = SetRandom();
		System.out.println("請輸入一個 0 ~ 10 之間的整數: ");
		
		int guess = Input();

		while (guess != random) {
			if (guess <= min || guess >= max) {
				System.out.println("不要輸入範圍外的數字!! 你是覺得索引值是從1開始的那類人是不是!! 是 " + (min + 1) + " ~ " + (max - 1) + " 之內 (皆包含) 的數字!!!");
				++haiYa;
			} else if (guess > random){
				max = guess;
				Hint(guess, min, max);
			} else {
				min = guess;
				Hint(guess, min, max);
			}
			guess = Input();
			++count;
		}
		
		System.out.print("賓果! 答案就是 " + random + " , 你一共猜了 " + count + " 次");
		if (haiYa != 0) {
			System.out.print(" (包含你亂猜的次數 = = )。");
		} else {
			System.out.print("。");
		}
	}
}