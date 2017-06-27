package org.fleni.cda.process.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PartitionList {

	public static void main(String[] args) {
//		List<String> list = Arrays.asList("1f", "2e", "3ss", "4d", "5fgd", "dd6", "7ss", "8d", "9b", "10g", "1f1", "1g2", "13r", "14e");
		List<String> list = new ArrayList<>();
		for(int i=0; i < 8100100; i++){
			list.add("awser3e45r2a" + i);
		}
//		System.out.println("By 3:");
//		batches(list, 3).forEach(System.out::println);
//
//		System.out.println("By 4:");
//		batches(list, 4).forEach(System.out::println);
		
		Stream<List<String>> f = batches(list, 1000);
		List<List<String>> l = f.collect(Collectors.toList());
		System.out.println("list sizes " + l.size());

	}

	public static <T> Stream<List<T>> batches(List<T> source, int length) {
		if (length <= 0)
			throw new IllegalArgumentException("length = " + length);
		int size = source.size();
		if (size <= 0)
			return Stream.empty();
		int fullChunks = (size - 1) / length;
		return IntStream.range(0, fullChunks + 1)
				.mapToObj(n -> source.subList(n * length, n == fullChunks ? size : (n + 1) * length));
	}

}
