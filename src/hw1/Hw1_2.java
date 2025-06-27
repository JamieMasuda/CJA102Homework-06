package hw1;

public class Hw1_2 {
	public static void main(String[] args) {
		int egg = 200;
		int pack = egg / 12;
		int lastegg = egg % 12;
		
		System.out.println("共有 " + pack + " 打和 " + lastegg + " 顆蛋。");
	}
}
