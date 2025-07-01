package hw3;
import java.util.Scanner;

// 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
// 對則顯示正確訊息，如圖示結果：
// 尚待防呆&改良程式碼...

public class Hw3_2{
	
	// 設定亂數
	public static int SetRandom(){
		//         轉換為整數       0 ~ 10 共 11 個整數  最小為 0, + 0 可省略
		int random = (int) (Math.random() * 11);
		return random;
	}
	
	// 
	public static void Hint(int guess, int min, int max){
		System.out.println("猜錯囉, 在 " + (min + 1) + "~" + (max - 1) + " 之內(含), 再輸入一次~");
	}

//	=====================================
	
	public static void main(String[] args) {
		int max = 11, min = -1, count = 1, haiYa = 0; // 亂猜就會嗨呀一次XD	
		
		int random = SetRandom();
		
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入 0 ~ 10 的整數: ");
		int guess = input.nextInt();
		
		while (guess != random) {
			if (guess <= min || guess >= max) {
				System.out.println("不在範圍內, 請輸入 " + (min + 1) + "~" + (max - 1) + " 之內(含)的數字");
				guess = input.nextInt();
				++count;
				++haiYa;
				continue;
			} else if (guess > random){
				max = guess;
				Hint(guess, min, max);
				guess = input.nextInt();
				++ count;
			} else {
				min = guess;
				Hint(guess, min, max);
				guess = input.nextInt();
				++ count;
			}
		}
		
		System.out.print("賓果! 答案就是 " + random + " , 你一共猜了 " + count + " 次");
		if (haiYa != 0) {
			System.out.print(" (包含你亂猜的次數 = = )。");
		} else {
			System.out.print("。");
		}
	}
}