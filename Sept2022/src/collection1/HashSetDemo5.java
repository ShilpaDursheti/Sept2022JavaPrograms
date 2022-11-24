package collection1;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo5 {

	public static void main(String[] args) {
	
	HashSet<String> Set = new HashSet <String>();
	
	Set.add("Python");
	Set.add("Java");
	Set.add("C#");
	
	ArrayList<String>List = new ArrayList<String>();
	
	List.addAll(Set);
	List.add(2,"linux");
	System.out.println(Set);
	System.out.println(List);
	
	System.out.println(List.get(1));
	HashSet<String> Set1 = new HashSet <String>(List);//List to HashSet
	
	System.out.println(Set1);
}
}
