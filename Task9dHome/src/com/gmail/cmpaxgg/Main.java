package com.gmail.cmpaxgg;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);

		Deque<String> labRats = new ArrayDeque<>();

		labRatsList(labRats);

		System.out.println("Guys before drink supercoke:");
		System.out.println(labRats + System.lineSeparator());
		System.out.print("Enter number glass of coke:" + System.lineSeparator());
		int n = sc.nextInt();

		afterDrinkDoubleCola(labRats, n);

		System.out.println("Guys after drink supercoke:");
		System.out.println(labRats);
		System.out.println("It's just joke:)))))");
	}

	public static void labRatsList(Deque<String> labRats) {
		labRats.addLast("Sheldon");
		labRats.addLast("Leonard");
		labRats.addLast("Volovitc");
		labRats.addLast("Kutrapalli");
		labRats.addLast("Penny");
	}

	public static void afterDrinkDoubleCola(Deque<String> labRats, int n) {
		for (int i = 0; i < n; i++) {
			labRats.addLast(labRats.peekFirst());
			labRats.addLast(labRats.pollFirst());
		}
	}
}
