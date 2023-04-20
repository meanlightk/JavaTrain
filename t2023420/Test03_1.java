// 0.0부터 1.0까지 0.001 단위로 증가시키며 제곱 표시 (반복을 float형으로 제어)

package t2023420;

public class Test03_1 {

	public static void main(String[] args) {
		System.out.println("  x       x의 제곱");
		System.out.println("--------------------");
		
		for(float x = 0.0F; x <= 1.0F; x += 0.001F)
			System.out.printf("%5.3f   %10.7f\n", x, x*x);
	}

}
