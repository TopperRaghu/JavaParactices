package Arrayprogram;

import java.util.HashSet;
import java.util.Set;

public class CharacterArrayProgram {

	public static void charProbA() {
		String str = "NO26 Sound";
		char strnew[] = str.toCharArray();
		for (int i = 0; i < strnew.length; i++) {
			if (Character.isUpperCase(strnew[i])) {
				System.out.println(strnew[i]);
			}
			if (Character.isLowerCase(strnew[i])) {
				System.out.println(strnew[i]);
			}
			if (Character.isDigit(strnew[i])) {
				System.out.println(strnew[i]);
			}
		}
	}

	public static void removeDuplicateFromString(String str) {
		StringBuilder sb = new StringBuilder();
		char charstr[] = str.toCharArray();
		for (int i = 0; i < charstr.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < charstr.length; j++) {
				if (charstr[i] == charstr[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				sb.append(charstr[i]);
			}
		}
		System.out.println(sb);
	}

	public static void removeDuplicateFromString() {
		String str = "Java";
		char charstr[] = str.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < charstr.length; i++) {
			set.add(charstr[i]);
		}System.out.println(set);
	}

	public static void main(String[] args) {
	 removeDuplicateFromString("Raghvendra");
		removeDuplicateFromString();
//		charProbA();
//		reverseStringOnSamePlace();
//		reverseStringOnSamePlace2();
	}

	public static void reverseStringOnSamePlace2() {
		String str = "Raghvendra Ramesh Pathak";
		String breakinarray[] = str.split(" ");
		for (int i = 0; i < breakinarray.length; i++) {
			String s = breakinarray[i];
			String rev = "";
			for (int j = s.length() - 1; j >= 0; j--) {
				rev = rev + s.charAt(j);
			}
			System.out.print(rev + " ");
		}
	}

	public static void reverseStringOnSamePlace() {
		String str = "NO26 Sound";
		String strmap[] = str.split(" ");// {"NO26","Sound"}

		String onspotrev = "", rev = "";
		for (String splittedArray : strmap) {
			for (int i = splittedArray.length() - 1; i >= 0; i--) {
				rev = rev + splittedArray.charAt(i);
			}
		}
		onspotrev = onspotrev + rev + " ";
		System.out.println(onspotrev);

	}
}
