package t2023501.test04;

import java.util.Scanner;

import t2023501.test02.Day;
import t2023501.test03.Account;

// 은행 계좌 클래스 (ver.2) 사용 (방법2)
public class AccountTester02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("계좌 정보를 입력하세요.");
		System.out.println("명     의: ");
		String name = stdIn.next();
		System.out.println("번     호: ");
		String no = stdIn.next();
		System.out.println("잔     고: ");
		long balance = stdIn.nextLong();

		System.out.println("개설  연도: ");
		int y = stdIn.nextInt();

		System.out.println("개설   월: ");
		int m = stdIn.nextInt();

		System.out.println("개설   일: ");
		int d = stdIn.nextInt();

		Account a = new Account(name, no, balance, new Day(y, m, d));

		System.out.println("계좌 기본 정보:" + a);
		System.out.println("개설일:" + a.getOpneDay().toString());
	}

}
