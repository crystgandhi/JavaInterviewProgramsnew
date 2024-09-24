package september2024;

import java.util.HashSet;

public class CommonElementsinTwoArrays {

	public static void main(String[] args) {
		char[] arr1 = { 'a', 'b', 'c', 'd' };
		char[] arr2 = { 'e', 'f', 'c', 'd' };
		HashSet<Character> set = new HashSet<>();
		for (char ch : arr1) {
			set.add(ch);
		}
		for (char ch : arr2) {
			if (set.contains(ch)) {
				System.out.print(ch + " ");
			}
		}
		System.out.println();
		

	}

}
