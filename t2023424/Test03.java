// 3개의 정숫값에서 중간값 구하기 

package t2023424;

import java.util.Scanner;

class Test03 {

	// ---a , b , c의 중간값 반환---//
	static int Test03 (int a, int b, int c) {
		if(a >= b)
			if(b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a > c)
			return a;
		else if(b > c)
			return c;
		else
			return b;
	}

		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("정수 a: "); int a = stdIn.nextInt();
			System.out.print("정수 b: "); int b = stdIn.nextInt();
			System.out.print("정수 c: "); int c = stdIn.nextInt();
			
			
			System.out.println("중간값은 " + Test03(a, b, c) + "입니다.");
	}
	
}
