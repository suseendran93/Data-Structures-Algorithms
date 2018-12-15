package datastructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GraphV1 {
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Character> setA=new HashSet<>();
		Set<Character> setB=new HashSet<>();
		Set<Character> setC=new HashSet<>();
		Set<Character> setD=new HashSet<>();
		
		setA.add('A');
		setA.add('B');

		setB.add('C');
		
		setC.add('D');
		
		setD.add('B');
		setD.add('C');
		Map<Character, Set> map = new HashMap<>();
		map.put('A', setA);
		map.put('B', setB);
		map.put('C', setC);
		map.put('D', setD);
		
		Set<Entry<Character, Set>> entrySet = map.entrySet();
		for (Entry<Character, Set> entry : entrySet) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		

	}

}
