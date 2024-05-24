package in.co.Collections;

import java.util.Iterator;
import java.util.Stack;

public class StackTest {
	public static void main (String [] args) {
		
		Stack s = new Stack();
		s.push("V");
		s.push(1000);
		s.push("Vishal");
		
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.push(20000));
		System.out.println(s);
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}
}
