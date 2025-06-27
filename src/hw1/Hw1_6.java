package hw1;

public class Hw1_6 {
	public static void main(String[] args) {
		System.out.println(5 + 5);
		//這邊就只是數字的相加, 故得出來的結果為10
		
		System.out.println(5 + '5');
		//這邊會是數字 5 + " 5 的 unicode 的數值", 而 5 的 unicode 為 0035 (16進制), 轉換為 10 進制的數值則為 3 * 16 + 5 = 53 
		//故 5 + 53 = 58 → 得出來的結果就會是 58 了
		
		System.out.println(5 + "5");
		//因為這邊的 " 5 " 被視為 " 字串的 5 ", 故這邊不做數字的相加, 而是作為 "字串的相接"
		//因此, 得出來的是 55 → 但這個 55 是字串的 55, 不是數字的 55 !!!
	}
}
