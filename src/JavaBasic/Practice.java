package JavaBasic;

public class Practice {

	public static void main(String[] args) {
		Practice pc = new Practice();
		// int newnum = pc.add(567, 767, 0);//earlier i called through object because
		// add method was non static but after that i made it static so that i can call
		// it directly
		int newnum = add(45, 56, 0);
		if (newnum % 2 != 0) {
			System.out.println("Odd" + newnum);
		} else {
			System.out.println("Even number:" + newnum);
		}
		pc.multiply(4, 5.7, 1);

		int x, y, z = 0;
		x = 400;
		y = 956;

		z = x + y;
		System.out.println(z);
	}

	public static int add(int a, int b, int c) {
		c = a + b;
		System.out.println(c);
		return c;
	}

	public double multiply(int d, double e, double f) {
		f = d * e;
		System.out.println(f);
       return f;
	}

}
