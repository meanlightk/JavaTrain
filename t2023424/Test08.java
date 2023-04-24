// 학급 단위로 학생 수가 다른 학생

package t2023424;

import java.util.Scanner;

class Test08 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("학급 수:");
		int classNum = stdIn.nextInt();
		int [][] point = new int[classNum][];
		int totNumber = 0;				//모든 학급의 총 학생 수
		
		for(int i = 0; i < point.length; i++) {
			System.err.printf("\n%d반의 학생 수:", i + 1);
			int num = stdIn.nextInt();
			point[i] = new int[num];
		}
		
		

		}
	}