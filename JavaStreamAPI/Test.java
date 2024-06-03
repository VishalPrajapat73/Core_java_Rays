package in.co.JavaStreamAPI;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main (String [] args) {
	
//		List<String> l  =  Arrays.asList("ViShal","Shal","Sinchan");
//		Stream<Integer> s = l.stream();
		
//		l.stream().map(e -> e.toLowerCase()).forEach(e ->{
//			System.out.println(e);
//		});
		
//		l.stream().filter(e -> e.startsWith("S")).distinct().map(e -> e.toUpperCase()).sorted().forEach(e -> {
//			System.out.println(e);
//		});
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		Object square = number.stream().map(v->v*v).collect(Collectors.toList());

		
		
		
//		List<Integer> number = Arrays.asList(2,3,4,5);
//		Object square = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		
//		System.out.println(square);
		
	}
}
