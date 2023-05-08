package t2023508;

// 직각 이등변 삼각형 클래스군의 테스트 프로그램
import java.util.Scanner;



public class TriangleTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("삼각형의 개수:");
		int no = stdIn.nextInt();
		AbstTriangle[] p = new AbstTriangle[no];
		
		for (int i = 0; i < no; i++) {
			int type;
			do {
				System.out.println((i+1) + "번의 삼각형 종류 (1..좌하 직각 / 2. 좌상 직각" + "/3..우하 직각/ 4..우상 직각) : ");
				
				type = stdIn.nextInt();
			} while(type < 1 || type > 4);
			
			System.out.println("길이:");
			int len = stdIn.nextInt();
			p[i] = (type == 1) ? new TriangleLB(len) :
				   (type == 2) ? new TriangleLU(len) :
				   (type == 3) ? new TriangleRB(len) :
					       		 new TriangleRU(len);
							
		}
		for(AbstTriangle s : p) {
			s.print();
			System.out.println();
		}

	}

}
