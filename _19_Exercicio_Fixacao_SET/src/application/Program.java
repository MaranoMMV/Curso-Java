package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Test;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Set<Test> set = new HashSet<>();

		for (int k = 1; k<=1; k++) {

			System.out.print("How many students for course A? ");
			int nA = scan.nextInt();
			for (int i = 1; i < nA + 1; i++) {
				System.out.print("Digite #" + i + ": ");
				int number = scan.nextInt();
				set.add(new Test(number));
			}
			System.out.print("How many students for course B? ");
			int nB = scan.nextInt();
			for (int i = 1; i < nB + 1; i++) {
				System.out.print("Digite #" + i + ": ");
				int number = scan.nextInt();
				set.add(new Test(number));
			}

			System.out.print("How many students for course C? ");
			int nC = scan.nextInt();
			for (int i = 1; i < nC + 1; i++) {
				System.out.print("Digite #" + i + ": ");
				int number = scan.nextInt();
				set.add(new Test(number));
			}
			
		}
		System.out.println("Total Students: " + set.size());
	}

}
