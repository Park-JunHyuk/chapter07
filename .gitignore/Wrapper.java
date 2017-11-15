package chapter07;

public class Wrapper {

	public static void main(String[] args) {
		short a1=1;
		Short a2=1;
		int b1=2;
		Integer b2=2;
		long c1=3l;
		Long c2=3l;
		double d1=4.0;
		Double d2=4.0;
		float e1=0.5f;
		Float e2=0.5f;
		byte f1=6;
		Byte f2=6;
		char g1='g';
		Character g2='g';
		boolean h1=true;
		Boolean h2=true;
		
		System.out.printf("%d %d\n",a1,a2);
		System.out.printf("%d %d\n",b1,b2);
		System.out.printf("%d %d\n",c1,c2);
		System.out.printf("%g %g\n",d1,d2);
		System.out.printf("%f %f\n",e1,e2);
		System.out.printf("%d %d\n",f1,f2);
		System.out.printf("%c %c\n",g1,g2);
		System.out.printf("%b %b\n",h1,h2);
	}

}
