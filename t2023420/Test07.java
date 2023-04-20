// 요소 수가 5이고 double형인 배열 (1.1 , 2.2 , 3.3 , 4.4 , 5.5를 대입)

package t2023420;

public class Test07 {

	public static void main(String[] args) {
		double[] a = new double[5];          //배열 선언
		
		for(int i = 0; i < a.length; i++)
			a[i] = (i+1) * 1.1;
		
		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
