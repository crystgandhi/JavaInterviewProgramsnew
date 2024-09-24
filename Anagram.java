package september2024;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		    String str1 = "triangle";
	        String str2 = "integral";

	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();

	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        boolean isAnagram = 
	        		Arrays.equals(arr1, arr2);
	        System.out.println(isAnagram);  
	    }

	}


