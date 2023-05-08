package t2023501.test02;

//날짜 클래스 Day(ver.1)
public class Day {
	private int year = 1;	// 년 
	private int month = 1;	// 월
	private int date = 1;	// 일

	// --- 생성자 ---//
	public Day() {
	}

	public Day(int year) {
		this.year = year;
	}

	public Day(int year, int month) {
		this(year);
		this.month = month;
	}

	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;
	}

	public Day(Day d) {
		this(d.year, d.month, d.date);
	}

	// --- 년, 월, 일 불러오기 ---//
	private int getYear() {			// 년 불러오기
		return year;
	}

	private int getMonth() {		// 월 불러오기
		return month;
	}

	private int getDate() {			// 일 불러오기
		return date;
	}

	// --- 년, 월, 일 설정 ---//

	public void setYear(int year) {		// 년 설정
		this.year = year;
	}

	public void setMonth(int month) {	// 월 설정
		this.month = month;
	}

	public void setDate(int date) {		// 일 설정
		this.date = date;
	}

	// --- 요일 찾기 ---//
	public int dayOfWeek() {			// 년,월,일 설정
		int y = year;		// 년
		int m = month;		// 월
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (12 * m + 8) / 5 + date) % 7;
	}

	//--- 날짜 d와 같은가? ---//
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;

	}

	// --- 문자열 표현 반환 ---//
	public String toString() {
		String[] wd = { "일", "월", "화", "수", "목", "금", "토" };
		return String.format("%04d년 %02d월 %02d일(%s)", year, month, date, wd[dayOfWeek()]);

	}

	public void set(int i, int j, int k) {
		
	}
}
