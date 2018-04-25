package Lesson9I_3;

import java.util.stream.Stream;

final public class Pair<S, T> {
	Pair(S f, T t) {
		first = f;
		second = t;
	}

	S first;
	T second;
}