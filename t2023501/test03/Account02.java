package t2023501.test03;

// 은행 계좌 클래스 (ver.2)
import t2023501.test02.Day;

public class Account02 {

	private String name; // 계좌 명의
	private String no; // 계좌 번호
	private long balance; // 예금 잔고
	private Day openDay; // 계좌 개설일

	// --- 생성자 ---//
	public Account02(String n, String num, long z, Day d) {
		name = n; // 계좌 명의
		no = num; // 계좌 번호
		balance = z; // 예금 잔고
		openDay = new Day(d); // 계좌 개설일
	}

	// --- 계좌 명의 확인 ---//
	public String getName() {
		return name;
	}

	// --- 계좌 번호 확인 ---//
	public String getNo() {
		return no;
	}

	// --- 예금 잔고 확인 ---//
	public long getBalance() {
		return balance;
	}

	//---계좌 개설일 확인---//
	public Day getOpenday() {
		return new Day(openDay);
	}

	// ---k원 입금---//
	void deposite(long k) {
		balance += k;
	}

	//---k원 출금---//
	void withdraw(long k) {
		balance -= k;
	}

	//---문자열 표현에 의한 계좌 기본 정보 반환---//
	public String tostString() {
		return "{" + name + ", " + no + ", " + balance + "}";
	}

}
