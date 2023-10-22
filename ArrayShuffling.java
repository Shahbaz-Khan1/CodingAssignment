package com.assingment;

import java.util.Random;

public class ArrayShuffling {

	
	
	    public static void shuffleArray(int[] array) {
	        int n = array.length;
	        Random random = new Random();
            
	        for (int i = n - 1; i > 0; i--) {
	        	int j = random.nextInt(i+1);
	            // Swap array[i] and array[j]
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    }

	    public static void main(String[] args) {
	        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	        shuffleArray(myArray);

	        // Print the shuffled array
	        for (int element : myArray) {
	            System.out.print(element + " ");
	        }
	    }
	}


	