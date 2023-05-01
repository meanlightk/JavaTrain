package t2023501.test02;

public class Day {
	private int year = 1;
	private int month = 1;
	private int date = 1;

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
	private int getYear() {
		return year;
	}

	private int getMonth() {
		return month;
	}

	private int getDate() {
		return date;
	}

	// --- 년, 월, 일 설정 ---//

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDate(int date) {
		this.date = date;
	}

	// --- 요일 찾기 ---//
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (12 * m + 8) / 5 + date) % 7;
	}

	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;

	}

	// --- 문자열 표현 반환 ---//
	public String toString() {
		String[] wd = { "일", "월", "화", "수", "목", "금", "토" };
		return String.format("%04d년 %02d월 %02d일(%s)", year, month, date, wd[dayOfWeek()]);

	}
}
