package com.hcl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {    
		List<String> names = new ArrayList<String>();
		names.add("kavi");
		names.add("kiran");
		names.add("sukanya");
		names.add("madhav");
			
		names.forEach(str->System.out.println(str));
		
		 
		long count = names.stream().filter(str->str.length()>5 && str.length() < 8).count();
		System.out.println("There are "+count+" strings with length less than 5");

		List<String> startswith = names.stream().filter(k->k.startsWith("k")).collect(Collectors.toList());
		System.out.println(startswith);

		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
		
		List<String> sort =names.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		
	   }  
}
