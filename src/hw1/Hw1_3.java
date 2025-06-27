package hw1;

public class Hw1_3 {
	public static void main(String[] args) {
		int sec, min, hr, day;
		int newSec, newMin, newHr;
		
		sec = 256599;
		
		newSec = sec % 60;
		min = sec / 60;
		
		newMin = min % 60;
		hr = min / 60;
		
		newHr = hr % 24;
		day = hr / 24;
		
		System.out.println(sec + " 秒等於 " + day + " 天 " + newHr + " 小時 " + newMin + " 分鐘 " + newSec + " 秒。");
	}
}
