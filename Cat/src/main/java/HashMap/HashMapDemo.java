package HashMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//Stream:-
public class HashMapDemo {

	public static void main(String[] args) {
		//how to create hashmap
		Map<String,String> m = new HashMap<String,String>();
		//how to add key value pair to hashMap
		m.put("name",null);
		m.put("emaile","aa@gmail.com");
		m.put("password","Sra");
		m.put("address","Ongole");
		//how to retrive key and value
		Set ll = m.entrySet();
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			Entry mm=(Map.Entry)it.next();
			System.out.println(mm.getKey()+"    "+mm.getValue());
		}
		System.out.println("value of username is "+m.get("name"));
		
		Map<String,String> m1 = new Hashtable<String,String>();
		m.put("name",null);
		m.put("emaile","aa@gmail.com");
		m.put("password","Sra");
		m.put("address","Ongole");
		System.out.println("value of username is "+m.get("name"));

	}

}
