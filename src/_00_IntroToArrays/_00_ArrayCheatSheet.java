package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] fruits= {"apple", "banana", "pineapple","tomato", "orange"};
		//2. print the third element in the array
//System.out.println(fruits[2]);
		//3. set the third element to a different value
 fruits[2]= "lemon";
		//4. print the third element again
		System.out.println(fruits[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i=0; i<fruits.length; i++) {
			fruits[i]= "apples";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i= 0; i<fruits.length; i++) {
		      //System.out.println(fruits[i]);
		}
		
		//7. make an array of 50 integers
int[] numbers = new int[50];
		
		//8. use a for loop to make every value of the integer array a random number

for(int i=0; i<numbers.length; i++) {
	Random r= new Random();
	int ranNum= r.nextInt(100);
	numbers[i]= ranNum;
	//System.out.println(numbers[i]);     //<------ there for step 8
}
		
		//9. without printing the entire array, print only the smallest number on the array
int smallest= numbers[0];
for(int i=1; i<numbers.length;i++) {
	if(smallest>numbers[i]) {
		smallest=numbers[i];
		
	}
}
				//System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct

//It is in the 8th step
		
		//11. print the largest number in the array.
		int largest=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(largest<numbers[i]) {
				largest=numbers[i];
			}
		}
		//System.out.println(largest);
		//12. print only the last element in the array
		System.out.println(numbers[49]);
		
	}
}
