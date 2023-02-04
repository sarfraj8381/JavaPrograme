package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<>();
		list.add(10);
		list.add(null);
		list.add("hi");
		list.add(30);
		list.add(null);
		list.add(10);
		System.out.println(list);
		
		list.add(2,"hello");//in index add the value
		System.out.println(list);
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(30);
		list1.add(50);
		list1.add(70);
		
		System.out.println(list1);
		
		java.util.Collections.sort(list1);
		System.out.println(list1);
		
		list1.addAll(list1);//it will add list and list1
		System.out.println(list);
		
		if(list.contains("hi"))//used to check object is present or not
		{
			System.out.println("hi is present");
		}
		else {
			System.out.println("hi is not present");
		}
		System.out.println(list.remove(2));
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		System.out.println(list.size());

		System.out.println("==========================================================");
	
		
		LinkedList<Object> list2=new LinkedList<>();
		list2.add(10);
		list2.add(20);
		list2.add("hi");
		list2.add(10);
		list2.add(null);
		list2.add(null);
		
		System.out.println(list2);
		list2.add(2,"hello");//add the value to index 2
		System.out.println(list2);
		
		list2.addFirst("good");//add an item to the beginning to the list
		list2.addLast("bye");//add an item to the end to the list
		
		 System.out.println(list2);
		
		list2.remove(1);//it will remove the element in the index 1
		list2.removeFirst();//
		list2.removeLast();
		System.out.println(list2.get(4));
		System.out.println(list2.getFirst());
		System.out.println(list2.getLast());
		
		System.out.println("=====================================================");
		HashSet<Object> set=new HashSet<>();
		set.add(10);
		set.add("hi");
		set.add(10);
		set.add(null);
		set.add(null);
		set.add(20);
		set.add("hello");
		set.add(30);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("hi"));
		System.out.println(set.isEmpty());
		System.out.println(set.remove(10));
		
		Iterator<Object> i= set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		ArrayList<Object> list3=new ArrayList<>(set);
		System.out.println(list.get(1));
		System.out.println(list3);

		System.out.println("==========================================================");
	
		
		TreeSet<Integer> set1=new TreeSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(5);
		set1.add(15);
		set1.add(30);

		System.out.println("==========================================================");
	
		Hashtable<Integer, String> map=new Hashtable<>();
		map.put(10,"hello");
		map.put(20,"hi");
		map.put(null,"sarfraj");
		map.put(49,"hello");
		map.put(30,"hello");
		map.put(29,"hello");
		map.put(25,"hello");
		

		System.out.println("==========================================================");
	
		
		HashMap<Integer, String> map1=new HashMap<>();
		map1.put(10,"hi");
		map1.put(20,"hello");
		map1.put(null,"bye");
		map1.put(null,"bye");
		map1.put(30,null);
		map1.put(26,null);
		map1.put(10,"hi");
		map1.put(40,"hi");
		
		System.out.println(map1);
		
		map1.remove(20);
		System.out.println(map1);
		map1.replace(20,"sarfraj");
		System.out.println(map1);
		
		for(Entry<Integer, String> m:map1.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		

		System.out.println("==========================================================");
	
		
		LinkedHashMap<Integer, String> map2=new LinkedHashMap<>();
		map2.put(10,"hi");
		map2.put(20,"hello");
		map2.put(null,"bye");
		map2.put(null,"bye");
		map2.put(30,null);
		map2.put(26,null);
		map2.put(10,"hi");
		map2.put(40,"hi");
		
		System.out.println(map2);
		
		map2.remove(20);
		System.out.println(map2);
		map2.replace(20,"ahmad");
		System.out.println(map2);
		
		for(Entry<Integer, String> m:map2.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		

		System.out.println("==========================================================");
	
		
		TreeMap<Integer, String> map3=new TreeMap<>();
		map3.put(100,"hi");
		map3.put(60,"hello");
		
		map3.put(90,null);
		map3.put(30,null);
		map3.put(101,"hi");
		System.out.println(map3);
		
	}

}
