import java.util.ArrayList;
import java.util.Arrays;

public class arrayconcepts {

	public static void main(String[] args) {
		commonFromArrays();
//		sumOfEvenNum();
//		sumOfoddNum();
//		sumOftwoDigitNum();
//		countEvenNum();
		// 1. With new keyword
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		System.out.println(a[2]);
		// System.out.println(a[4]);//ArrayIndexOutOfBoundsException
		// System.out.println(a[-1]);
		System.out.println(a.length);
		int hi = a.length - 1;
		int li = 0;
		System.out.println(hi);
		// print all the value from the array
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);

			// print all the value from the array without for loop
			System.out.println(Arrays.toString(a));

		}

		// double array
		double d[] = new double[4];
	}

	public static void countEvenNum() {
		int arr[] = { 3, 5, 6, 8, 9, 65, 12, 22, 34, 16, 17, 49 };
		int counteven = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				counteven++;
			}
		}
		System.out.println("Count of Even::" + counteven);

	}

	public static void sumOftwoDigitNum() {
		int arr[] = { 3, 5, 6, 8, 9, 65, 12, 22, 34, 16, 17, 49 };
		int twodigitsum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 9 && arr[i] < 100) {
				twodigitsum = twodigitsum + arr[i];
			}
		}
		System.out.println("Sum of two digit no::" + twodigitsum);

	}

	public static void sumOfoddNum() {
		int arr[] = { 3, 5, 6, 8, 9, 65, 12, 22, 34, 16, 17, 49 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println("Sum of even no::" + sum);
	}

	public static void sumOfEvenNum() {
		int arr[] = { 3, 5, 6, 8, 9, 65, 12, 22, 34, 16, 17, 49 };
		int max = arr[0], min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}

//			if(arr[i]%2==0) {
//				sum=sum+arr[i];
		}
		System.out.println("Max and min::" + max + "::" + min);
	}

	public static boolean commonFromArrays() {
		boolean flag=false;
		String str1[] = { "Java", "Python", "php" };
		//String str2[] = { "Rust", ".Net", "Java" };
		String str2[] = { "Java", "Python", "php" };
		Arrays.equals(str1, str2);
		System.out.println(Arrays.equals(str1, str2)+" these arrays are equal");
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i] == str2[j]) {
					   
				}
			}
		}
		arrayconcepts ar=new  arrayconcepts();
		ar.deleteAndAdd();
		return flag;
	}

	public void deleteAndAdd() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Rust");
		list.add("php");
		System.out.println(list);
		String str1[] = new String[3];
		list.toArray(str1);
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}

	}

}
