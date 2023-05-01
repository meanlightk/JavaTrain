package t2023501.test03;

public class Account {

	private String name;
	private String no;
	private long balance;

	// --- 생성자 ---//
	Account(String n, String num, long z) {
		name = n;
		no = num;
		balance = z;
	}

	String getName() {
		return name;
	}

	String getNo() {
		return no;
	}

	long getBalance() {
		return balance;
	}

	void deposite(long k) { 
		balance += k;
	}

	void withdraw(long k) { 
		balance -= k;
	}
}
