package practice;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(2);
		ll.add(4);
		ll.add(7);
		ll.add(23);
		ll.add(28);
		ll.add(21);
		ll.parallelStream().filter(a->a>10).filter(b->b%7==0).forEach(s->System.out.println(s));
		

	}

}
