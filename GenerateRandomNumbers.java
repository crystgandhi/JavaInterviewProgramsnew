package september2024;

import java.util.Random;

public class GenerateRandomNumbers {
     // Generate Random number between 0-99
	public static void main(String[] args) {
		Random random = new Random(); 
		for (int i = 0; i < 5; i++) 
		{ 
		System.out.println(random.nextInt(100)); 
		}
		
		for (int i = 0; i < 5; i++) 
		{ 
		System.out.println(random.nextDouble(100));
		}

	}

}
