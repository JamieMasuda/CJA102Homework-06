package hw1;

public class Hw1_4 {
	public static void main(String[] args) {
		float pi = 3.1415f, r = 5.0f, area, perimeter;
		area = r * r * pi;
		perimeter = r * 2 * pi;
		
		System.out.println("半徑為 " + r + " 的圓的面積為 " + area + ", 周長為 " + perimeter + "。 (圓周率以 " + pi + " 計算)。");
		
	}
}

// 為什麼用 double 會出問題???
