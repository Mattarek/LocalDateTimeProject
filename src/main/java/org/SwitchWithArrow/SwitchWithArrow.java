package org.SwitchWithArrow;

public class SwitchWithArrow {
	public static void main(final String[] args) {
		final String day = "Wednesday";
		switch (day) {
			case "Monday" -> System.out.println("Monday");
			case "Tuesday" -> System.out.println("Tuesday");
			case "Wednesday" -> System.out.println("Wednesday");
			case "Thursday" -> System.out.println("Thursday");
			case "Friday" -> System.out.println("Friday");
			case "Saturday" -> System.out.println("Saturday");
			case "Sunday" -> System.out.println("Sunday");
		}
	}
}
