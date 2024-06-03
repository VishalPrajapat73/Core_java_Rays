package in.co.JavaStreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.regex.Pattern;


public class TestTask {
		public static void main(String[] args) {
			
//			List <Tassk> t = new ArrayList<>();
//			t.add(new Tassk("vishalprajapat73@gmail.com"));
//			t.add(new Tassk("vishalprajapat735@gmail.com"));
//			t.add(new Tassk("vishalprajapat73@gmailcom"));
//			t.add(new Tassk("vishalprajapat73@gmail"));
//			t.add(new Tassk("vishalprajapat73gmail.com"));
//			
//			int a[];
//			
//			 t.stream().map(e -> e.name).filter(e -> e.endsWith("@gmail.com"))
//					.distinct().collect(Collectors
//							.collectingAndThen(Collectors.toList(), e ->{Collections.shuffle(e);
//							return e.stream();
//							})).forEach(e -> {
//								System.out.println("Valid gmail is : "+e);
//							});
		
			
			// no is given 
			
			
				List<Tassk> t = new ArrayList<>();
				t.add(new Tassk("vishalprajapat98@gmail.com"));
				t.add(new Tassk("vishalprajapat@gmail.com"));
				t.add(new Tassk("vishalprajapat@gmailcom"));
				t.add(new Tassk("vishalprajapatgmail"));
				t.add(new Tassk("vishalprajapatgmail.com"));
				t.add(new Tassk("vishalprajapat@gmail.com")); // This one should be filtered out

				String gmailPattern = "^[A-Za-z0-9+_.-]+@gmail\\.com$";
				Pattern pattern = Pattern.compile(gmailPattern);

				t.stream().map(e ->e.name)
						.filter(e -> pattern.matcher(e).matches() && e.substring(0, e.indexOf('@')).matches(".*\\d."))
						.distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
							Collections.shuffle(e);
							return e.stream();
						})).forEach(e -> {
							System.out.println("Valid gmail is : " + e);
						});

			}
			
			
			
		}

