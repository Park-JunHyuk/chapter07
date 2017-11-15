package chapter07;
import java.util.*;

public class Canlendar {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		
		System.out.print("�� : ");
		int year = n.nextInt();
		System.out.print("�� : ");
		int month = n.nextInt();
		System.out.print("�� : ");
		int day = n.nextInt();
		
		Calendar w = new GregorianCalendar(year, month-1, day);
		String[] week = { "��", "��", "ȭ", "��", "��", "��", "��" };
		System.out.println("" + week[w.get(Calendar.DAY_OF_WEEK) -1] + "����");
	}

}
