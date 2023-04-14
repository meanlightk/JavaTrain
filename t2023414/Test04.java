// 두 정수 사이의 정수를 작은 것부터 순서대로 표시
package t2023414;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
	System.out.println("정수 A:"); int a = stdIn.nextInt();	
	System.out.println("정수 B:"); int b = stdIn.nextInt();	
		if(a>b) {        // a가 b보다 크면
		 int t=a;       // 두 값을 교환
		 
		 a=b;
		 b=t;
		}
		
		do {
			System.out.println(a+"");
			a = a+1;
		} while (a<=b);
		System.out.println();
		}
	}

