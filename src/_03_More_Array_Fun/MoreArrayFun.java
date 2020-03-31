package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
	String[] names = {"Matt", "John", "Kyle", "Jack", "Max"};	
		
		//printString(names);
	//printReverse(names);
//printSkip(names);
	ranOrder(names);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	
	static void printString(String[] strings){
		for(int i = 0; i < strings.length; i++){
			System.out.println(strings[i]);
		}
		
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	static void printReverse(String[] string){
		for(int i = string.length-1; i >= 0;i--){
			System.out.println(string[i]);
		}
		
	}
	
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	static void printSkip(String[] strings){
		for(int i = 0; i < strings.length; i++){
			if(i%2 == 0){
			System.out.println(strings[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void ranOrder(String[] strings){
		
		for(int i = 0; i<strings.length; i ++){
			Random ran = new Random();
			int ranNum = ran.nextInt(strings.length-1);
			i = ranNum;
			System.out.println(strings[i]);
			
		}
	}

}
