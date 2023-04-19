// float형 변수와 double형 변수에 실숫값을 읽어서 표시

package t2023419;
import java.util.Scanner;

	public class Test05 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		

		System.out.println("변수 x는 float형 입니다. 변수 y는 double형입니다.");
		System.out.println("x : ");
		float x = stdIn.nextFloat();
		System.out.println("y : ");
		Double y = stdIn.nextDouble();
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
