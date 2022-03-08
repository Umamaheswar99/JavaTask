package com.packages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsEx {

	public static void main(String[] args) {
		List<Integer> numbers1 = List.of(12, 10, 14, 16, 22, 27, 50, 78, 88, 90);
		List<Integer> numbers2 = new ArrayList<>(numbers1);

		numbers2.add(45);
		numbers2.add(65);

		// Set
		Set<Integer> setNumber1 = new HashSet<>(numbers2);
		Set<Integer> setNumber2 = new LinkedHashSet<>(numbers2);
		TreeSet<Integer> setNumber3 = new TreeSet<>(numbers2);
		System.out.println(setNumber1);
		System.out.println(setNumber2);
		System.out.println(setNumber3);
		System.out.println(setNumber3.floor(27));
		System.out.println(setNumber3.lower(27));
		System.out.println(setNumber3.ceiling(27));
		System.out.println(setNumber3.higher(27));
		System.out.println(setNumber3.subSet(27, 88));
		System.out.println(setNumber3.subSet(27, true, 88, true));

		// Queue
		Queue<Integer> queueNum = new PriorityQueue<>();
		queueNum.addAll(numbers1);
		System.out.println(queueNum);
		queueNum.poll();
		System.out.println(queueNum);
		Iterator<Integer> iterator = queueNum.iterator();
		int sum = 0;
		while (iterator.hasNext()) {
			sum = sum + (iterator.next());
		}
		System.out.println(sum);
	}
}

