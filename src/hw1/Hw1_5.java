package hw1;

public class Hw1_5 {
	public static void main(String[] args) {
		int money = 150, year = 10;
		double rate = 1.02;
		double total = money;
		
		for(int i = 1 ; i <= year ; i++) {
			total *= rate;
		}
		
		System.out.println("本金為 " + money + " 萬, 年利率為 " + rate + ", " + year + " 年後本金加利息為 " + total + " 萬 (以複利計算)。");
		
	}
}
