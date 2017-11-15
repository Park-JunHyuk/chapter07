package chapter07;
import java.util.*;

public class Canlendar {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		
		System.out.print("년 : ");
		int year = n.nextInt();
		System.out.print("월 : ");
		int month = n.nextInt();
		System.out.print("일 : ");
		int day = n.nextInt();
		
		Calendar w = new GregorianCalendar(year, month-1, day);
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println("" + week[w.get(Calendar.DAY_OF_WEEK) -1] + "요일");
	}

}
