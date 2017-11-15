package chapter07;
import java.util.Calendar;

public class CalendarToday {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int week = today.get(Calendar.DAY_OF_WEEK);
		String change = "";
		switch (week) {
		case 1 : change = "일"; break;
		case 2 : change = "월"; break;
		case 3 : change = "화"; break;
		case 4 : change = "수"; break;
		case 5 : change = "목"; break;
		case 6 : change = "금"; break;
		case 7 : change = "토"; break;
		}
		
		System.out.println("오늘은"+today.get(Calendar.YEAR)+"년"+today.get(Calendar.MONTH)+"월"+today.get(Calendar.DATE)+"일 "+change+"요일입니다.");
		System.out.println("이 달의 "+Calendar.DAY_OF_WEEK_IN_MONTH+"번째 " +change+"요일 입니다.");
		System.out.println("이 달의 "+Calendar.WEEK_OF_MONTH+"번째 주입니다.");
		System.out.println("이 달의 "+Calendar.DAY_OF_YEAR+"번째 주입니다.");
		System.out.println("이 달의 "+Calendar.WEEK_OF_YEAR+"번째 주입니다.");
	}

}
