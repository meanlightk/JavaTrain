// 배열의 각 요소가 5, 4, 3, 2, 1을 대입해서 표시
package t2023420;

public class Test06 {

	public static void main(String[] args) {
		int[] a = new int[5];          //배열 선언
		
		for(int i = 0; i < a.length; i++)
			a[i] = 5 - i;
		
		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
