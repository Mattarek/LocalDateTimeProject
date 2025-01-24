package org.Collections.courseList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCourse {
	public static void main(final String[] args) {
		// LinkedList implementuje List i Dequeue,a dequeue implementuje
		// z queue, więć jest mieszanką listy i kolejki

		// W LinkedList każdy element wie (ma zmienna gdzie wie) co jest
		// jego elementem poprzednim i następnym

		// Mamy też doubleLinkedList (mam podwójnie i pojedynczo linkowane LinkedList,
		// w podwójnych, element zna poprzedni i natępny element więc jesteśmy w stanie z każdego elementu się cofnać
		// lub pójśc do przodu, a w pojedynczo linkowanej LinkedLiscie, kazdy element wie tylko i wylacznie,
		// kogo ma przed soba ale nie wie kogo ma za soba.

		// Jakie to ma dla nas znaczenie: aby wziąć czwarty element, LinkedLista aby wziąć czwarty element
		// będzie musiała wziąc pierwszy drugi i trzeci element, aby dopiero dostać się do czwartego. Tak więc
		// nie mamy dostępu bezpośrednio do 4 elementu, za pomocą metody get.

		// LinkedList vs ArrayList
		final List<String> listLinkedList = new LinkedList<>();
		listLinkedList.add("Warsaw");
		listLinkedList.add("Grańsk");
		listLinkedList.add("Wrocław");
		System.out.println(listLinkedList);

		final Deque<String> dequeLinkedList = new LinkedList<>();
		dequeLinkedList.add("Wrocław");
		dequeLinkedList.addFirst("Gdańsk");
		dequeLinkedList.addLast("Warsaw");
		dequeLinkedList.add("Poznan");
		System.out.println(dequeLinkedList);
		System.out.println(listLinkedList.get(2));
	}
}
