package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.Practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
	public static void main(final String[] args) {
		final List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);

		integerList.stream()
				.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(integerList);

		final Integer ints = integerList.stream()
				.reduce(0, Integer::sum);
		System.out.println(ints);

		final int size = integerList.size();
		System.out.println(size);
		final long sizes = integerList.stream().count();
		System.out.println(sizes);

		final List<Integer> list = integerList.stream().map(e -> e * 2).toList();
		System.out.println(list);
	}
}
