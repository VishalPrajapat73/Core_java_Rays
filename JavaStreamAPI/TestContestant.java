package in.co.JavaStreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestant {

	public static void main(String[] args) {
	List <Contestant> list = new ArrayList<>();	
	list.add(new Contestant("Vishal", "9171924263") );
	list.add(new Contestant("chetan", "6232637203") );
	list.add(new Contestant("nirmal", "9644405822") );
	list.add(new Contestant("nim", "919771924263") );
	list.add(new Contestant("vk", "9171997224263") );
	
		list.stream().map(e -> e.phone)
		.filter(e -> e.length()==10)
		.distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e ->{
			Collections.shuffle(e);
			return e.stream();
		})).limit(3).forEach(e -> {
			System.out.println("Valid Numbers : "+e);
		});
		
	}
	
	
	
	
}
