package tbo.calander;

import java.util.Scanner;

public class Calander {

	private static int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	// 윤년 Leap Month
	private static int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			return true;
		else
			return false;
	}

	public static int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year))
			return LEAP_MAX_DAYS[month - 1];
		else
			return MAX_DAYS[month - 1];
	}

	public static int switchCalander(int month) {
		switch (month) {
		case 2:
			return 28;
		case 4:
			return 30;
		case 6:
			return 30;
		case 9:
			return 30;
		case 11:
			return 30;
		default:
			return 31;
		}
	}

	public static void printCalander(int year, int month) {
		System.out.printf("    <<%4d년%3d월>>\n", year, month);
		System.out.println("SU MO TU WE TH FR SA");
		System.out.println("---------------------");

		int maxDay = getMaxDaysOfMonth(year, month);

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();

	}
}
