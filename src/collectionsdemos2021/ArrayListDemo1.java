package collectionsdemos2021;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		//Declare ArrayList
		//ArrayList al= new ArrayList();
		//Declare Homogenous data
		//ArrayList <Integer> al= new ArrayList  <Integer>();
		//ArrayList <String> al = new ArrayList <String>();
		// List al= new ArrayList();
		
		// Add new elements to the ArrayList
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
//		System.out.println(al);
		System.out.println("Elements before removal: " + al);
		System.out.println("Element to remove: " + al.remove(2));
		System.out.println("Elements after removal: " + al);
		
		al.add(2,"python" );
		System.out.println("after insertion:"+al);
		al.contains("python");
		System.out.println(al.contains("python"));
		
		//1) for loop
		System.out.println("Reading elements using for loop");
		//for(int i=0; i < al.size(); i++) {
			//System.out.println(al.get(i));
			for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		
		
	}

}
