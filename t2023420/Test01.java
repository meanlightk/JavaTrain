// int형 변화에 실숫값을 대입

package t2023420;

public class Test01 {

	public static void main(String[] args) {
		int a;
		
		a = (int) 10.0;
		// a = 10.0;           //오류
		
		System.out.println("a = " + a);
	}

}
