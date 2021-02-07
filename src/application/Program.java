package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("How many studants for course A: ");
		int qtyA = sc.nextInt();
		
		Set <Integer> set = new HashSet<>();
		
		for (int i = 1 ; i <= qtyA ; i++) {
			set.add(sc.nextInt());
		}

		System.out.print("How many studants for course B: ");
		int qtyB = sc.nextInt();
		
		for (int i = 1 ; i <= qtyB ; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.print("How many studants for course C: ");
		int qtyC = sc.nextInt();
		
		for (int i = 1 ; i <= qtyC ; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.println("Total students: " + set.size());
		sc.close();
	}

}
