package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
			String[] why = {"what", "is", "no", "point", "of this"};
		//2. print the third element in the array
			System.out.println(why[2]);
		//3. set the third element to a different value
			why[2]="the";
		//4. print the third element again
			System.out.println(why[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<why.length; i++) {
			System.out.println(why[i]);
		}
		
		//6. make an array of 50 integers
			int[] fiftyNumbers= new int[50];
			Random r = new Random();
			int random;
		//7. use a for loop to make every value of the integer array a random number
			for(int j = 0; j<fiftyNumbers.length; j++) {
				random=r.nextInt();
				fiftyNumbers[j]=random;
			}
		//8. without printing the entire array, print only the smallest number in the array
			int smallest = fiftyNumbers[0];
			for(int k = 0; k<fiftyNumbers.length; k++) {
				if(fiftyNumbers[k]<smallest) {
					smallest=fiftyNumbers[k];
				}
			}
			System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
			for(int l = 0; l<fiftyNumbers.length; l++) {
				System.out.println(fiftyNumbers[l]);
			}
		//10. print the largest number in the array.
			int largest = fiftyNumbers[0];
			for(int m = 0; m<fiftyNumbers.length; m++) {
				if(fiftyNumbers[m]>largest) {
					largest=fiftyNumbers[m];
				}
			}
			System.out.println(largest);
	}
}
