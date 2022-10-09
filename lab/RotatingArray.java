package com.gl.lab;

import java.util.Scanner;

public class RotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of array:");
		int len = sc.nextInt();
		int[] a = new int[len];
		System.out.println("Enter " + len + " elements:");
		for (int i = 0; i < len; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Press 1 to rotate left\nPress 2 to rotate right");
		int rotation = sc.nextInt();
		System.out.println("Enter the index from which array is to be rotated:");
		int key = sc.nextInt();
		sc.close();
		if (rotation == 1)
			leftRotate(a, len, key);
		else
			rightRotate(a, len, key);
		System.out.println("Rotated Array:");
		printArray(a, len);
	}

	public static void leftRotate(int[] a, int len, int key) {
		while (key > 0) {
			int temp = a[0];
			for (int i = 1; i < len; i++) {
				a[i - 1] = a[i];
			}

			a[len - 1] = temp;
			key--;
		}
	}

	public static void rightRotate(int[] a, int len, int key) {
		while (key > 0) {
			int temp = a[len - 1];
			for (int i = len - 1; i > 0; i--) {
				a[i] = a[i - 1];
			}
			a[0] = temp;
			key--;
		}

	}

	public static void printArray(int[] a, int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(a[i]);
		}
	}

}
