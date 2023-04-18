// 숫자 피라미드 표시

package t2023418;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("숫자 피라미드를 표시합니다.");
		System.out.println("단수는: ");
		int n = stdIn.nextInt();
		
		for (int i=1; i<=n; i++) {
			for(int j=1; j<= n-i; j++)
				System.out.print(' ');
			for(int j=1; j<=2*i-1; j++)
			System.out.print(i%10);  // % : i를 10으로 나눈 후, 그 나머지를 반환함
			System.out.println();
		}
	}
}
