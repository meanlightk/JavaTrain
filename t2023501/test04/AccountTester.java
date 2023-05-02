package t2023501.test04;

import t2023501.test02.Day;
import t2023501.test03.Account;

// 은행 계좌 클래스 (ver.2) 사용 (방법1)
public class AccountTester {

	public static void main(String[] args) {

		Day d = new Day(2010, 10, 15);
		Account gildong = new Account("길동", "12 5768", 100, d);

		Day p = gildong.getOpenDay();
		
		System.out.println("계좌 개설일:" + p);
		
		
		p.set(1999, 12, 31);
		
		Day q = gildong.getOpenDay();
		System.out.println("계좌 개설일:" + q);

	}

}
