package hw3;
import java.util.Arrays;
import java.util.Scanner;

//• 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形,如圖示結果

// 三角形的話, 小的兩邊相加必定要大於第3邊

public class Hw3_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] tri = new double[3];
		
		System.out.println("Input num");
		tri[0] = input.nextDouble();
		tri[1] = input.nextDouble();
		tri[2] = input.nextDouble();
		
		Arrays.sort(tri);
		
		if (tri[0] + tri[1] <= tri[2]) {
			System.out.println("不成三角形");
		} else if (tri[0] == tri[1] || tri[1] == tri[2]){
			if (tri[0] == tri[2]) {
				System.out.println("此為正三角形");
			} else {
				if ((Math.pow(tri[0], 2) + Math.pow(tri[1], 2)) == Math.pow(tri[2], 2)) {
					System.out.println("此為等腰直角三角形");
				} else System.out.println("此為等腰三角形");
			}
		} else {
			if ((Math.pow(tri[0], 2) + Math.pow(tri[1], 2)) == Math.pow(tri[2], 2)) {
				System.out.println("此為直角三角形");
			} else	System.out.println("此為其他三角形");
		}		
	}
}
