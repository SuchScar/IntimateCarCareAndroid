package com.tool;

import java.util.Comparator;

import com.Entity.Car;

public class PinyinComparator implements Comparator<Car> {

	public int compare(Car o1, Car o2) {
		if (o1.getSortLetters().equals("@") || o2.getSortLetters().equals("#")) {
			return -1;
		} else if (o1.getSortLetters().equals("#")
				|| o2.getSortLetters().equals("@")) {
			return 1;
		} else {
			return o1.getSortLetters().compareTo(o2.getSortLetters());
		}
	}

}
