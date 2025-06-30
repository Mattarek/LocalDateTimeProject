package current_2025_czerwiec.Compare.project11;

import java.util.Arrays;
import java.util.Comparator;

public class CitiesComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		o1 = o1.toLowerCase(); // pass by value, nie wpływa na zawartosc
		o2 = o2.toLowerCase(); // pass by value, nie wpływa na zawartosc
		return o2.compareTo(o1);
	}
}
