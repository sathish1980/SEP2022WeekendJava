package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Listinterface {
	
	//String ar= {"sathish","kumar","R"};
	
	public void listimplementation()
	{
		//ArrayList<String> ar = new ArrayList<String>();
		LinkedList<String> ar = new LinkedList<String>();
		ar.add("sathish");
		ar.add("kumar");
		ar.add("R");
		ar.add("sathish");
		ar.add("B.tech");
		ar.remove(2);
		ar.set(3, "B.TECH");
		
		System.out.println(ar);
		for(String eachvar:ar)
		{
			System.out.println(eachvar);
		}
		// or
		Iterator it =ar.iterator();
		while(it.hasNext())
		{
			String name =it.next().toString();
			//System.out.println(it.next());
			if (name.contains("sat"))
			{
				System.out.println(name);
			}
		}
		//ar.clear();
		System.out.println(ar);
		ar.add(2, "beasnt");
		System.out.println(ar);
		System.out.println(ar.isEmpty());
		
		
	}
	
	public void setimplementation()
	{
		//HashSet<String> ar = new HashSet<String>();
		//LinkedHashSet<String> ar = new LinkedHashSet<String>();
		TreeSet<Object> ar = new TreeSet<Object>();
		ar.add("sathish");
		ar.add("kumar");
		ar.add("R");
		ar.add("sathish");
		ar.add("B.tech");
		ar.add("");
		ar.remove("R");
		ar.add(23);
		//ar.set(3, "B.TECH");
		System.out.println(ar);
		for(Object eachvar:ar)
		{
			System.out.println(eachvar);
		}
		// or
		Iterator it =ar.iterator();
		while(it.hasNext())
		{
			String name =it.next().toString();
			//System.out.println(it.next());
			if (name.contains("sat"))
			{
				System.out.println(name);
			}
		}
		//ar.clear();
		System.out.println(ar);
		//ar.add(2, "beasnt");
		System.out.println(ar);
		System.out.println(ar.isEmpty());
		
		
	}
	
	public void mapimplementation()
	{
		//HashMap<String,String> ar = new HashMap<String,String>();
		//LinkedHashMap<String,String> ar = new LinkedHashMap<String,String>();
		TreeMap<String,String> ar = new TreeMap<String,String>();
		ar.put("z", "zebra");
		ar.put("d", "Deer");
		ar.put("c", "Cat");
		ar.put("l", "Lion");
		ar.put("d", "Dog");
		ar.put("e", "Dog");
		ar.remove("c");
		System.out.println(ar);
		System.out.println(ar.get("z"));
		//ar.replace("l", "Tiger");
		ar.replace("l", "lion","Tiger");
		System.out.println(ar);
		System.out.println(ar.keySet());
		System.out.println(ar.values());
		for(String e:ar.keySet())
		{
			System.out.println(ar.get(e));
		}
		
		for(Map.Entry m:ar.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
		System.out.println(ar.containsKey("z"));
		System.out.println(ar.isEmpty());
	}
	
	public static void main(String[] args)
	{
		Listinterface L = new Listinterface();
		L.mapimplementation();
	}

}
