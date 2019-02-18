package linklist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UserLinkedList {

	public static void main(String[] args) {
	
		List<String> list = new  LinkedList<String>();
		list.add("ny");
		list.add("fl");
		list.add("dc");
		list.add("ca");
		
		Iterator it = list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}
