package t2023502.test06;

import java.util.Scanner;

// 최솟값, 최댓값을 구하는 유틸리 클래스의 테스트 프로그램
public class MinMaxTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("x값: ");
		int x = stdIn.nextInt();
		System.out.println("y값: ");
		int y = stdIn.nextInt();
		System.out.println("z값: ");
		int z = stdIn.nextInt();
		System.out.println();
		int num = stdIn.nextInt();
		int[] a = new int[num]; // 요소 수가 num인 배열
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]:");
			a[i] = stdIn.nextInt();
		}

		System.out.printf("x, y의 최솟값은 %d입니다.\n", MinMax.min(x, y));
		System.out.printf("x, y의 최댓값은 %d입니다.\n", MinMax.min(x, y));
		System.out.printf("x, y, z의 최솟값은 %d입니다.\n", MinMax.min(x, y, z));
		System.out.printf("x, y, z의 최댓값은 %d입니다.\n", MinMax.min(x, y, z));
		System.out.printf("배열 a의 최솟값은 %d입니다.\n", MinMax.min(a));

		int xmin[] = MinMax.minIndexArray(a);
		System.out.println("인덱스는{ ");
		for (int i = 0; i < xmin.length; i++)
			System.out.print(xmin[i] + " ");
		System.out.println("}입니다.");
		System.out.printf("배열 a의 최댓값은 %d입니다.\n", MinMax.max(a));

		int xmax[] = MinMax.maxIndexArray(a);
		System.out.println("인덱스는 {");
		for (int i = 0; i < xmax.length; i++)
			System.out.print(xmax[i] + " ");
		System.out.println("}입니다.");

	}
}
