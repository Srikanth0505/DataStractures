package LinearSearch;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = { 10, 23, 15, 8, 4, 3, 25, 30, 34, 2, 19 };
		int Position = 0;
		int item = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your no to find position....:");
		item = sc.nextInt();
		for (int i = 0; i < a.length; i++) {

			if (a[i] == item) {
				Position = i + 1;
				break;
			} else {
				Position = 0;
			}

		}
		if (Position != 0) {
			System.out.println("Position of your entered no is..:" + Position);
		} else {
			System.out.println("No Number found in given no arry");
		}

	}

}
