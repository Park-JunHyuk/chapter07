package chapter07;
import java.util.Calendar;

public class CalendarToday {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int week = today.get(Calendar.DAY_OF_WEEK);
		String change = "";
		switch (week) {
		case 1 : change = "��"; break;
		case 2 : change = "��"; break;
		case 3 : change = "ȭ"; break;
		case 4 : change = "��"; break;
		case 5 : change = "��"; break;
		case 6 : change = "��"; break;
		case 7 : change = "��"; break;
		}
		
		System.out.println("������"+today.get(Calendar.YEAR)+"��"+today.get(Calendar.MONTH)+"��"+today.get(Calendar.DATE)+"�� "+change+"�����Դϴ�.");
		System.out.println("�� ���� "+Calendar.DAY_OF_WEEK_IN_MONTH+"��° " +change+"���� �Դϴ�.");
		System.out.println("�� ���� "+Calendar.WEEK_OF_MONTH+"��° ���Դϴ�.");
		System.out.println("�� ���� "+Calendar.DAY_OF_YEAR+"��° ���Դϴ�.");
		System.out.println("�� ���� "+Calendar.WEEK_OF_YEAR+"��° ���Դϴ�.");
	}

}
