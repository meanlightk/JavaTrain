// 읽은 개수만큼 *을 표시 (5개 단위로 줄 바꿈)(방법1)

package t2023417;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
			System.out.print("몇 개의 *를 표시할까요?: ");
			int n = stdIn.nextInt();
			if(n>0) {
				for (int i=0; i < n; i++) {
					System.out.println("*****");
					int rest = n % 5;	
		   if(rest > 0) {
			    for (int i=0; i < rest; i++) {
							System.out.println("*");
							System.out.println();
						}
					}
						
						
				}
			}
	}
}