package com.xworkz.technicalPrograms;

public class RotationProgram {
	
	
	public static void rotateRight(int[] arr, int positions) {
        int length = arr.length;
        // Calculate the effective number of positions for rotation
        positions = positions % length;

        // Create a temporary array to store rotated elements
        int[] temp = new int[length];

        // Copy elements from the original array to the temp array with rotation
        for (int i = 0; i < length; i++) {
            temp[(i + positions) % length] = arr[i];
        }

        // Copy elements back from temp array to the original array
        System.arraycopy(temp, 0, arr, 0, length);
    }

    public static void main(String[] args) {
        int[] originalArray = {6, 7, 8, 9, 10};
        int positionsToRotate = 2;

        System.out.print("Original array:");
        for (int num : originalArray) {
            System.out.println(num + " ");
        }

        rotateRight(originalArray, positionsToRotate);

        System.out.print("Array after rotating to the right by " + positionsToRotate + " positions:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
    }
}


