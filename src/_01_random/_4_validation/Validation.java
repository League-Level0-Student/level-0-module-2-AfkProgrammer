//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		for (int randomNumber = 0; randomNumber < 11; randomNumber++) {

			int random = randomMaker.nextInt(6);

			// 1. Use each value of randomNumber to give the user a random compliment.
			if (random == 0) {
				System.out.println("You are cool.");
			} else if (random == 1) {
				System.out.println("You are very smart.");
			} else if (random == 2) {
				System.out.println("You are a good public speaker");
			} else if (random == 3) {
				System.out.println("You make good food.");
			} else if (random == 4) {
				System.out.println("You are very joyfull");
			} else if (random == 5) {
				System.out.println("You are funny");
			}

			// 2. Repeat all the code above 10 times

			// 3. Find someone to test out your program. They will like it :)
		}
	}
}
