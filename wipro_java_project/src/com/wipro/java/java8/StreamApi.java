package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamApi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(2,5,8,6,7);
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedNumbers);
		
		List<Integer> numbers1 = Arrays.asList(6,8,7,2,4);
		int min = numbers1.stream().min(Integer::compare).get();
		int max = numbers1.stream().max(Integer::compare).get();
		
		System.out.println(numbers1);
		System.out.println(min);
		System.out.println(max);

	}

}

