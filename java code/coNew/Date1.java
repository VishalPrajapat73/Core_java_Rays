package in.coNew;

import java.time.LocalDate;
//import java.sql.Date;
import java.util.*;
//import java.text.SimpleDateFormat;

public class Date1 {
	public static void main(String [] args) {
//		Date d = new Date(10);
//		SimpleDateFormat Format = new SimpleDateFormat("dd/MM/yyyy");
//		String str = Format.format(d);
//		System.out.println(str);
//		
//		String str1 = "22/03/2009";
//		Date d1 = Format.parse(str1);
		
//		Date d = new Date();
//		System.out.println(d);
		int birth = ;
		LocalDate current = LocalDate.now();
		int CurrentYear = current.getYear();
		int age = CurrentYear-birth;
		System.out.println(age);
		
	}
}
