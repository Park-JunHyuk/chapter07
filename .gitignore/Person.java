package chapter07;

public class Person {
	public String name;
	
	public Person(String name) {
		this.name = name;
	}
	public boolean equals(Person a) {
		if(this.name == a.name) return true;
		else return false;
	}
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");
		System.out.println(p1.equals(new Person("ȫ�浿")));
		System.out.println(p1.equals(new Person("�ֿ���")));

	}

}
