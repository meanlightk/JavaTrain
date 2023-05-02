package t2023501.test03;

// 은행 계좌 클래스(ver.1)
public class Account {

	private String name; // 계좌 명의
	private String no; // 계좌 번호
	private long balance; // 예금 잔고
	private String Day;

	// --- 생성자 ---//
	Account(String n, String num, long z) {
		name = n; // 계좌 명의
		no = num; // 계좌 번호
		balance = z; // 예금 잔고
	}

//--- 계좌 명의 확인 ---//
	String getName() {
		return name;
	}

//--- 계좌 번호 확인 ---//
	String getNo() {
		return no;
	}

//--- 예금 잔고 확인 ---//
	long getBalance() {
		return balance;
	}

//--- k원 입금 ---//
	void deposite(long k) {
		balance += k;
	}

//--- k원 출금 ---//
	void withdraw(long k) {
		balance -= k;

	}
}
