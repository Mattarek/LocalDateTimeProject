package current_2025.Map;

import java.util.EnumMap;

enum Day {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}

public class EnumMapExample {

	public static void main(final String[] args) {
		final EnumMap<Day, String> schedule = new EnumMap<>(Day.class);
		schedule.put(Day.MONDAY, "Trening");
		schedule.put(Day.FRIDAY, "Breakfast");
		schedule.put(Day.TUESDAY, "Learning");

		System.out.println(schedule);

		System.out.println(schedule.get(Day.MONDAY));
	}
}
